package org.gs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/video")
public class AppResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String video() {
        return "this should be a video";
    }
}