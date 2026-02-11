package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;

public class Product_order {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/orderr";
        //oracle:jdbc:@localhost:1521:xe
        String user = "root";
        String password = "Srushti@123";
        String sql = "create table account(account_num int,name varchar(50),balance double,password varchar(50))";
        String sql1 = "update product set quantity=quantity-? where product_id=?";
        String sql2 = "insert into order_detail values (?,?,?)";
        PreparedStatement pst1 = null;
        PreparedStatement pst2= null;
        Scanner sc=null;
        try {

            //Loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded Succesfully");

            //Established the connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established Succesfully");

            //prepared statement
            con.setAutoCommit(false);
            pst1 = con.prepareStatement(sql1);
            pst2 = con.prepareStatement(sql2);
            sc = new Scanner(System.in);
            System.out.println("Enter product id:");
            int product_id = sc.nextInt();
            System.out.println("enter quantity:");
            int quantity = sc.nextInt();
            System.out.println("enter order id");
            int order_id = sc.nextInt();
            pst1.setInt(2, product_id);
            pst1.setInt(1, quantity);
            pst2.setInt(2, product_id);
            pst2.setInt(1,order_id );
            pst2.setInt(3, quantity);

            pst1.executeUpdate();
            pst2.executeUpdate();
            //on commit
            con.commit();
            con.setAutoCommit(true);
        } catch (Exception e) {
            // throw new RuntimeException(e);
            try {
                System.out.println("Error Occured don't worry your will be refunded within 24hour");
                conn.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            finally {
                sc.close();
                conn.close();
            }
        }

    }
}

