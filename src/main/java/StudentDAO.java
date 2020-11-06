import java.sql.Connection;
import java.sql.DriverManager;

public class StudentDAO {

    private Connection conn;
    private static StudentDAO dao = null;

    private StudentDAO(){
        try {
            Class.forName("com.mysql.cj.Driver");
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

}
