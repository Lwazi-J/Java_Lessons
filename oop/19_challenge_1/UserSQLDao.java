import java.sql.Connection;//Import Connection to connect to the DB
import java.sql.DriverManager;// Import DriveManager to load the DB driver
import java.sql.PreparedStatement;//Import the prepared statement
import java.sql.ResultSet;//Import resultset to process the results from the
import java.util.ArrayList;//Import Arraylist to return the response in
import java.util.HashMap;// We will use map for the row in a key value pair
import java.util.List;//Interface for ArrayList

public class UserSQLDao
{
    private static String LOCATION = "testdb.hsql";
    public static List findAll()throws Exception
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try
        {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");//Load the driver
            connection = DriverManager.getConnection(//Get the connection
                    "jdbc:hsqldb:file:" + LOCATION + ";ifexists=true,shutdown=true", "SA", "");
            preparedStatement = connection.prepareStatement("Select * From User");//Prepare the SQL statement
            rs = preparedStatement.executeQuery();//Execute SQL
            List listResponse = new ArrayList();
            while (rs.next())
            {//Iterate through the resultset
                HashMap row = new HashMap();//Add rows to the response list
                row.put("id", rs.getInt("id"));
                row.put("name", rs.getString("name"));
                row.put("surname", rs.getString("surname"));
                row.put("dob", rs.getString("dob"));
                row.put("email", rs.getString("email"));
                listResponse.add(row);
            } return listResponse;
//We do not catch any exception because we want them to propagate
        }finally
        {//Always close connections before leaving the DAO
            if(null != rs)rs.close();
            if(null != preparedStatement)preparedStatement.close();
            if(null != connection)connection.close();
        }
    }
}
