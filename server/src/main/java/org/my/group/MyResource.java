package org.my.group;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class MyResource {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String hello(@Valid MyPojo myPojo) {
        return "hello";
    }

//    private void dummy(@NotBlank(message = "blank") String dummy) {
//
//    }

}