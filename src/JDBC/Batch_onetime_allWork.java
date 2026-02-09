package JDBC;

import java.sql.*;

public class Batch_onetime_allWork {
    static void main() throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/srushti";
        //oracle:jdbc:@localhost:1521:xe
        String user="root";
        String password="Srushti@123";
        String sql="insert into srushti values (3,'prachi',23)";
        String sql1="insert into srushti values (4,'sahili',21)";
        String sql2="insert into srushti values (5,'surbhi',21)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded Succesfully");

        //Established the connection
        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established Succesfully");
        Statement pst=con.createStatement();
        pst.addBatch(sql);
        pst.addBatch(sql1);
        pst.addBatch(sql2);
        pst.executeBatch();
    }
}
