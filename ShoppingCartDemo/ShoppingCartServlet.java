import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
public class ShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ShoppingCartServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uriPattern = request.getRequestURI();
		HttpSession session = request.getSession();
		if(uriPattern.endsWith("booksuri")) {
			String[] booksList = request.getParameterValues("books");
			session.setAttribute("booksAttrib", booksList);
			RequestDispatcher rd = request.getRequestDispatcher("gifts.html");
			rd.forward(request, response);
			
		} if(uriPattern.endsWith("giftsuri")) {
			String[] giftsList = request.getParameterValues("gifts");
			session.setAttribute("giftsAttrib", giftsList);
			RequestDispatcher rd = request.getRequestDispatcher("laptop.html");
			rd.forward(request, response);

		} if(uriPattern.endsWith("laptopuri")) {
			String[] laptopList = request.getParameterValues("laptops");
			session.setAttribute("laptopAttrib", laptopList);
			RequestDispatcher rd = request.getRequestDispatcher("cars.html");
			rd.forward(request, response);

		} if(uriPattern.endsWith("carsuri")) {
			String[] carsList = request.getParameterValues("cars");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>summary</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h3>Order Summary</h3>");
			out.println("<ul>");
			String itemList[] = (String[])session.getAttribute("booksAttrib");
			for(String s : itemList) {
				out.println("<li>" + s + "</li>");	
			}
			itemList = (String[])session.getAttribute("giftsAttrib");
			for(String s : itemList) {
				out.println("<li>" + s + "</li>");	
			}
			itemList = (String[])session.getAttribute("laptopAttrib");
			for(String s : itemList) {
				out.println("<li>" + s + "</li>");	
			}
			for(String s : carsList) {
				out.println("<li>" + s + "</li>");	
			}

			out.println("</ul>");
			out.println("</body>");
			out.println("</html>");
			session.invalidate();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}