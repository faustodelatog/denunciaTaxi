package com.finnsoft.denunciaTaxi.application;

import com.finnsoft.denunciaTaxi.domain.Taxi;
import com.finnsoft.denunciaTaxi.domain.TaxiRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by fdelatorre on 7/5/15.
 */
public class TaxiControllerTest {

    @Mock
    private TaxiRepository repository;

    @Before
    public void setUp(){
        initMocks(this);
    }

    @Test
    public void shouldLoadTaxiGivenAPlate(){
        String plate = "ABC123";

        TaxiController controller = new TaxiController();
        controller.setRepository(repository);

        Taxi taxi = new Taxi(plate);
        when(repository.find(plate)).thenReturn(taxi);

        assertThat(controller.getTaxi(plate), equalTo(taxi));
    }
}
