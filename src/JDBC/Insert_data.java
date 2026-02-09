package JDBC;

import java.sql.*;

public class Insert_data {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/srushti";
        //oracle:jdbc:@localhost:1521:xe
        String user="root";
        String password="Srushti@123";
        String sql="insert into srushti values(1,'srushti',21)";

        //Loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded Succesfully");

        //Established the connection
        Connection con = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established Succesfully");

        //Create statement
        Statement st = con.createStatement();

        // Execute INSERT
        int rows = st.executeUpdate(sql);
        System.out.println(rows + " row inserted successfully");

//        String sql = "INSERT INTO student VALUES (?, ?, ?)";
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setInt(1, 1);
//        ps.setString(2, "srushti");
//        ps.setInt(3, 21);
//        ps.executeUpdate();


    }
}
