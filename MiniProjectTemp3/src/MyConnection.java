import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
    public  void getConnection(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");//load driver
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456789");//connection to db
            System.out.println("Connection : "+con);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
