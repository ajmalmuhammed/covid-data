package com.nord.coviddata.controller;

import com.nord.coviddata.dto.StateData;
import com.nord.coviddata.service.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidDataController {


    @Autowired
    CovidDataService covidDataService;

    @GetMapping("/india/{state}")
    public StateData getData(@PathVariable String state){
         StateData stateData = covidDataService.getStateSpecificData(state);
      return stateData;
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "<h1> Hello Admin</h1>";
    }
}
