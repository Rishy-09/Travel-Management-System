package travel.management.system;

import java.sql.*;
public class Conn {

    Connection c;
    Statement s;
    Conn(){
        try{
//            jdbc helps us to execute our mysql queries using java
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem", "root", "mysqlpassword");
            s = c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
