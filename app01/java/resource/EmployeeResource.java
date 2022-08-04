package resource;

import dao.*;
import entities.Employee;
import entities.Link;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.PathParam;

import java.net.URI;
import java.util.*;

@Path("employee")
public class EmployeeResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getAllEmployee() {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		List<Employee> empList = null;
		try {
			empList = employeeDAO.getAllEmployees();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return empList;
	}

	
	//GET    http://localhost:8080/app01/employee/{empid}
	@GET
	@Path("/{empId}")
	@Produces(MediaType.APPLICATION_JSON)
	//public String getEmployeeById(@PathParam(value = "empId") String empId) {
	public Employee getEmployeeById(@PathParam(value = "empId") String empId, @Context UriInfo uriInfo) throws Exception{
		EmployeeDAO employeeDAO = new EmployeeDAO();
		int eId = Integer.parseInt(empId);
		Employee e = null;
		e = employeeDAO.getEmployeeById(eId);
		//Absolute URI PATH : http://localhost:8080/app01/webapi/employee/9179
		URI selfUri = uriInfo.getAbsolutePathBuilder().build();
		
		//Base URI PATH     : http://localhost:8080/app01/webapi/		
		URI mgrUri  = uriInfo.getBaseUriBuilder().path(EmployeeResource.class).path(Integer.toString(e.getMgr())).build();
		URI deptUri = uriInfo.getBaseUriBuilder().path(DepartmentResource.class).path(Integer.toString(e.getDept())).build();
		
		e.addLink(new Link(selfUri.toString(), "self"));
		e.addLink(new Link(mgrUri.toString(),  "namager"));
		e.addLink(new Link(deptUri.toString(), "department"));
		
		return e;
		//return e.toString();
	}
	
	@DELETE
	@Path("/{empId}")
	@Produces(MediaType.TEXT_PLAIN)
	public int deleteEmployee(@PathParam(value = "empId") String empId) {
		int eId = Integer.parseInt(empId);
		EmployeeDAO employeeDAO = new EmployeeDAO();
		int i = 0;
		try {
			i = employeeDAO.deleteEmployeeById(eId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public int insertEmployee(Employee e) {
		System.out.println(e);
		EmployeeDAO employeeDAO = new EmployeeDAO();
		int i = 0;
		try {
			i = employeeDAO.insertEmployee(e);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return i ;
	}
	
	@PUT
	@Path("/{empid}")
	@Consumes(MediaType.APPLICATION_JSON)
	public int updateEmployee(@PathParam("empid") int empId, Employee e) {
		EmployeeDAO employeeDAO = new EmployeeDAO();
		int i = 0;
		try {
			i = employeeDAO.updateEmployee(empId, e);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return i;
	}
	
}
//POST   http://localhost:8080/app01/employee
//PUT    http://localhost:8080/app01/employee/9179
//DELETE http://localhost:8080/app01/employee/9179


