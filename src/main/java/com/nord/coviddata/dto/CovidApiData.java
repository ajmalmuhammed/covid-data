package com.nord.coviddata.dto;

import java.time.ZonedDateTime;

public class CovidApiData {

    private boolean success;
    private CountryData data;
    private ZonedDateTime lastRefreshed;
    private ZonedDateTime lastOriginUpdated;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public CountryData getData() {
        return data;
    }

    public void setData(CountryData data) {
        this.data = data;
    }

    public ZonedDateTime getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(ZonedDateTime lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public ZonedDateTime getLastOriginUpdated() {
        return lastOriginUpdated;
    }

    public void setLastOriginUpdated(ZonedDateTime lastOriginUpdated) {
        this.lastOriginUpdated = lastOriginUpdated;
    }
}
