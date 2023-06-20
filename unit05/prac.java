package unit05;

import java.sql.*;
public class prac
{
    public static void main(String[] args) throws SQLException
    {
        Connection myConnection = null;
        Statement myStatement = null;
        ResultSet myResult = null;
        try
        {
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "username", "password");
            myStatement = myConnection.createStatement();
            int a = myStatement.executeUpdate("INSERT INTO table VALUES ()");
            System.out.println(a);
            myResult = myStatement.executeQuery("SELECT * FROM table");
            while(myResult.next())
            {
                System.out.println(myResult.getString("id"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            myConnection.close();
            myStatement.close();
            myResult.close();
        }
    }
}
