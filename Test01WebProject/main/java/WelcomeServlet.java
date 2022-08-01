import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String str;
    public void testMethod() {
    	System.out.println("String str : " + str);
    }
    public WelcomeServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int a = 10;
		a = a / 0;
		out.println("<html>");
		out.println("<head>");
		out.println("<title>WelcomeServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Welcome to Test01WebProject WelcomeServlet!!!!!!</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
