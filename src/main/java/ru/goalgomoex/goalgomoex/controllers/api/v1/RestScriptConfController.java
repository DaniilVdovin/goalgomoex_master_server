package ru.goalgomoex.goalgomoex.controllers.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.goalgomoex.goalgomoex.core.GoTools;
import ru.goalgomoex.goalgomoex.entitys.dto.dtoMessage;
import ru.goalgomoex.goalgomoex.entitys.goScriptConfig;
import ru.goalgomoex.goalgomoex.services.GoConfService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/conf")
public class RestScriptConfController {
    @Autowired private GoConfService goConfService;
    @GetMapping("/list")
    public List<goScriptConfig> list(@RequestParam("service") String service){
        if(service == null || service.isEmpty()) return goConfService.list();
        return goConfService.listForService(service);
    }
    @GetMapping("/get")
    public goScriptConfig get(@RequestParam("id") long id){
        return goConfService.Get(id);
    }
    @PostMapping("/add")
    public dtoMessage addConf(@RequestBody goScriptConfig config){
        goConfService.createOrUpdate(
                config
                        .setVersion(0)
                        .setGUID(GoTools.GenerateGUID()));
        return new dtoMessage("INFO","Add new config");
    }
}
