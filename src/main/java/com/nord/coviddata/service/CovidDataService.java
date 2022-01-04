package com.nord.coviddata.service;

import com.nord.coviddata.dto.StateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class CovidDataService {

    @Autowired
    Covid19DataServiceCall covid19DataServiceCall;


    public StateData getStateSpecificData(String state){
        StateData stateData = covid19DataServiceCall.getStateData(state);
        System.out.println("This is the data");
        System.out.println(stateData.getLoc());
        return stateData;
    }
}
