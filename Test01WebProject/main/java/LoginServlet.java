import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("userName");
		String pass = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(user.equals("sugnana") && pass.equals("root")) {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Success</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Welcome " + user +"</h1>");
			out.println("</body>");
			out.println("</html>");

		} else {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Fail</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Login Failed</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}