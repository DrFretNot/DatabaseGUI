/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexample;

import java.sql.*;
import javax.swing.UIManager;


/**
 *
 * @author trentford
 */
public class MainWindow extends javax.swing.JFrame {
    public int CurrentID;
    public int MAXID;
    private static Connection conn = null;
    private static PreparedStatement stat = null;
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        /*
        /how to set Textfield to some text
        nameTextField.setText("TEXT here losers");
        */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IntroLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        joinDateLabel = new javax.swing.JLabel();
        joinDateTextField = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        customerIdLabel = new javax.swing.JLabel();
        customerIdTextField = new javax.swing.JTextField();
        initialReadButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        clearFieldsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.cyan);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        IntroLabel.setFont(new java.awt.Font("Lucida Console", 0, 24)); // NOI18N
        IntroLabel.setText("Customer Database Editor");

        firstNameLabel.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        firstNameLabel.setText("First Name: ");

        firstNameTextField.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        lastNameLabel.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        lastNameLabel.setText("Last Name:");

        lastNameTextField.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        cityLabel.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cityLabel.setText("City: ");

        cityTextField.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        stateLabel.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        stateLabel.setText("State:");

        stateTextField.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        phoneNumberLabel.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        phoneNumberLabel.setText("Phone Number");

        phoneNumberTextField.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        phoneNumberTextField.setText("XXX-XXX-XXXX");

        joinDateLabel.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        joinDateLabel.setText("JoinDate");

        joinDateTextField.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        joinDateTextField.setText("YEAR-MO-DA");
        joinDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinDateTextFieldActionPerformed(evt);
            }
        });

        dobLabel.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        dobLabel.setText("DOB");

        dobTextField.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        dobTextField.setText("YEAR-MO-DA");
        dobTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTextFieldActionPerformed(evt);
            }
        });

        customerIdLabel.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        customerIdLabel.setText("CustomerID: ");

        customerIdTextField.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N

        initialReadButton.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        initialReadButton.setText("Read First Record");
        initialReadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialReadButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        deleteButton.setText("Delete Record");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        newButton.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        newButton.setText("New Record");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        saveButton.setText("Save Changes");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        nextButton.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        nextButton.setText("Next Record");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        previousButton.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        previousButton.setText("Previous Record");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        clearFieldsButton.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        clearFieldsButton.setText("Clear Fields");
        clearFieldsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IntroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lastNameLabel)
                .addComponent(cityLabel)
                .addComponent(stateLabel)
                .addComponent(customerIdLabel)
                .addComponent(firstNameLabel)
                .addComponent(phoneNumberLabel)
                .addComponent(dobLabel)
                .addComponent(joinDateLabel)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(previousButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(initialReadButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(nextButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearFieldsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dobTextField)
                            .addComponent(joinDateTextField)
                            .addComponent(customerIdTextField)
                            .addComponent(firstNameTextField)
                            .addComponent(lastNameTextField)
                            .addComponent(cityTextField)
                            .addComponent(stateTextField)
                            .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IntroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousButton)
                    .addComponent(initialReadButton)
                    .addComponent(nextButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerIdLabel)
                    .addComponent(customerIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityLabel)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateLabel)
                    .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joinDateLabel)
                    .addComponent(joinDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel)
                    .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(newButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearFieldsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initialReadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialReadButtonActionPerformed
        initEntry();
    }//GEN-LAST:event_initialReadButtonActionPerformed

    private void dobTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTextFieldActionPerformed

    private void joinDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joinDateTextFieldActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        prevEntry();

    }//GEN-LAST:event_previousButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        
        nextEntry();

        // TODO add your handling code here:
    }//GEN-LAST:event_nextButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        addnew();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_newButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        delete();
        blankFields();
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        delete();
        addnew();
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void clearFieldsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsButtonActionPerformed
        blankFields();
    }//GEN-LAST:event_clearFieldsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    private void delete(){
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

            CurrentID = Integer.parseInt(customerIdTextField.getText());
            
            // Execute the SQL query
            ResultSet rs = st.executeQuery("DELETE FROM Customers WHERE CustomerId = "+ CurrentID + ";");
                        
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.err.println("Something went wrong. :-(");
            System.exit(1);
        }
        
    }
    
    private void addnew(){
    
        try {
            // load the JDBC driver class
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Couldn't load the JDBC driver.");
            System.exit(1);
        }
        
        openConnection("jdbc:hsqldb:file:sampledata");
        openStatement();
        
        try {
            // fill in the ?'s in the statement
            stat.setInt(1, Integer.parseInt(customerIdTextField.getText()));//CustomerID
            stat.setString(2, firstNameTextField.getText());//FirstName
            stat.setString(3, lastNameTextField.getText()); //LastName
            stat.setString(4, cityTextField.getText());//city
            stat.setString(5, stateTextField.getText());//state
            stat.setString(6, phoneNumberTextField.getText());//phoneNumber
            stat.setString(7, joinDateTextField.getText());//joinDate
            stat.setString(8, dobTextField.getText());//dob
            
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
    private void getMax(){
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
   
            // Loop through the rows
            while (rs.next()) {
                // Process one row of the data
                int id = rs.getInt("CUSTOMERID");
                MAXID = id;
                String fName = rs.getString("FIRSTNAME");
                String lName = rs.getString("LASTNAME");
                Date dob = rs.getDate("DOB");
                
            }
            
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.err.println("Something went wrong. :-(");
            System.exit(1);
        }
    
    
    
    }
    private void initEntry(){
    
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
            ResultSet rs = st.executeQuery("SELECT * FROM Customers WHERE CustomerId = 0;");
            
            while (rs.next()) {
                int id = rs.getInt("CUSTOMERID");
                CurrentID = id;
                String fName = rs.getString("FIRSTNAME");
                String lName = rs.getString("LASTNAME");
                //Date dob = rs.getDate("DOB");
                customerIdTextField.setText(""+ id);
                firstNameTextField.setText(fName);
                lastNameTextField.setText(lName);
                cityTextField.setText(rs.getString("CITY"));
                stateTextField.setText(rs.getString("STATE"));
                phoneNumberTextField.setText(rs.getString("PHONENUMBER"));
                joinDateTextField.setText(rs.getString("JOINDATE"));
                dobTextField.setText(rs.getString("DOB"));
             }
                
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.err.println("Something went wrong. :-(");
            System.exit(1);
        }
    }
    private void nextEntry(){
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
            getMax();
            if (CurrentID == MAXID){ CurrentID = CurrentID;}
            else{CurrentID++;}
            // Execute the SQL query
            ResultSet rs = st.executeQuery("SELECT * FROM Customers WHERE CustomerId = "+ CurrentID + ";");
            
            
            // Loop through the rows
            while (rs.next()) {
                // Process one row of the data
                int id = rs.getInt("CUSTOMERID");
                String fName = rs.getString("FIRSTNAME");
                String lName = rs.getString("LASTNAME");
                Date dob = rs.getDate("DOB");
                customerIdTextField.setText(""+ id);
                firstNameTextField.setText(fName);
                lastNameTextField.setText(lName);
                cityTextField.setText(rs.getString("CITY"));
                stateTextField.setText(rs.getString("STATE"));
                phoneNumberTextField.setText(rs.getString("PHONENUMBER"));
                joinDateTextField.setText(rs.getString("JOINDATE"));
                dobTextField.setText(rs.getString("DOB"));
            }

            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.err.println("Something went wrong. :-(");
            System.exit(1);
        }
    }
    private void prevEntry(){
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
            if(CurrentID != 0){CurrentID--;}
            else{CurrentID = 0;}
            // Execute the SQL query
            ResultSet rs = st.executeQuery("SELECT * FROM Customers WHERE CustomerId = "+ CurrentID + ";");
           
            // Loop through the rows
            while (rs.next()) {
                // Process one row of the data
                int id = rs.getInt("CUSTOMERID");
                String fName = rs.getString("FIRSTNAME");
                String lName = rs.getString("LASTNAME");
                Date dob = rs.getDate("DOB");
                customerIdTextField.setText(""+ id);
                firstNameTextField.setText(fName);
                lastNameTextField.setText(lName);
                cityTextField.setText(rs.getString("CITY"));
                stateTextField.setText(rs.getString("STATE"));
                phoneNumberTextField.setText(rs.getString("PHONENUMBER"));
                joinDateTextField.setText(rs.getString("JOINDATE"));
                dobTextField.setText(rs.getString("DOB"));
                
            }
            
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.err.println("Something went wrong. :-(");
            System.exit(1);
        }
    }
    private void blankFields(){
        customerIdTextField.setText("");
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        cityTextField.setText("");
        stateTextField.setText("");
        phoneNumberTextField.setText("");
        joinDateTextField.setText("");
        dobTextField.setText("");
        
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
                    "INSERT INTO Customers VALUES " +
                    "(?, ?, ?, ?, ?, ?, ?, ?);");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IntroLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton clearFieldsButton;
    private javax.swing.JLabel customerIdLabel;
    private javax.swing.JTextField customerIdTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JButton initialReadButton;
    private javax.swing.JLabel joinDateLabel;
    private javax.swing.JTextField joinDateTextField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton newButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField stateTextField;
    // End of variables declaration//GEN-END:variables
}
