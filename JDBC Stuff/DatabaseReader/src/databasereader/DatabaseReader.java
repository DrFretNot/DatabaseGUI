/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databasereader;

import java.sql.*;

/**
 *
 * @author JSU
 */
public class DatabaseReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // load and register the JDBC driver
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Driver could not be loaded. Exiting.");
            System.exit(1);
        }
        
        // create a connection to the database
        try (Connection conn =
                DriverManager.getConnection(
                    "jdbc:hsqldb:file:sampledata", "SA", ""))
        {
            // Work with the database
            System.out.println("Connection opened successfully!");
            
            // Create the statement object
            Statement st = conn.createStatement();
            
            // Execute the SQL query
            ResultSet rs = st.executeQuery("SELECT * FROM Customers");
            
            //System.out.println("<?xml version=\"1.0\"/>");
            //System.out.println("<customers>");
            
            // Loop through the rows
            while (rs.next()) {
                // Process one row of the data
                int id = rs.getInt("CUSTOMERID");
                String fName = rs.getString("FIRSTNAME");
                String lName = rs.getString("LASTNAME");
                Date dob = rs.getDate("DOB");
                /*
                System.out.println(
                        "  <customer>\n" +
                        "    <customerid>" + (id + 1) + "</customerid>\n" +
                        "    <firstname>" + fName + "</firstname>\n" +
                        "    <lastname>" + lName + "</lastname>\n" +
                        "    <birthdate>\n" +
                        "      <year>" + dob.getYear() + "</year>\n" +
                        "      <month>" + dob.getMonth() + "</month>\n" +
                        "      <day>" + dob.getDay() + "</day>\n" +
                        "    </birthdate>\n" +
                        "  </customer>");*/
            }
            
            //System.out.println("</customers>");
            
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.err.println("Something went wrong. :-(");
            System.exit(1);
        }
    }
}
