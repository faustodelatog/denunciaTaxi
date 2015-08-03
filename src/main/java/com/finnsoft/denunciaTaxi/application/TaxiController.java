package com.finnsoft.denunciaTaxi.application;

import com.finnsoft.denunciaTaxi.TaxiRepositoryMemory;
import com.finnsoft.denunciaTaxi.domain.Event;
import com.finnsoft.denunciaTaxi.domain.Taxi;
import com.finnsoft.denunciaTaxi.domain.TaxiRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.Collection;

/**
 * Created by fdelatorre on 7/5/15.
 */
@Path("/taxis")
public class TaxiController {

    private TaxiRepository repository;

    public TaxiController() {
        this.repository = new TaxiRepositoryMemory();
    }

    @GET
    @Path("/{plate}")
    @Produces("application/json")
    public Taxi getTaxi(@PathParam("plate") String plate){
        return repository.find(plate);
    }

    @GET
    @Path("/{plate}/history")
    @Produces("application/json")
    public Collection<Event> getTaxiHistory(@PathParam("plate") String plate) {
        return repository.find(plate).getHistory();
    }

    public void setRepository(TaxiRepository repository) {
        this.repository = repository;
    }
}
