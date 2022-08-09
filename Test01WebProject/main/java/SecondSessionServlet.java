import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

//@WebServlet
import java.io.*;
public class SecondSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SecondSessionServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String data = (String)session.getAttribute("mydata");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>SecondPage</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Value retrived from Session is  [  " + data + " ]</h1>");
		out.println("</body>");
		out.println("</html>");

		session.invalidate();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}