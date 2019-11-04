import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServlet",urlPatterns = "/translater")
public class TranslationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");

    Map<String,String> dictionary = new HashMap<>();
    dictionary.put("Hello","Xin Chào");
    dictionary.put("How","Thế nào");
    dictionary.put("Goodbye","Tạm biệt");

    String dic1 = request.getParameter("txtsearch");
        PrintWriter wr = response.getWriter();
        wr.println("<html>");
    String result = dictionary.get(dic1);
    if (result!=null){
        wr.println("Translate " +dic1+ " in to VietNamese is " + result);
    }else
    {
        wr.println("not found");
    }
    wr.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
