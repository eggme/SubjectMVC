import VO.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/insert.do")
public class InsertGradeServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int number = Integer.parseInt(req.getParameter("number"));
        String name = req.getParameter("name");
        int kor = Integer.parseInt(req.getParameter("kor"));
        int eng = Integer.parseInt(req.getParameter("eng"));
        int mat = Integer.parseInt(req.getParameter("mat"));
        Student vo = new Student(number, name, kor, eng, mat);
        System.out.println(vo.toString());
        StudentDAO dao = StudentDAO.getInstance();
        dao.insertGrade(vo);

        res.sendRedirect("./index.jsp");
    }
}
