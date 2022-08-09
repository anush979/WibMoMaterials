import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class InitParamServletDemo02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public InitParamServletDemo02() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String driver = "";
		String url = "";
		String user = "";
		String password = "";
		//////////////////////////////////////////Geting Init Param//////////////////////////////////////////////////
		//ServletConfig config = getServletConfig();
		//driver = config.getInitParameter("driver");
		driver = getInitParameter("driver");
		
		///////////////////////////////////////////////Context param//////////////////////////////////////////////
		
		ServletContext context = getServletContext();
		url = context.getInitParameter("url");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>InitParamServlet02</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Driver :  " + driver + "</h1>");
		out.println("<h1>url :  " + url + "</h1>");

		out.println("</body>");
		out.println("</html>");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
