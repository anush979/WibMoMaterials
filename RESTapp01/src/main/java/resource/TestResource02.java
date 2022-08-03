package resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("testresource02")
public class TestResource02 {
	@GET
	@Path("/demo01")
	public String testMethod01() {
		return "GET testresource02/demo01 TestResource02 testMethod01()";
	}
	
	@GET
	@Path("/demo02")
	public String testMethod02() {
		return "GET testresource02/demo02 TestResource02 testMethod02()";
	}

	@GET
	@Path("/demo03")
	public String testMethod03() {
		return "GET testresource02/demo03 TestResource02 testMethod03()";
	}

	@GET
	@Path("/demo04")
	public String testMethod04() {
		return "GET testresource02/demo04 TestResource02 testMethod04()";
	}

}
