package resource;

import java.net.*;
import java.util.*;

import dao.*;
import entities.*;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

@Path("department")
public class DepartmentResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Department> getAllDepartments() {
		DepartmentDAO departmentDAO = new DepartmentDAO();
		List<Department> dptList = null;
		try {
			dptList = departmentDAO.getAllDepartments();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return dptList;
	}

	
	@GET
	@Path("/{deptId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Department getDepartmentById(@PathParam(value = "deptId") String deptId, @Context UriInfo uriInfo) throws Exception{
		DepartmentDAO departmentDAO = new DepartmentDAO();
		int dId = Integer.parseInt(deptId);
		Department d = null;
		d = departmentDAO.getDepartmentById(dId);
		return d;
	}
	
	@DELETE
	@Path("/{deptId}")
	@Produces(MediaType.TEXT_PLAIN)
	public int deleteDepartment(@PathParam(value = "deptId") String deptId) {
		int dId = Integer.parseInt(deptId);
		DepartmentDAO departmentDAO = new DepartmentDAO();
		int i = 0;
		try {
			i = departmentDAO.deleteDepartmentById(dId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public int insertDepartment(Department d) {
		DepartmentDAO departmentDAO = new DepartmentDAO();
		int i = 0;
		try {
			i = departmentDAO.insertDepartment(d);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return i ;
	}
	
	@PUT
	@Path("/{deptid}")
	@Consumes(MediaType.APPLICATION_JSON)
	public int updateDepartment(@PathParam("deptid") int deptId, Department d) {
		DepartmentDAO departmentDAO = new DepartmentDAO();
		int i = 0;
		try {
			i = departmentDAO.updateDepartmentById(deptId, d);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return i;
	}
}
