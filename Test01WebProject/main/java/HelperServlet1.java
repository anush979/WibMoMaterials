import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class HelperServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HelperServlet1() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		String data1 = "Data From HelperServlet1";	
		request.setAttribute("heperData1", data1);

		
		out.println("<h2>START : HelperServlet1</h2>");
		
		RequestDispatcher rd = request.getRequestDispatcher("HelperServlet2");
		//rd.include(request, response);
		rd.forward(request, response);
		
		out.println("<h2> END : HelperServlet1</h2>");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
