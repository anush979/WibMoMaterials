package demos;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Version;
import java.time.Duration;
import java.util.*;

public class Test06RESTClient {
	public static void main(String[] args) throws Exception {
		HttpClient httpClient = HttpClient.newBuilder().version(Version.HTTP_1_1).connectTimeout(Duration.ofSeconds(10)).build();
		HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("http://localhost:8080/app01/webapi/employee/7369")).build();
		
		HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		String empOutPut = httpResponse.body();

		JSONParser jsonParser = new JSONParser();
		JSONObject employeeJsonOnject = (JSONObject) jsonParser.parse(empOutPut);
		Set<Map.Entry<String, Object>> empMap =  employeeJsonOnject.entrySet();

		System.out.println("ID   : " + employeeJsonOnject.get("empId"));
		System.out.println("MAME : " + employeeJsonOnject.get("empName"));
		System.out.println("DEPT : " + employeeJsonOnject.get("dept"));
		System.out.println("DESG : " + employeeJsonOnject.get("desg"));
		System.out.println("MNGR : " + employeeJsonOnject.get("mgr"));
		System.out.println("SALR : " + employeeJsonOnject.get("sal"));
		System.out.println("COMM : " + employeeJsonOnject.get("comm"));
		System.out.println("HDAT : " + employeeJsonOnject.get("hireDate"));
		System.out.println("LINKS : " + employeeJsonOnject.get("links"));
//////////////////////////////////////////////RETRIVING DEPT DETAILS FROM LINK PRIVIDED BY EMPLOYEE//////////////////////////////////////////////////////////////////////
		JSONArray empLinks = (JSONArray) employeeJsonOnject.get("links");
		JSONObject link = null;
		for(int i = 0; i < empLinks.size(); i++) {
			link = (JSONObject) jsonParser.parse(empLinks.get(i).toString());
			if(link.get("rel").toString().equals("department")) {
				break;
			}
		}
		String departmentLink = link.get("href").toString();
		httpRequest = HttpRequest.newBuilder().GET().uri(URI.create(departmentLink)).build();
		httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		String deptOutPut = httpResponse.body();
		JSONObject departmentJsonObject = (JSONObject) jsonParser.parse(deptOutPut);
		System.out.println("*****************DEPARTMENT DETAILS********************");
		System.out.println("ID   : " + departmentJsonObject.get("deptId"));
		System.out.println("NAME : " + departmentJsonObject.get("deptName"));
		System.out.println("LOCA : " + departmentJsonObject.get("location"));
		
	}
}