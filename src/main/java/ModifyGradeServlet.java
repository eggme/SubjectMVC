import VO.Student;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/modify.do")
public class ModifyGradeServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        res.setCharacterEncoding("UTF-8");

        int number = Integer.parseInt(req.getParameter("number"));
        String name = req.getParameter("name");
        int kor = Integer.parseInt(req.getParameter("kor"));
        int eng = Integer.parseInt(req.getParameter("eng"));
        int mat = Integer.parseInt(req.getParameter("mat"));
        Student vo = new Student(number, name, kor, eng, mat);
        StudentDAO dao = StudentDAO.getInstance();
        dao.modifyUserByNo(vo);

        res.getWriter().println("<script>alert('입력에 성공하였습니다.'); location.href='index.jsp'</script>");
    }
}
