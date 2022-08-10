import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import entity.Employee;

public class LoginControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginControllerServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");	//empno in emp Table is password
		
		EmployeeModel employeeModel = new EmployeeModel();
		Employee e = employeeModel.login(userName, password);
		
		RequestDispatcher rd = null;
		if(e != null) {
			request.setAttribute("employee", e);
			rd = request.getRequestDispatcher("employeehome.jsp");
			rd.forward(request, response);
		} else {
			rd = request.getRequestDispatcher("loginfail.jsp");
			rd.forward(request, response);			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}