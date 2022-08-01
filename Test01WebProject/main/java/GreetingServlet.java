import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GreetingServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("userName");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>GreetingServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Welcome to WibMo " + user + " From GreetingServlet</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String user = request.getParameter("userName");
//		
//		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>GreetingServlet</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>Welcome to WibMo " + user + " From GreetingServlet</h1>");
//		out.println("</body>");
//		out.println("</html>");
		doGet(request, response);
	}

}
