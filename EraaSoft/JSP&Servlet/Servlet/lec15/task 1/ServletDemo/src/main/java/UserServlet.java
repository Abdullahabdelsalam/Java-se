import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the form parameters
        String fullName = request.getParameter("fullName");
        String age = request.getParameter("age");
        
        // Set response content type
        response.setContentType("text/html");
        
        // Write the response
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>User Details</title></head>");
        out.println("<body>");
        out.println("<h1>User Information</h1>");
        out.println("<p><strong>Full Name:</strong> " + fullName + "</p>");
        out.println("<p><strong>Age:</strong> " + age + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
