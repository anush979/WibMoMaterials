package resource;


import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import mappers.ExceptionMessage;

@Provider
public class RESTExceptionMapper implements ExceptionMapper<Throwable> {
	
	public Response toResponse(Throwable exception) {
		ExceptionMessage exceptionMessage = new ExceptionMessage(400, exception.getMessage(), "Look in to manual");
		
		Response response = Response.status(Status.BAD_REQUEST).entity(exceptionMessage).build();
		StackTraceElement stackTraceElement[] =   exception.getStackTrace();

		return response;
	}

}
