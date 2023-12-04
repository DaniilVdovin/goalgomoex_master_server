package ru.goalgomoex.goalgomoex.services;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.goalgomoex.goalgomoex.entitys.dto.dtoMoexMarkets;
import ru.goalgomoex.goalgomoex.entitys.dto.dtoMoexSecurities;
import ru.goalgomoex.goalgomoex.entitys.goTicket;
import ru.goalgomoex.goalgomoex.repository.GoTicketRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Component
public class ScheduleUpdateService {
    public static String URL_securities = "https://iss.moex.com/iss/engines/stock/markets/shares/boards/TQBR/securities.json";
    @Autowired private GoTicketRepository goTicketRepository;
    @Scheduled(cron = "@daily")
    @Async
    public void UpdateSecurities(){
        try (InputStream input = new URL(URL_securities).openStream()) {
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(isr);
            Gson gson = new Gson();
            dtoMoexMarkets moexMarkets = gson.fromJson(reader, dtoMoexMarkets.class);
            dtoMoexSecurities moexSecurities = moexMarkets.getSecurities();
            List<goTicket> tickets = new ArrayList<>();
            for (ArrayList<Object> row:moexSecurities.getData()) {
                tickets.add(new goTicket((String) row.get(0), (String) row.get(1), (String) row.get(2), (Double) row.get(3), (Integer) row.get(4), (Double) row.get(5), (String) row.get(6), (String) row.get(7), (Integer) row.get(8),
                        (String) row.get(9), (String) row.get(10), (String) row.get(11), (String) row.get(12), (String) row.get(13), (Double) row.get(14),(Double) row.get(15), (String) row.get(16), (Date) row.get(17), (Integer) row.get(18),
                        (String) row.get(19),(String) row.get(20), (String) row.get(21), (Double) row.get(22),(String) row.get(23), (String) row.get(24),(Integer) row.get(25), (Date) row.get(26)));
            }
            goTicketRepository.saveAll(tickets);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
