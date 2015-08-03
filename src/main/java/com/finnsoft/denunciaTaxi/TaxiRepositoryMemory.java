package com.finnsoft.denunciaTaxi;

import com.finnsoft.denunciaTaxi.domain.Taxi;
import com.finnsoft.denunciaTaxi.domain.TaxiRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fdelatorre on 7/5/15.
 */
public class TaxiRepositoryMemory implements TaxiRepository {

    private Map<String, Taxi> taxis;

    public TaxiRepositoryMemory() {
        taxis = new HashMap<>();
        taxis.put("abc1", new Taxi("abc1"));
        taxis.put("abc2", new Taxi("abc2"));
        taxis.put("abc3", new Taxi("abc3"));
        taxis.put("abc4", new Taxi("abc4"));
    }

    @Override
    public Taxi find(String plate) {
        return taxis.get(plate);
    }
}
