package com.nord.coviddata.dto;

public class SummaryData {

    private int total;
    private int confirmedCasesIndian;
    private int confirmedCasesForeign;
    private int discharged;
    private int death;
    private int confirmedButLocationUnidentified;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getConfirmedCasesIndian() {
        return confirmedCasesIndian;
    }

    public void setConfirmedCasesIndian(int confirmedCasesIndian) {
        this.confirmedCasesIndian = confirmedCasesIndian;
    }

    public int getConfirmedCasesForeign() {
        return confirmedCasesForeign;
    }

    public void setConfirmedCasesForeign(int confirmedCasesForeign) {
        this.confirmedCasesForeign = confirmedCasesForeign;
    }

    public int getDischarged() {
        return discharged;
    }

    public void setDischarged(int discharged) {
        this.discharged = discharged;
    }

    public int getDeath() {
        return death;
    }

    public void setDeath(int death) {
        this.death = death;
    }

    public int getConfirmedButLocationUnidentified() {
        return confirmedButLocationUnidentified;
    }

    public void setConfirmedButLocationUnidentified(int confirmedButLocationUnidentified) {
        this.confirmedButLocationUnidentified = confirmedButLocationUnidentified;
    }



}
