import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/insert.do")
public class InsertGradeServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        res.setCharacterEncoding("UTF-8");
        String number = req.getParameter("number");
        String name = req.getParameter("name");
        String kor = req.getParameter("kor");
        String eng = req.getParameter("eng");
        String mat = req.getParameter("mat");
    }
}
