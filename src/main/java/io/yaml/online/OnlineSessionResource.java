package io.yaml.online;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import io.yaml.online.beans.OnlineSession;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/online-session")
public interface OnlineSessionResource {

  /**
   * Creates a new instance of a `OnlineSession`.
   */
  @POST
  @Consumes("application/json")
  @Produces("application/json")
  OnlineSession createOnlineSession(OnlineSession data);

  /**
   * Gets the details of a single instance of a `OnlineSession`.
   */
  @Path("/{sessionId}")
  @GET
  @Produces("application/json")
  OnlineSession getOnlineSession(@PathParam("sessionId") Long sessionId);
}