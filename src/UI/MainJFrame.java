/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.DB4OUtil.DB4OUtil;
import Model.EcoSystem;
import Model.Enterprises.Enterprise;
import Model.Networks.Network;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import Model.storage.PatientDirectory;
import java.awt.CardLayout;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aakrutighatole
 */
public class MainJFrame extends javax.swing.JFrame {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private PatientDirectory patientDirectory;
    
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        logoutJButton.setVisible(false);
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        loginPanel = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        container = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setBackground(new java.awt.Color(15, 58, 59));
        loginPanel.setForeground(new java.awt.Color(238, 238, 238));
        loginPanel.setMaximumSize(new java.awt.Dimension(200, 1080));
        loginPanel.setMinimumSize(new java.awt.Dimension(200, 1080));
        loginPanel.setPreferredSize(new java.awt.Dimension(200, 1080));
        loginPanel.setSize(new java.awt.Dimension(200, 1080));

        loginJButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(15, 58, 59));
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        userNameJTextField.setBackground(new java.awt.Color(15, 58, 59));
        userNameJTextField.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        userNameJTextField.setForeground(new java.awt.Color(238, 238, 238));
        userNameJTextField.setToolTipText("");
        userNameJTextField.setBorder(null);
        userNameJTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        userNameJTextField.setDisabledTextColor(new java.awt.Color(15, 58, 59));
        userNameJTextField.setSelectedTextColor(new java.awt.Color(54, 33, 89));
        userNameJTextField.setSelectionColor(new java.awt.Color(54, 33, 89));
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(15, 58, 59));
        passwordField.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        passwordField.setForeground(new java.awt.Color(238, 238, 238));
        passwordField.setBorder(null);
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField.setDisabledTextColor(new java.awt.Color(15, 58, 59));
        passwordField.setSelectionColor(new java.awt.Color(54, 33, 89));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER NAME");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD");

        logoutJButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        logoutJButton.setForeground(new java.awt.Color(15, 58, 59));
        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Sign In");

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(loginPanel);

        container.setMaximumSize(new java.awt.Dimension(800, 1050));
        container.setMinimumSize(new java.awt.Dimension(800, 1050));
        container.setPreferredSize(new java.awt.Dimension(420, 520));
        container.setLayout(new java.awt.CardLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setMaximumSize(new java.awt.Dimension(811768, 450876));
        container.add(jLabel4, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;
                
        if (userAccount == null) {
            //Step 2: Go inside each network and check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step 3:check against each organization for each enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }
        if (userAccount == null) {
            JDialog showMessageDialog = new JDialog();
            showMessageDialog.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog((this), "Invalid credentials");
            return;

        } else {
            //loginPanel.setVisible(false);
            CardLayout layout = (CardLayout) container.getLayout();
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system, patientDirectory));
            layout.next(container);

        }
        
//        if (userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234")) {
//            SystemAdminWorkArea sawa = new SystemAdminWorkArea(container,system);
//            container.add("SystemAdminWorkArea", sawa);
//            layout.next(container);
//        }else if (userName.equalsIgnoreCase("hospitalAdmin") && password.equalsIgnoreCase("admin123")) {
//            HospitalAdminWorkArea hwa = new HospitalAdminWorkArea();
//            container.add("HospitalAdminWorkArea", hwa);
//            layout.next(container);
//        } else if (userName.equalsIgnoreCase("doctor") && password.equalsIgnoreCase("doctor123")) {
////            DoctorWorkArea dwa = new DoctorWorkArea(container);
////            container.add("DoctorWorkArea", dwa);
////
////            layout.next(container);
//        } else if (userName.equalsIgnoreCase("labtech") && password.equalsIgnoreCase("lab123")) {
////            LabTechWorkArea ltw = new LabTechWorkArea(container);
////            container.add("LabTechWorkArea", ltw);
////
////            layout.next(container);
//        } else if (userName.equalsIgnoreCase("frontdesk") && password.equalsIgnoreCase("desk123")) {
////            FrontDeskWorkArea fdwa = new FrontDeskWorkArea(container);
////            container.add("FrontDeskWorkArea", fdwa);
////
////            layout.next(container);
//        } else if (userName.equalsIgnoreCase("ngo") && password.equalsIgnoreCase("ngo123")) {
//            NGOAdminWorkArea nwo = new NGOAdminWorkArea(container);
//            container.add("NGOWorkArea", nwo);
//
//            layout.next(container);
//        } else if (userName.equalsIgnoreCase("organbank") && password.equalsIgnoreCase("organ123")) {
//            OrganBankAdminWorkArea obwa = new OrganBankAdminWorkArea(container);
//            container.add("OrganBankWorkArea", obwa);
//
//            layout.next(container);
//        } else if (userName.equalsIgnoreCase("transport") && password.equalsIgnoreCase("transport123")) {
////            TransportWorkArea twa = new TransportWorkArea(container);
////            container.add("TransportWorkArea", twa);
////
////            layout.next(container);
//        } else if (userName.equalsIgnoreCase("government") && password.equalsIgnoreCase("govt123")) {
////            GovernmentWorkArea gwa = new GovernmentWorkArea(container);
////            container.add("GovernmentWorkArea", gwa);
////
////            layout.next(container);
//        }
//        else {
//            //loginPanel.setVisible(false);
//            JDialog showMessageDialog = new JDialog();
//            showMessageDialog.setAlwaysOnTop(true);
//            JOptionPane.showMessageDialog((this), "Invalid credentials");
//            return;
//
//        }

        loginJButton.setEnabled(false);
        loginJButton.setVisible(false);
        logoutJButton.setEnabled(true);
        logoutJButton.setVisible(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        userNameJTextField.setVisible(false);
        passwordField.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jSeparator1.setVisible(false);
        jSeparator3.setVisible(false);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed

        logoutJButton.setEnabled(false);
        userNameJTextField.setVisible(true);
        passwordField.setVisible(true);
        loginJButton.setEnabled(true);
        loginJButton.setVisible(true);
        logoutJButton.setVisible(false);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        jSeparator1.setVisible(true);
        jSeparator3.setVisible(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        
        
    
    }//GEN-LAST:event_logoutJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
