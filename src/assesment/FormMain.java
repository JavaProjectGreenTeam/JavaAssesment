package assesment;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author 3100298414
 */
//Main Form done by Nick
public class FormMain extends javax.swing.JFrame {
    //Initialize & Define Variables
    String currentUser;
    User user;
    
    FormOutput formOutput;
    
    ArrayList<String> comboDefaultArray = new ArrayList();
    ArrayList<String> combo1Array = new ArrayList<>();
    ArrayList<String> combo2Array = new ArrayList<>();
    ArrayList<String> combo3Array = new ArrayList<>();
    ArrayList<String> combo4Array = new ArrayList<>();
    ArrayList<String> combo5Array = new ArrayList<>();
    ArrayList<String> combo6Array = new ArrayList<>();
    
    /**
     * Creates new form FormMain
     * @param user
     */
    public FormMain(User user) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //this.setExtendedState(this.getExtendedState() | FormMain.MAXIMIZED_BOTH);
        
        //user = new User("test", "man", "test@.", "test", 0, 2, 1, "Town", null);
        
        //Set the current user label
        if (user != null) {
            String firstInitial = user.getFirstName().substring(0, 1).toUpperCase();
            String firstNameNoInitial = user.getFirstName().substring(1);
            String lastInitial = user.getLastName().substring(0, 1).toUpperCase();
            currentUser = firstInitial + firstNameNoInitial + " " + lastInitial;
            lblUser.setText(currentUser);
        } else {
            lblUser.setText("Current User");
        }
        
        comboDefaultArray.addAll(Arrays.asList("Select An Option..."));
        
        combo1Array.addAll(Arrays.asList("Select An Option...", "Business", "Creaetive Industries", "Health", "Community Services"));
        combo2Array.addAll(Arrays.asList("Select An Option...", "Accounting", "Business", "Human Resources", "Information Technology", "Management", "Tourism & Hospitality"));
        combo3Array.addAll(Arrays.asList("Select An Option...", "Career Pathways", "Essential Employability Skills"));
        combo4Array.addAll(Arrays.asList("Select An Option...", "Cert IV in IT", "Diploma of Software Development", "Diploma of Networking"));
        combo5Array.addAll(Arrays.asList("Select An Option...", "Trainee Application Programmer", "Trainee Business/System's Analyst", "Web Developer", "Trainee Database Programmer", "Trainee Programming Tester", "Trainee Maintenance Programmer", "Articulation Pathway to Bachelor in IT"));
        combo6Array.addAll(Arrays.asList("Select An Option...", "Job Description", "Statistical Data On Demand/Salary Range"));
        
        cbx1.setModel(new javax.swing.DefaultComboBoxModel(combo1Array.toArray()));
        cbx2.setModel(new javax.swing.DefaultComboBoxModel(comboDefaultArray.toArray()));
        cbx3.setModel(new javax.swing.DefaultComboBoxModel(comboDefaultArray.toArray()));
        cbx4.setModel(new javax.swing.DefaultComboBoxModel(comboDefaultArray.toArray()));
        cbx5.setModel(new javax.swing.DefaultComboBoxModel(comboDefaultArray.toArray()));
        cbx6.setModel(new javax.swing.DefaultComboBoxModel(comboDefaultArray.toArray()));
        
        cbx2.setEnabled(false);
        cbx3.setEnabled(false);
        cbx4.setEnabled(false);
        cbx5.setEnabled(false);
        cbx6.setEnabled(false);
        
        //btnSubmit.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        cbx4 = new javax.swing.JComboBox();
        cbx5 = new javax.swing.JComboBox();
        cbx1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cbx2 = new javax.swing.JComboBox();
        cbx3 = new javax.swing.JComboBox();
        cbx6 = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        cbx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(cbx4, gridBagConstraints);

        cbx5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(cbx5, gridBagConstraints);

        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(cbx1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Find My Career");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 32, 0, 32);
        jPanel1.add(jLabel1, gridBagConstraints);

        jSeparator1.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 2, 0);
        jPanel1.add(jSeparator1, gridBagConstraints);

        cbx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(cbx2, gridBagConstraints);

        cbx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(cbx3, gridBagConstraints);

        cbx6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        jPanel1.add(cbx6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 10, 0);
        jPanel1.add(jSeparator3, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        btnExit.setText("Exit");
        btnExit.setMaximumSize(new java.awt.Dimension(65, 28));
        btnExit.setMinimumSize(new java.awt.Dimension(65, 28));
        btnExit.setPreferredSize(new java.awt.Dimension(65, 28));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 0, 0);
        jPanel3.add(btnExit, gridBagConstraints);

        btnSubmit.setText("Submit");
        btnSubmit.setMaximumSize(new java.awt.Dimension(65, 28));
        btnSubmit.setMinimumSize(new java.awt.Dimension(65, 28));
        btnSubmit.setPreferredSize(new java.awt.Dimension(65, 28));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 2);
        jPanel3.add(btnSubmit, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(jPanel3, gridBagConstraints);

        lblUser.setText("Logged In User");
        lblUser.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lblUserInputMethodTextChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        jPanel1.add(lblUser, gridBagConstraints);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Options...", "Edit Information", "Log Out" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        jPanel1.add(jComboBox2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
        if (cbx1.getSelectedIndex() != 0) {
            if (cbx1.getSelectedItem().toString().equals("Business")) {
                cbx2.setEnabled(true);
                cbx2.setModel(new javax.swing.DefaultComboBoxModel(combo2Array.toArray()));
            
            }
        } else {
            cbx2.setModel(new javax.swing.DefaultComboBoxModel(comboDefaultArray.toArray()));
            cbx2.setSelectedIndex(0);
            cbx2.setEnabled(false);
        }
    }//GEN-LAST:event_cbx1ActionPerformed

    private void cbx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx2ActionPerformed
        if (cbx2.getSelectedIndex() != 0) {
            if (cbx2.getSelectedItem().toString().equals("Information Technology")) {
                cbx3.setEnabled(true);
                cbx3.setModel(new javax.swing.DefaultComboBoxModel(combo3Array.toArray()));
            
            }
        } else {
            cbx3.setModel(new javax.swing.DefaultComboBoxModel(comboDefaultArray.toArray()));
            cbx3.setSelectedIndex(0);
            cbx3.setEnabled(false);
        }
    }//GEN-LAST:event_cbx2ActionPerformed

    private void cbx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx3ActionPerformed
        if (cbx3.getSelectedIndex() != 0) {
            if (cbx3.getSelectedItem().toString().equals("Career Pathways")) {
                cbx4.setEnabled(true);
                cbx4.setModel(new javax.swing.DefaultComboBoxModel(combo4Array.toArray()));
            
            }
        } else {
            cbx4.setModel(new javax.swing.DefaultComboBoxModel(comboDefaultArray.toArray()));
            cbx4.setSelectedIndex(0);
            cbx4.setEnabled(false);
        }
    }//GEN-LAST:event_cbx3ActionPerformed

    private void cbx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx4ActionPerformed
        if (cbx4.getSelectedIndex() != 0) {
            if (cbx4.getSelectedItem().toString().equals("Diploma of Software Development")) {
                cbx5.setEnabled(true);
                cbx5.setModel(new javax.swing.DefaultComboBoxModel(combo5Array.toArray()));
            
            }
        } else {
            cbx5.setModel(new javax.swing.DefaultComboBoxModel(comboDefaultArray.toArray()));
            cbx5.setSelectedIndex(0);
            cbx5.setEnabled(false);
        }
    }//GEN-LAST:event_cbx4ActionPerformed

    private void cbx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx5ActionPerformed
        if (cbx5.getSelectedIndex() != 0) {
            if (cbx5.getSelectedItem().toString().equals("Trainee Application Programmer")) {
                cbx6.setEnabled(true);
                cbx6.setModel(new javax.swing.DefaultComboBoxModel(combo6Array.toArray()));
            
            }
        } else {
            cbx6.setModel(new javax.swing.DefaultComboBoxModel(comboDefaultArray.toArray()));
            cbx6.setSelectedIndex(0);
            cbx6.setEnabled(false);
        }
    }//GEN-LAST:event_cbx5ActionPerformed

    private void cbx6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx6ActionPerformed
        if (cbx6.getSelectedIndex() != 0) {
            btnSubmit.setEnabled(true);
        
        } else {
            btnSubmit.setEnabled(false);
        }
    }//GEN-LAST:event_cbx6ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if (formOutput == null) {
            formOutput = new FormOutput(user);
        }
        formOutput.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void lblUserInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblUserInputMethodTextChanged
        // TODO add your handling code here:
//        System.getProperty(firstName);
//        String queryString = "SELECT firstName FROM user WHERE id = ?";
    }//GEN-LAST:event_lblUserInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbx1;
    private javax.swing.JComboBox cbx2;
    private javax.swing.JComboBox cbx3;
    private javax.swing.JComboBox cbx4;
    private javax.swing.JComboBox cbx5;
    private javax.swing.JComboBox cbx6;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    public javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
