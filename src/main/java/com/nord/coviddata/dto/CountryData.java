package com.nord.coviddata.dto;

public class CountryData {
    SummaryData summary;
    StateData[] regional;

    public SummaryData getSummary() {
        return summary;
    }

    public void setSummary(SummaryData summary) {
        this.summary = summary;
    }

    public StateData[] getRegional() {
        return regional;
    }

    public void setRegional(StateData[] regional) {
        this.regional = regional;
    }
}
