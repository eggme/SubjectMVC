import VO.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private Connection conn;
    private PreparedStatement pstmt;
    private Statement st;
    private static StudentDAO dao = null;

    private StudentDAO(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/junstudio?serverTimezone=UTC&characterEncoding=UTF-8", "root", "root");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static StudentDAO getInstance(){
        if(dao == null){
            dao = new StudentDAO();
        }
        return dao;
    }

    public void insertGrade(Student vo){
        try {
            String sql = "INSERT INTO STUDENT VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, vo.getNo());
            pstmt.setString(2, vo.getName());
            pstmt.setInt(3, vo.getKor());
            pstmt.setInt(4, vo.getEng());
            pstmt.setInt(5, vo.getMat());
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public Student selectUserByNo(int no){
        Student vo = null;
        try{
            String sql = "SELECT * FROM STUDENT WHERE NO = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, no);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                String name = rs.getString("NAME");
                int kor = rs.getInt("KOR");
                int eng = rs.getInt("ENG");
                int mat = rs.getInt("MAT");
                vo = new Student(no, name, kor, eng, mat);
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return vo;
    }

    public List<Student> selectAll() {
        List<Student> list = new ArrayList<>();
        try{
            String sql = "SELECT * FROM STUDENT";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int no = rs.getInt("NO");
                String name = rs.getString("NAME");
                int kor = rs.getInt("KOR");
                int eng = rs.getInt("ENG");
                int mat = rs.getInt("MAT");
                Student vo = new Student(no, name, kor, eng, mat);
                list.add(vo);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return list;
    }

    public void modifyUserByNo(Student vo){
        try{
            String sql = "UPDATE STUDENT SET NAME = ?, KOR = ?, ENG = ?, MAT = ? WHERE NO = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getName());
            pstmt.setInt(2, vo.getKor());
            pstmt.setInt(3, vo.getEng());
            pstmt.setInt(4, vo.getMat());
            pstmt.setInt(5, vo.getNo());
            pstmt.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
