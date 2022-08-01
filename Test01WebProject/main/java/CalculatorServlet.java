import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class CalculatorServlet extends HttpServlet {
	String str;
	private static final long serialVersionUID = 1L;
    public CalculatorServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String val1 = request.getParameter("value1");
		String val2 = request.getParameter("value2");
		String oprt = request.getParameter("op");
		double v1 = Double.parseDouble(val1);
		double v2 = Double.parseDouble(val2);
		double result = 0;
		
		if(oprt.equals("+")) {
			result = v1 + v2;
		} else if(oprt.equals("-")) {
			result = v1 - v2;
		} else if(oprt.equals("*")) {
			result = v1 * v2;
		} else if(oprt.equals("/")) {
			result = v1 / v2;
		} 
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>RESULT</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>RESULT : " + result+"</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
