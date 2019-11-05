import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet ",urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String des = request.getParameter("txtproduct");
        int price = Integer.parseInt(request.getParameter("txtprice"));
        double dis = Double.parseDouble(request.getParameter("txtdiscount"));
        double discount = dis /100;
        double discountCacul = price * discount ;
        double disss =price - discountCacul;

        PrintWriter wr = response.getWriter();
        wr.println("<html>");
        wr.println("<h2>Product Discount Calculator</h2>");
        wr.println("<table border =1>");
        wr.println("<tr>");
        wr.println("<td>");
        wr.println("Product Description: "+"<td>" +des+"</td>"+"<br/>");
        wr.println("</td>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<td>");
        wr.println("List Price: "+"<td>" +price+"</td>"+"<br/>");
        wr.println("</td>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<td>");
        wr.println("Discount Percent: "+"<td>" +dis+"%"+"</td>"+"<br/>");
        wr.println("</td>");
        wr.println("</tr>");
        wr.println("<tr>");
        wr.println("<td>");
        wr.println("Product Discount Calculator: "+"<td>" +disss+"</td>"+"<br/>");
        wr.println("</td>");
        wr.println("</tr>");
        wr.println("</table>");
        wr.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
