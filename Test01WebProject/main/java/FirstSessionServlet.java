import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.*;
//@WebServlet
public class FirstSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FirstSessionServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = request.getParameter("data1");
		
		HttpSession session = request.getSession();
		//session.setAttribute(attributeName, attributeValue);
		//attributeName  -> should be unique
		//attributeValue -> can be any Object
		session.setAttribute("mydata", data);
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Firstpage</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Starting Session with user data as  [  " + data + " ]</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
