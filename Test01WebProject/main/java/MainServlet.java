import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MainServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String data1 = "Data From MainServlet";	
		request.setAttribute("mainData", data1);
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>MainServlet</title>");
		out.println("<style>");
		out.println("h1{color:orange}");
		out.println("h2{color:blue}");
		out.println("h3{color:green}");
		out.println("h4{color:gray}");

		out.println("</style>");		
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>START : Main Servlet</h1>");
		
		RequestDispatcher rd = request.getRequestDispatcher("HelperServlet1");
		//rd.include(request, response);
		rd.forward(request, response);
		
		out.println("<h1> END : Main Servlet</h1>");
		out.println("</body>");
		out.println("</html>");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
