package com.finnsoft.denunciaTaxi.domain;

import java.util.Collection;

/**
 * Created by fdelatorre on 7/5/15.
 */
public class Taxi {
    private String plate;

    public Taxi(String plate) {
        this.plate = plate;
    }

    public String getHistoryAsResource() {
        return String.format("%s/history", plate);
    }

    public Collection<Event> getHistory() {
        return null;
    }

    public String getPlate(){
        return plate;
    }
}
