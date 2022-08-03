package resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
@Path("testresource03")
public class TestResource03 {
	//Use Request Header {Accept=text/plain}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod01() {
		return "Simple Text Data";
	}
	
	//Use Request Header {Accept=text/xml}
	@GET
	@Produces(MediaType.TEXT_XML)
	public String testMethod02() {
		return "<name>SUGNANA</name>";
	}

	//Use Request Header {Accept=application/json}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String testMethod03() {
		return "{'name' : 'SUGNANA'}";
	}

	//Use Request Header {Accept=text/html}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String testMethod04() {
		return "<html><body><p>Hello from REST</p></body></html>";
	}

}
