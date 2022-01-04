package com.nord.coviddata.service;

import com.nord.coviddata.dto.CovidApiData;
import com.nord.coviddata.dto.StateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class Covid19DataServiceCall {

    final String url = "https://api.rootnet.in/covid19-in/stats/latest";

    @Autowired
    RestTemplate restTemplate;

    StateData getStateData(String state){
        CovidApiData covidApiData = restTemplate.getForObject(url, CovidApiData.class);

        for( StateData stateData1 : covidApiData.getData().getRegional()){

            if(stateData1.getLoc().equalsIgnoreCase(state)) {
                return stateData1;
            }
        }
        return  new StateData();

//    Using java 8 filter
//        Arrays.stream(covidApiData.getData().getRegional())
//                .filter(e -> e.getLoc().equalsIgnoreCase(state))
//                .findAny()
//        .orElse(new StateData());

    }
}
