package com.finnsoft.denunciaTaxi.domain;

/**
 * Created by fdelatorre on 7/5/15.
 */
public interface TaxiRepository {

    public Taxi find(String plate);
}
