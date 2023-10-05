package dev.rpmhub;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class Start {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy";
    }

    @POST
    @Path("/kmh2mih/{kmh}")
    @Produces(MediaType.TEXT_PLAIN)
    public String kmh2mih(@PathParam("kmh") String km) {
        return Double.valueOf(km) * 0.621371;
    }

    @GET
    @Path("/no2kmh/{node}")
    @Produces(MediaType.JSON)
    public String no2kmh(@PathParam("node") String node) {
        return Double.valueOf(node) * 1.852;
    }

}
