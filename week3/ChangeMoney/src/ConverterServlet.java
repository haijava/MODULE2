import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConverterServlet",urlPatterns = "/convert")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float vnd = rate * usd;
        PrintWriter wr = response.getWriter();
        wr.println("<html>");
        wr.println("<h1> CONVERTER MONEY </h1>");
        wr.println("<table border =1>");
        wr.println("<tr>");
        wr.println("<td> RATE: " +rate+"</td");
        wr.println("</tr>");

        wr.println("<tr>");
        wr.println("<td> USD:" +usd+"</td>");
        wr.println("</tr>");

        wr.println("<tr>");
        wr.println("<td> VND:" +vnd+"</td>" );
        wr.println("</tr>");

        wr.println("</table>");
        wr.println("</html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
