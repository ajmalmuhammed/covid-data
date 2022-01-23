package com.nord.coviddata.controller;

import com.nord.coviddata.dto.StateData;
import com.nord.coviddata.service.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CovidDataController {


    @Autowired
    CovidDataService covidDataService;

    @GetMapping("india/{state}")
    public String getData(@PathVariable String state, Model model){
         StateData stateData = covidDataService.getStateSpecificData(state);
         model.addAttribute(stateData);
         return "statewise-data";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "<h1> Hello Admin</h1>";
    }

    @GetMapping("/")
    public String getHome(){
        return "home";
    }
}
