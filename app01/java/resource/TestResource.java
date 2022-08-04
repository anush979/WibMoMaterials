package resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("testresource")
public class TestResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod01() {
		return "GET Return from TestResouce class testMethod01()";
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod02() {
		return "POST Return from TestResouce class testMethod02()";
	}
	
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod03() {
		return "PUT Return from TestResouce class testMethod03()";
	}
	
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod04() {
		return "DELETE Return from TestResouce class testMethod04()";
	}

}
