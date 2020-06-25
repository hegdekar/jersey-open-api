package dev.hegdekar.jerseyswagger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello from Jersey-Swagger";
	}

	@GET
	@Path("/{username}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response returnJson(@PathParam("username") String username) {
		JSONObject user = new JSONObject();
		user.put("user", username);
		return Response.ok(user.toString()).type(MediaType.APPLICATION_JSON).build();
	}

}
