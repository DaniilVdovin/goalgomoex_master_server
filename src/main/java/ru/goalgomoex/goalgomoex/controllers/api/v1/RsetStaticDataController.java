package ru.goalgomoex.goalgomoex.controllers.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.goalgomoex.goalgomoex.entitys.dto.dtoValueDV;
import ru.goalgomoex.goalgomoex.entitys.goDuration;
import ru.goalgomoex.goalgomoex.entitys.goTicket;
import ru.goalgomoex.goalgomoex.repository.GoDurationRepository;
import ru.goalgomoex.goalgomoex.repository.GoTicketRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/data/lists")
public class RsetStaticDataController {
    @Autowired private GoTicketRepository goTicketRepository;
    @Autowired private GoDurationRepository goDurationRepository;
    @GetMapping("/securities")
    public List<goTicket> getSecurities(){
        return goTicketRepository.findAll();
    }
    @GetMapping("/durations")
    public List<goDuration> getDurations(){
        return goDurationRepository.findAll();
    }
    @GetMapping("/simple/securities")
    public List<String> getSimpleSecurities(){
        List<String> strings = new ArrayList<>();
        for (goTicket d:goTicketRepository.findAll()) {
            strings.add(d.getSECID());
        }
        return strings;
    }
    @GetMapping("/simple/durations")
    public List<String> getSimpleDurations(){
        List<String> strings = new ArrayList<>();
        for (goDuration d:goDurationRepository.findAll()) {
            strings.add(d.getHint());
        }
        return strings;
    }
}
