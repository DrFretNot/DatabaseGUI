/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databasechanger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author JSU
 */
public class DatabaseChanger {
    private static Connection conn = null;
    private static PreparedStatement stat = null;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        try {
            // load the JDBC driver class
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Couldn't load the JDBC driver.");
            System.exit(1);
        }
        
        openConnection("jdbc:hsqldb:file:sampledata");
        openStatement();
        
        // get information from user
        System.out.print("Enter ProductID: ");
        int productID = userInput.nextInt();
        
        System.out.print("Enter the product name: ");
        userInput.nextLine();
        String productName = userInput.nextLine();
        
        System.out.print("Enter the product price: ");
        double price = userInput.nextDouble();
        
        System.out.print("Enter the product weight: ");
        double weight = userInput.nextDouble();
        
        System.out.print("Enter the description: ");
        userInput.nextLine();
        String description = userInput.nextLine();
        
        // create and output query
        String query = "INSERT INTO Products VALUES " +
                    "(" + productID + ", '" + productName + "', " +
                    price + ", " + weight + ", '" + description
                    + "');";
        System.out.println(query);
        
        try {
            // fill in the ?'s in the statement
            stat.setInt(1, productID);
            stat.setString(2, productName);
            stat.setDouble(3, price);
            stat.setDouble(4, weight);
            stat.setString(5, description);
            
            // run the statement
            stat.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private static void openConnection(String url) {
        try {
            // create a connection to the database
            conn = DriverManager.getConnection(
                url, // JDBC URL
                "SA", // username
                "");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }
    
    private static void openStatement() {
        try {
            stat = conn.prepareStatement(
                    "INSERT INTO Products VALUES " +
                    "(?, ?, ?, ?, ?);");
        } catch (SQLException ex) {
            ex.printStackTrace();
            
            try {
                conn.close();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
            
            System.exit(1);
        }
    }
}
