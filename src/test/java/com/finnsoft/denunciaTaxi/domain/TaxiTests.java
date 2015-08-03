package com.finnsoft.denunciaTaxi.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by fdelatorre on 7/5/15.
 */
public class TaxiTests {

    @Test
    public void taxiShouldHasHistoryAsResource(){
        Taxi taxi = new Taxi("ABC123");
        assertThat(taxi.getHistoryAsResource(), equalTo("ABC123/history"));
    }

}
