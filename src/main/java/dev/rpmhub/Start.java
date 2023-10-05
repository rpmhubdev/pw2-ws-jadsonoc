package dev.rpmhub;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class Start {


    @POST
    @Path("/km2miles/{km}")
    @Produces(MediaType.TEXT_PLAIN)
    public String km2miles(@PathParam("km") String km) {
        return km + " km equivale a " + Double.valueOf(km) * 0.621371 + " miles.";
    }

    @GET
    @Path("/node2km/{node}")
    @Produces(MediaType.JSON)
    public String node2km(@PathParam("node") String node) {
        return node + " nó equivale a " + Double.valueOf(node) * 1.852 + " km.";
    }

}
