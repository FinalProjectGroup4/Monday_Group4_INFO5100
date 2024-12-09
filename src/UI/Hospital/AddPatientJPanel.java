/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Hospital;

import Model.EcoSystem;
import Model.storage.Patient;
import Model.storage.PatientDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author apple
 */
public class AddPatientJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    PatientDirectory patientDirectory;
    EcoSystem system;
    
    /**
     * Creates new form AddPatientJPanel
     */
    public AddPatientJPanel(JPanel userProcessContainer, PatientDirectory patientDirectory, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patientDirectory = patientDirectory;
        this.system = system;
    }

    public static boolean isValidEmailAddress(String emailAddress) {
        // a null string is invalid
        if (emailAddress == null) {
            return false;
        }

        // a string without a "@" is an invalid email address
        if (emailAddress.indexOf("@") < 0) {
            return false;
        }

        // a string without a "."  is an invalid email address
        if (emailAddress.indexOf(".") < 0) {
            return false;
        }
        return true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        genderText = new javax.swing.JTextField();
        birthdateText = new javax.swing.JTextField();
        phoneNumberText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        sicknessText = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jYearTextField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jDateTextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jMonthTextField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();

        submit.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name* :");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Gender* :");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Birthdate* :");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("AcceptedDate* :");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("PhoneNumber* :");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Address* :");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Sickness* :");

        nameText.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        genderText.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        birthdateText.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        birthdateText.setToolTipText("");

        phoneNumberText.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        addressText.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        sicknessText.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        backJButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jYearTextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jYearTextField.setText("YYYY");

        jLabel25.setText("/");

        jDateTextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jDateTextField.setText("DD");

        jLabel26.setText("/");

        jMonthTextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMonthTextField.setText("MM");

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Email* :");

        emailjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 150, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sicknessText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(birthdateText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(submit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 146, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addGap(0, 443, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel28, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addGap(33, 33, 33)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(genderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(birthdateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sicknessText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addComponent(submit)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 56, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(25, 25, 25)
                    .addComponent(jLabel2)
                    .addGap(35, 35, 35)
                    .addComponent(jLabel3)
                    .addGap(25, 25, 25)
                    .addComponent(jLabel4)
                    .addGap(30, 30, 30)
                    .addComponent(jLabel5)
                    .addGap(25, 25, 25)
                    .addComponent(jLabel6)
                    .addGap(25, 25, 25)
                    .addComponent(jLabel7)
                    .addGap(0, 152, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:

        if (nameText.getText().isEmpty() || genderText.getText().isEmpty() || birthdateText.getText().isEmpty() || jYearTextField.getText().isEmpty() || jMonthTextField.getText().isEmpty() || jDateTextField.getText().isEmpty() || phoneNumberText.getText().isEmpty() || addressText.getText().isEmpty() || sicknessText.getText().isEmpty() || emailjTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog((this), "Please enter all fields");
            return;
        }

        int mm = Integer.parseInt(jMonthTextField.getText());
        int dd = Integer.parseInt(jDateTextField.getText());
        int yyyy = Integer.parseInt(jYearTextField.getText());

        if (mm <= 0 || mm > 12) {
            JOptionPane.showMessageDialog((this), "Not a valid month.");
        } else if (dd <= 0 || dd > 31) {
            JOptionPane.showMessageDialog((this), "Not a valid date.");
        } else if (yyyy <= 2000 || yyyy >= 3000) {
            JOptionPane.showMessageDialog((this), "Not a valid year.");
        }
        else if(isValidEmailAddress(emailjTextField.getText()) == false){
            JOptionPane.showMessageDialog((this), "Not a valid email address.");
        }
        else{

            //PatientDirectory pd = new PatientDirectory();
            Patient patient = patientDirectory.addPatient();

            patient.setName(nameText.getText());
            patient.setGender(genderText.getText());
            patient.setBirthdate(birthdateText.getText());
            patient.setPhoneNumber(phoneNumberText.getText());
            patient.setAddress(addressText.getText());
            patient.setSickness(sicknessText.getText());
            patient.setEmail(emailjTextField.getText());
            patient.setAcceptedDate(mm+"/"+dd+"/"+yyyy);

            JOptionPane.showMessageDialog((this), "New Patient Added!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PatientServiceWorkAreaJPanel pswajp = (PatientServiceWorkAreaJPanel) component;
        pswajp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void emailjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailjTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressText;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField birthdateText;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JTextField genderText;
    private javax.swing.JTextField jDateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jMonthTextField;
    private javax.swing.JTextField jYearTextField;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JTextField sicknessText;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
