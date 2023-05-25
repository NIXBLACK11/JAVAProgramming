package unit05;

import java.sql.*;

public class BackendDevelopmentUsingJDBC
{
    public static void main(String[] args) throws SQLException
    {
        Connection myConn = null; //My connector object
        Statement myStmt = null; //My input to sql
        ResultSet myRs = null; //My result from sql
        try
        {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass", "root", "2004");
            myStmt = myConn.createStatement();
            int a = myStmt.executeUpdate("INSERT INTO testtable VALUES (5, 'name123', 'none')");
            System.out.println("The number of rows affected are :"+a);
            myRs = myStmt.executeQuery("select * from testtable");
            while (myRs.next()) // Iterates the result row wise
            {
                System.out.println(myRs.getString("id") + ", " + myRs.getString("name") + ", " + myRs.getString("paper"));
            }
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
        finally
        {
            myRs.close();
            myStmt.close();
            myConn.close();
        }
    }
}