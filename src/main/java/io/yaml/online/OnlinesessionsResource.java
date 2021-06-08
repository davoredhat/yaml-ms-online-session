package io.yaml.online;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import io.yaml.online.beans.OnlineSession;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/onlinesessions")
public interface OnlinesessionsResource {
  /**
   * Gets a list of all `OnlineSession` entities.
   */
  @GET
  @Produces("application/json")
  List<OnlineSession> getonlinesessions();

  /**
   * Creates a new instance of a `OnlineSession`.
   */
  @POST
  @Consumes("application/json")
  void createOnlineSession(OnlineSession data);

  /**
   * Gets the details of a single instance of a `OnlineSession`.
   */
  @Path("/{onlinesessionId}")
  @GET
  @Produces("application/json")
  OnlineSession getOnlineSession(@PathParam("onlinesessionId") String onlinesessionId);

  /**
   * Updates an existing `OnlineSession`.
   */
  @Path("/{onlinesessionId}")
  @PUT
  @Consumes("application/json")
  void updateOnlineSession(@PathParam("onlinesessionId") String onlinesessionId,
      OnlineSession data);

  /**
   * Deletes an existing `OnlineSession`.
   */
  @Path("/{onlinesessionId}")
  @DELETE
  void deleteOnlineSession(@PathParam("onlinesessionId") String onlinesessionId);
}