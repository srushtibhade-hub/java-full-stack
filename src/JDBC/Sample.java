package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Sample {
    static void main() throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/srushti";
        //oracle:jdbc:@localhost:1521:xe
        String user="root";
        String password="Srushti@123";
        String sql="insert into srushti values(?,?,?)";

        //Loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded Succesfully");

        //Established the connection
        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established Succesfully");
        //Create statement
        PreparedStatement st = con.prepareStatement(sql);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        int id = sc.nextInt();
        st.setInt(1, id);
        System.out.println("Enter name");
        String name = sc.next();
        st.setString(2, name);
        System.out.println("Enter age");
        int age = sc.nextInt();
        st.setInt(3, age);
        // Execute INSERT
        st.executeUpdate(sql);
        //   System.out.println(rows + " row inserted successfully");

//        String sql = "INSERT INTO student VALUES (?, ?, ?)";
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setInt(1, 1);
//        ps.setString(2, "srushti");
//        ps.setInt(3, 21);
//        ps.executeUpdate();
    }
}

