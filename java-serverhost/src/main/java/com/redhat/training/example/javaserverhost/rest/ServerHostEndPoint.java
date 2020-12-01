package com.redhat.training.example.javaserverhost.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.net.InetAddress;

@Path("/")
public class ServerHostEndPoint {

  @GET
  @Produces("text/plain")
  public Response doGet() {
    String host = "";
    try {
      host = InetAddress.getLocalHost().getHostName();
    }
    catch (Exception e) {
       e.printStackTrace();
    }
<<<<<<< HEAD
    String msg = "I am running on server "+host+" Version 2.0 \n";
=======
    String msg = "I am running on server "+host+" Version 220 \n";
>>>>>>> 4c2847663ebe32aabaa3a0252dcc73d24bafe7f8
    return Response.ok(msg).build();
  }
}

