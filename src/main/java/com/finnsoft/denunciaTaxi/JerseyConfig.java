package com.finnsoft.denunciaTaxi;

import com.finnsoft.denunciaTaxi.application.TaxiController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by fdelatorre on 7/5/15.
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(TaxiController.class);
    }

}