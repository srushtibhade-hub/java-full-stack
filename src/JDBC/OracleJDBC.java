package JDBC;

public class OracleJDBC {
    static void main() {
        String url="jdbc:oracle:thin:@localhost:1521:exe";
        String user="System";
        String password="Srushti@123";
        String query="create table srushti("+
        "id number primary key, "+"brand varchar(20), "+"price number)";

        //load oracle driver
      //  Class.forName("");
    }
}
