import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class HelperServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public HelperServlet2() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String data1 = "Data From HelperServlet2";	
		request.setAttribute("heperData2", data1);

		
		out.println("<h3>START : HelperServlet2</h3>");
		
		RequestDispatcher rd = request.getRequestDispatcher("HelperServlet3");
		//rd.include(request, response);
		rd.forward(request, response);
		
		out.println("<h3> END : HelperServlet2</h3>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}