import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class HelperServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HelperServlet3() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<h4>Last Servlet in RequestDispatcher Chain  : HelperServlet3</h4>");
		
		String main = (String)request.getAttribute("mainData");
		String helper1 = (String)request.getAttribute("heperData1");
		String helper2 = (String)request.getAttribute("heperData2");
		
		out.println("<p>MainServlet Data :  "+ main +"</p>");
		out.println("<p>HelperServlet1 Data :  "+ helper1 +"</p>");
		out.println("<p>HelperServlet2 Data :  "+ helper2 +"</p>");
		

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}