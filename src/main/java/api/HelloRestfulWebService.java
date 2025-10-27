package api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloRestfulWebService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello TKXDPM-K17-05";
	}

}
