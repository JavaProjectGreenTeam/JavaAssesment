/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assesment;

/**
 *
 * @author 8100627115
 */
public class EditUser extends javax.swing.JFrame {

    /**
     * Creates new form editUser
     */
    public EditUser() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        btngrpSex = new javax.swing.ButtonGroup();
        pnlEditUser = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        cbxState = new javax.swing.JComboBox();
        txtTown = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblTown = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        btnpnlSex = new javax.swing.JPanel();
        radbtnOther = new javax.swing.JRadioButton();
        radbtnMale = new javax.swing.JRadioButton();
        radbtnFemale = new javax.swing.JRadioButton();
        cbxpnlDateOfBirth = new javax.swing.JPanel();
        cbxDay = new javax.swing.JComboBox();
        cbxMonth = new javax.swing.JComboBox();
        cbxYear = new javax.swing.JComboBox();
        btnpnlPageControls = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        lblPasswordConfirm = new javax.swing.JLabel();
        cbxpnlUserSelect = new javax.swing.JPanel();
        cbxUserSelect = new javax.swing.JComboBox();
        pwdPassword = new javax.swing.JPasswordField();
        pwdConfirmPassword = new javax.swing.JPasswordField();
        lblAccountType = new javax.swing.JLabel();
        cbxAccountType = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlEditUser.setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("Edit User");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        pnlEditUser.add(lblTitle, gridBagConstraints);

        cbxState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select your state", "Queensland", "New South Wales", "Australian Capital Territory", "Victoria", "Tasmania", "South Australia", "Western Australia", "Northern Territory" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        pnlEditUser.add(cbxState, gridBagConstraints);

        txtTown.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTown.setMaximumSize(new java.awt.Dimension(2147483647, 27));
        txtTown.setMinimumSize(new java.awt.Dimension(170, 27));
        txtTown.setPreferredSize(new java.awt.Dimension(170, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        pnlEditUser.add(txtTown, gridBagConstraints);

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        pnlEditUser.add(lblEmail, gridBagConstraints);

        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setText("someone@example.com");
        txtEmail.setMaximumSize(new java.awt.Dimension(2147483647, 27));
        txtEmail.setMinimumSize(new java.awt.Dimension(170, 27));
        txtEmail.setPreferredSize(new java.awt.Dimension(170, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        pnlEditUser.add(txtEmail, gridBagConstraints);

        lblTown.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTown.setText("Town");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        pnlEditUser.add(lblTown, gridBagConstraints);

        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFirstName.setMaximumSize(new java.awt.Dimension(2147483647, 27));
        txtFirstName.setMinimumSize(new java.awt.Dimension(170, 27));
        txtFirstName.setPreferredSize(new java.awt.Dimension(170, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        pnlEditUser.add(txtFirstName, gridBagConstraints);

        lblState.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblState.setText("State");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        pnlEditUser.add(lblState, gridBagConstraints);

        lblFirstName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFirstName.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        pnlEditUser.add(lblFirstName, gridBagConstraints);

        txtSurname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSurname.setMaximumSize(new java.awt.Dimension(2147483647, 27));
        txtSurname.setMinimumSize(new java.awt.Dimension(170, 27));
        txtSurname.setPreferredSize(new java.awt.Dimension(170, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        pnlEditUser.add(txtSurname, gridBagConstraints);

        lblDateOfBirth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDateOfBirth.setText("Date of Birth");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        pnlEditUser.add(lblDateOfBirth, gridBagConstraints);

        lblSurname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSurname.setText("Surname");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        pnlEditUser.add(lblSurname, gridBagConstraints);

        lblSex.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSex.setText("Sex");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        pnlEditUser.add(lblSex, gridBagConstraints);

        btnpnlSex.setLayout(new java.awt.GridBagLayout());

        btngrpSex.add(radbtnOther);
        radbtnOther.setText("Other");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        btnpnlSex.add(radbtnOther, gridBagConstraints);

        btngrpSex.add(radbtnMale);
        radbtnMale.setText("Male");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        btnpnlSex.add(radbtnMale, gridBagConstraints);

        btngrpSex.add(radbtnFemale);
        radbtnFemale.setText("Female");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        btnpnlSex.add(radbtnFemale, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        pnlEditUser.add(btnpnlSex, gridBagConstraints);

        cbxpnlDateOfBirth.setLayout(new java.awt.GridBagLayout());

        cbxDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        cbxpnlDateOfBirth.add(cbxDay, gridBagConstraints);

        cbxMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        cbxpnlDateOfBirth.add(cbxMonth, gridBagConstraints);

        cbxYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        cbxpnlDateOfBirth.add(cbxYear, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        pnlEditUser.add(cbxpnlDateOfBirth, gridBagConstraints);

        btnpnlPageControls.setLayout(new java.awt.GridBagLayout());

        btnBack.setText("Back");
        btnBack.setMaximumSize(new java.awt.Dimension(80, 28));
        btnBack.setMinimumSize(new java.awt.Dimension(80, 28));
        btnBack.setPreferredSize(new java.awt.Dimension(80, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        btnpnlPageControls.add(btnBack, gridBagConstraints);

        btnSubmit.setText("Submit");
        btnSubmit.setMaximumSize(new java.awt.Dimension(80, 28));
        btnSubmit.setMinimumSize(new java.awt.Dimension(80, 28));
        btnSubmit.setPreferredSize(new java.awt.Dimension(80, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        btnpnlPageControls.add(btnSubmit, gridBagConstraints);

        btnExit.setText("Exit");
        btnExit.setMaximumSize(new java.awt.Dimension(80, 28));
        btnExit.setMinimumSize(new java.awt.Dimension(80, 28));
        btnExit.setPreferredSize(new java.awt.Dimension(80, 28));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        btnpnlPageControls.add(btnExit, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        pnlEditUser.add(btnpnlPageControls, gridBagConstraints);

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPassword.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        pnlEditUser.add(lblPassword, gridBagConstraints);

        lblPasswordConfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPasswordConfirm.setText("Confirm Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        pnlEditUser.add(lblPasswordConfirm, gridBagConstraints);

        cbxpnlUserSelect.setLayout(new java.awt.GridBagLayout());

        cbxUserSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a user to edit", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        cbxpnlUserSelect.add(cbxUserSelect, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        pnlEditUser.add(cbxpnlUserSelect, gridBagConstraints);

        pwdPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdPassword.setMaximumSize(new java.awt.Dimension(170, 27));
        pwdPassword.setMinimumSize(new java.awt.Dimension(170, 27));
        pwdPassword.setPreferredSize(new java.awt.Dimension(170, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        pnlEditUser.add(pwdPassword, gridBagConstraints);

        pwdConfirmPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwdConfirmPassword.setMaximumSize(new java.awt.Dimension(170, 27));
        pwdConfirmPassword.setMinimumSize(new java.awt.Dimension(170, 27));
        pwdConfirmPassword.setPreferredSize(new java.awt.Dimension(170, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        pnlEditUser.add(pwdConfirmPassword, gridBagConstraints);

        lblAccountType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAccountType.setText("Account Type");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 0);
        pnlEditUser.add(lblAccountType, gridBagConstraints);

        cbxAccountType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Standard User", "Administrator" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 4, 0);
        pnlEditUser.add(cbxAccountType, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(pnlEditUser, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup btngrpSex;
    private javax.swing.JPanel btnpnlPageControls;
    private javax.swing.JPanel btnpnlSex;
    private javax.swing.JComboBox cbxAccountType;
    private javax.swing.JComboBox cbxDay;
    private javax.swing.JComboBox cbxMonth;
    private javax.swing.JComboBox cbxState;
    private javax.swing.JComboBox cbxUserSelect;
    private javax.swing.JComboBox cbxYear;
    private javax.swing.JPanel cbxpnlDateOfBirth;
    private javax.swing.JPanel cbxpnlUserSelect;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordConfirm;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTown;
    private javax.swing.JPanel pnlEditUser;
    private javax.swing.JPasswordField pwdConfirmPassword;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JRadioButton radbtnFemale;
    private javax.swing.JRadioButton radbtnMale;
    private javax.swing.JRadioButton radbtnOther;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtTown;
    // End of variables declaration//GEN-END:variables
}
