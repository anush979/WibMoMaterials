import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class ServletContextScopeDemo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletContextScopeDemo01() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String contextData = "ApplicationScopeData01";
		
		ServletContext context = getServletContext();
		context.setAttribute("contAttr01", contextData);
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ServletContextScope</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>ServletContext Application/Context Scope Demo</h1>");
		out.println("<h1>Applocation scope data Set</h1>");
		
		
		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
