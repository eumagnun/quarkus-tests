package br.com.danielamaral;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;


@Path("/api")
public class GreetingResource {

   @ConfigProperty(name = "greeting.text") 
   String text;

    @GET
    @Path("/test2")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2() {
        return text;
    }

    @GET
    @Path("/test1")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy Daniel";
    }
}
