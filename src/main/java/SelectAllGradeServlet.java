import VO.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAll.do")
public class SelectAllGradeServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        StudentDAO dao = StudentDAO.getInstance();
        List<Student> list = dao.selectAll();
        req.setAttribute("list", list);

        RequestDispatcher dispatcher = req.getRequestDispatcher("./selectAll.jsp");
        dispatcher.forward(req, res);
    }
}
