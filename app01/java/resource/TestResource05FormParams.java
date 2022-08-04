package resource;

import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("testresource05")
public class TestResource05FormParams {
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod01(@FormParam("user") String user) {
		return "POST testresource05 TestResource05FormParams testMethod01()   user = "+ user;
	}
}
//<form action="" method="post">
//	<input type="text" name="user">
//</form>
//Recommande
//@PathParam
//Not Recommended
//@Formparam
//@QueryParam
//@CookieParam