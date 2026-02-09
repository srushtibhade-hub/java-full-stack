package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;
public class Connection_Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/srushti";
        //oracle:jdbc:@localhost:1521:xe
        String user="root";
        String password="Srushti@123";
        String sql="select *from student";

        //Loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded Succesfully");

        //Established the connection
        Connection con =DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established Succesfully");

        //Create statement
        Statement st =con.createStatement();
        ResultSet rs =st.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
        }

    }
}