/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author alegAsus
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        borrowertab = new javax.swing.JPanel();
        SSNTextField = new javax.swing.JTextField();
        FirstNameTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        AddressTextField = new javax.swing.JTextField();
        AddBorrowerButton = new javax.swing.JButton();
        lookuptab = new javax.swing.JPanel();
        SearchField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        finestab = new javax.swing.JPanel();
        viewfinesbutton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("McDermott Library Book Database");

        SSNTextField.setText("SSN");

        FirstNameTextField.setText("First Name");

        LastNameTextField.setText("Last Name");

        AddressTextField.setText("Address");

        AddBorrowerButton.setText("Add");
        AddBorrowerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBorrowerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout borrowertabLayout = new javax.swing.GroupLayout(borrowertab);
        borrowertab.setLayout(borrowertabLayout);
        borrowertabLayout.setHorizontalGroup(
            borrowertabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowertabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(borrowertabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borrowertabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AddressTextField)
                        .addComponent(LastNameTextField)
                        .addComponent(FirstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(SSNTextField))
                    .addComponent(AddBorrowerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(584, Short.MAX_VALUE))
        );
        borrowertabLayout.setVerticalGroup(
            borrowertabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrowertabLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(SSNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddBorrowerButton)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Borrowers", borrowertab);

        SearchField.setText("101010");
        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Search with any combination of ISBN, Book Title, Author(s) seperating each field with a tab");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout lookuptabLayout = new javax.swing.GroupLayout(lookuptab);
        lookuptab.setLayout(lookuptabLayout);
        lookuptabLayout.setHorizontalGroup(
            lookuptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lookuptabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lookuptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        lookuptabLayout.setVerticalGroup(
            lookuptabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lookuptabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Book Lookup", lookuptab);

        viewfinesbutton.setText("View Fines Table");
        viewfinesbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewfinesbuttonActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout finestabLayout = new javax.swing.GroupLayout(finestab);
        finestab.setLayout(finestabLayout);
        finestabLayout.setHorizontalGroup(
            finestabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finestabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(finestabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(finestabLayout.createSequentialGroup()
                        .addComponent(viewfinesbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE))
                .addContainerGap())
        );
        finestabLayout.setVerticalGroup(
            finestabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finestabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewfinesbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fines", finestab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //!!!IMPORTANT!!!
    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        
    }//GEN-LAST:event_SearchFieldActionPerformed
    
    //!!!IMPORTANT!!!
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        String text = SearchField.getText(); //will throw exception if null
        String connectorQuery = queryGeneration(text);
        System.out.println(connectorQuery);
        try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbfinal?characterEncoding=latin1", "root", "#tabebuiA5");
			Statement stmt = con.createStatement();
			
			PreparedStatement st = (PreparedStatement) con.prepareStatement(connectorQuery);
            System.out.println("Going to execute query");
            
			ResultSet rs = st.executeQuery(connectorQuery);
			System.out.println("Query has been executed");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4));
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
                }
		
    }//GEN-LAST:event_SearchButtonActionPerformed
    
    //!!!IMPORTANT!!!
    private void AddBorrowerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBorrowerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBorrowerButtonActionPerformed
    
    //!!!IMPORTANT!!!
    private void viewfinesbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewfinesbuttonActionPerformed
        // TODO add your handling code here:
    	String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    	float fineAmt = 0;
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbfinal?characterEncoding=latin1", "root", "#tabebuiA5");
			Statement stmt = con.createStatement();
			ResultSet rs1=stmt.executeQuery("Select * from fines where  Paid=0;");
    	} catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	
    	
    	
    }//GEN-LAST:event_viewfinesbuttonActionPerformed
    
    //!!!IMPORTANT!!!
    private static String queryGeneration(String textfield){
        int counter = 0;
        String query = " ";
    	List<Pattern> patterns = new ArrayList<>();
        
        //only isbn
        patterns.add(Pattern.compile("^(\\d{10}|\\d{13})$"));

        //only title or only author
        patterns.add(Pattern.compile("^.+$"));

        //isbn and title and author
        patterns.add(Pattern.compile("^(\\d{10}|\\d{13})\\t.+\\t.+$"));
        patterns.add(Pattern.compile("^\\t.+(\\d{10}|\\d{13})\\t.+$"));
        patterns.add(Pattern.compile("^\\t.+\\t.+(\\d{10}|\\d{13})$"));

        //isbn and title/author
        patterns.add(Pattern.compile("^(\\d{10}|\\d{13})\\t.+$"));
        patterns.add(Pattern.compile("^\\t.+(\\d{10}|\\d{13})$"));

        //title and author
        patterns.add(Pattern.compile("^\\t.+\\t.+$"));

        for(Pattern pattern : patterns) {
			if(pattern.matcher(textfield).matches()) {
				//only isbn
				if(counter == 0) {
					return query = String.format("SELECT book.ISBN, Title, Name AS Author, Availability From dbfinal.book, dbfinal.book_authors AS A, "
							+ "dbfinal.authors AS B WHERE book.ISBN = '%s' AND A.ISBN = '%s' AND A.author_ID = B.author_ID;",textfield,textfield);
					
				}
				//only title or author
				if(counter == 1) {
					
				}
				//isbn and title and author
				if((counter == 2) || (counter == 3) || (counter == 4)) {
					
				}
				//isbn and title/author
				if((counter == 5) || (counter == 6)) {
					
				}
		        //title and author
				if(counter == 7) {
					
				}
			}
			counter++;
        }
        return null;
    }
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBorrowerButton;
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JTextField SSNTextField;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchField;
    private javax.swing.JPanel borrowertab;
    private javax.swing.JPanel finestab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel lookuptab;
    private javax.swing.JButton viewfinesbutton;
    // End of variables declaration//GEN-END:variables
}