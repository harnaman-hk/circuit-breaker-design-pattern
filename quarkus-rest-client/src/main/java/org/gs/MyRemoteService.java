package org.gs;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;
import java.util.Set;

/**
 * To use it via injection.
 *
 * {@code
 *     @Inject
 *     @RestClient
 *     MyRemoteService myRemoteService;
 *
 *     public void doSomething() {
 *         Set<MyRemoteService.Extension> restClientExtensions = myRemoteService.getExtensionsById("io.quarkus:quarkus-rest-client");
 *     }
 * }
 */
@RegisterRestClient(baseUri = "http://localhost:9000")
public interface MyRemoteService {

    @GET
    @Path("/video")
    Set<Extension> getExtensionsById(@QueryParam("id") String id);

    class Extension {
        public String id;
        public String name;
        public String shortName;
        public List<String> keywords;
    }
}
