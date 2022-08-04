package resource;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("testresource06")
public class TestResource06CookieParam {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod01(@CookieParam("cookie01")  String coPrm01) {
		return "GET /testresource06/ TestResource06CookieParam testMethod01() cookie01=" + coPrm01;
	}
}
//Path Param
//http://localhost:8080/app01/webapi/employee/9179/address/1001
//

//Query Param
//http://localhost:8080/app01/webapi/employee?empid=9179&addressId=1001
//doGet(){
// request.getParameter("empid");
//}
