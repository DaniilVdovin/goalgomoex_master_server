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
            for (:moexSecurities.getData()) {

            }

            goTicketRepository.saveAll(tickets);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
