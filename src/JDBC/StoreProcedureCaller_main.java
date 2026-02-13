package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class StoreProcedureCaller_main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/bank_class";
        String user = "root";
        String password = "Srushti@123";

        Scanner sc = new Scanner(System.in);
        Connection con = null;
        CallableStatement cst = null;
     //   ResultSet rs = null;

        String sql = "call data_insert(?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded Successfully");

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established");

            cst = con.prepareCall(sql);

            System.out.println("Enter account number:");
            int account_num = sc.nextInt();
            System.out.println("enter name");
            String name = sc.next();
            System.out.println("enter balance");
            int balance = sc.nextInt();

            cst.setInt(1, account_num);
            cst.setString(2, name);
            cst.setInt(3, balance);

             cst.execute();



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
         //       rs.close();
                 cst.close();
                 con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
