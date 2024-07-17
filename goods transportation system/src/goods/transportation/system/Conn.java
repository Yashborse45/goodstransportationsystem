package goods.transportation.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///goodstransportationsystem", "root", "123456");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
