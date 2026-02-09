package JDBC;

import java.sql.*;

public class Create_table {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/srushti";
        //oracle:jdbc:@localhost:1521:xe
        String user="root";
        String password="Srushti@123";
        String sql="create table Srushti(id int,name varchar(20),age int)";

        //Loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded Succesfully");

        //Established the connection
        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established Succesfully");

        //Create statement
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        System.out.println("Table created successfully");


    }
}
