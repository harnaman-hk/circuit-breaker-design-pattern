package org.gs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.CircuitBreaker;


@Path("/video")
public class AppResource {

    @RestClient
    AppClient client;

    @GET
    @Fallback(fallbackMethod = "fallbackMessage")
    @CircuitBreaker(
        requestVolumeThreshold=5,
        failureRatio=0.6,
        delay = 3000
        // successThreshold=2
    )
    public String video() {
        // return "this should be a video";
        return client.get();
    }

    private String fallbackMessage() {
        return "Fallback Message";
    }
}