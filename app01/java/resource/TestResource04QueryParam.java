package resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("testresource04")
public class TestResource04QueryParam {
	//http://localhost:8080/app01/webapi/testresource04?param01=WibMo&param02=BANGALORE
	//Header {Accept=text/plain}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod01(@QueryParam("param01") String prm01, @QueryParam("param02") String prm02) {
		return "GET testresource04?param01=" + prm01 + "&param02=" + prm02+ " TestResource04QueryParam testMethod01";
	}
}
