import VO.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/select.do")
public class SelectGradeServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");
        int number = 0;
        Student vo = null;
        try {
            number = Integer.parseInt(req.getParameter("number"));
            StudentDAO dao = StudentDAO.getInstance();
            vo = dao.selectUserByNo(number);
            System.out.println(vo.toString());
        }catch(Exception e){
            res.getWriter().println("<script>alert('일치하는 사람이 없습니다!'); location.href='./select.jsp';</script>");
            return;
        }

        req.setAttribute("vo", vo);
        RequestDispatcher dispatcher = req.getRequestDispatcher("./select.jsp");
        dispatcher.forward(req, res);

    }
}
