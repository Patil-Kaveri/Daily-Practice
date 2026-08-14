import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/context")
public class ServletContextExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = getServletContext();

        context.setAttribute("college", "Parul University");

        String college =
                (String) context.getAttribute("college");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>ServletContext Example</h1>");
        out.println("<p>College: " + college + "</p>");
    }
}