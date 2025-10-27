package api;

import adapters.Nhan2SoPresenterAPI;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import nhan2so.InputData;
import nhan2so.InputInterface;
import nhan2so.Nhan2So;
import nhan2so.Nhan2SoUseCaseControl;

@Path("/nhan2so")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Nhan2SoRestfulWS {

	public static class RequestBody {
		public Integer num1;
		public Integer num2;
	}

	@POST
	public Response nhan2so(RequestBody body) {

		if (body == null || body.num1 == null || body.num2 == null) {
			Nhan2soResponse resp = new Nhan2soResponse();
			resp.setSuccess(false);
			resp.setMessage("Missing num1 or num2 in request body");
			return Response.status(Response.Status.BAD_REQUEST).entity(resp).build();
		}

		// Create request-scoped ViewModel + Presenter
		Nhan2soResponse responseModel = new Nhan2soResponse();
		Nhan2SoPresenterAPI presenter = new Nhan2SoPresenterAPI(responseModel);

		Nhan2So nhan2so = new Nhan2So();
		// Call use case
		InputData input = new InputData(body.num1, body.num2);
		InputInterface in = new Nhan2SoUseCaseControl(presenter, nhan2so);
		in.execute(input);

		// Return responseModel as JSON (200 OK)
		return Response.ok(responseModel).build();

	}

}
