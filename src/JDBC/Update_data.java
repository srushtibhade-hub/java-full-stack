package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_data {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        String url="jdbc:mysql://localhost:3306/srushti";
        //oracle:jdbc:@localhost:1521:xe
        String user="root";
        String password="Srushti@123";
        String sql="update srushti set id=2 where id=?";

        //Loading the driver

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded Succesfully");

        //Established the connection
        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established Succesfully");
        PreparedStatement pst=con.prepareStatement(sql);
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter update  ID");
        int id=sc.nextInt();
//        System.out.println("please enter name");
//        String brand=sc.next();
//        System.out.println("Please enter age");
//        int price=sc.nextInt();
//        System.out.println("Enter your department");
//        String st=sc.next();

        pst.setInt(1,id);
//        pst.setString(2,brand);
//        pst.setInt(3,price);
//        // pst.setString(4,st);

        pst.executeUpdate();
        System.out.println("Data Insert successfully");
        System.out.println("Connection Closed");
    }
}
