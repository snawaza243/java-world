
package jdbc_p2;

import java.sql.*;

public class Practical2 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "mysql1234");
            Statement stmt = con.createStatement();

            String sql = "insert into emp (emp_id, emp_name, emp_designation, emp_salary, emp_gender) values ('102', 'Sita', 'Supervisor', '40000', 'Female');";
            PreparedStatement ps = con.prepareStatement(sql);
            int rowsAffected = ps.executeUpdate();
            System.out.println(rowsAffected + " row(s) affected");
            int x = ps.executeUpdate();
            if (x > 0) {
                System.out.println("insertion successful");
                con.close();
            } else {
                System.out.println("insertion Unsuccessful");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}