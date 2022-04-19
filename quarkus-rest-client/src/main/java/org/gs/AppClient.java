package org.gs;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/video")
@RegisterRestClient
public interface AppClient {
    @GET
    String get();
}
