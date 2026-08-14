import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
    urlPatterns = "/config",
    initParams = {
        @jakarta.servlet.annotation.WebInitParam(
            name = "studentName",
            value = "Kaveri"
        )
    }
)
public class ServletConfigExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        ServletConfig config = getServletConfig();

        String studentName =
                config.getInitParameter("studentName");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>ServletConfig Example</h1>");
        out.println("<p>Student Name: "
                + studentName + "</p>");
    }
}