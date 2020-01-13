package net.moewes.cloud.ui;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tokens")
//@RegisterRestClient
public interface Service {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  String getTokens();
}
