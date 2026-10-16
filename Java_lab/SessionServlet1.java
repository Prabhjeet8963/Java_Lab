import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/SessionServlet1")
public class SessionServlet1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        
        session.setAttribute("user_name", "Prabhjeet Singh");
        
        out.println("<html><body>");
        out.println("<h3>Session started for Prabhjeet Singh</h3>");
        out.println("<a href='SessionServlet2'>Go to Second Servlet to see data</a>");
        out.println("</body></html>");
    }
}