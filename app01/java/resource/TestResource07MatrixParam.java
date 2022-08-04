package resource;

import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("testresource07")
public class TestResource07MatrixParam {
	//http://localhost:8080/app01/webapi/testresource07;matrixPar01=WibMo;matrixPar02=BANGALORE
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod01(@MatrixParam("matrixPar01")  String mPrm01, @MatrixParam("matrixPar02")  String mPrm02) {
		return "GET /testresource07/ TestResource07MatrixParam testMethod01() matrixPar01=" + mPrm01 + " matrixPar02=" + mPrm02;
	}

}
