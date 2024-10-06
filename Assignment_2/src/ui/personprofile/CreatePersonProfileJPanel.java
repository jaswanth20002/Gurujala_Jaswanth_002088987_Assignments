/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.personprofile;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.PersonDirectory;
import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author jaswa
 */
public class CreatePersonProfileJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    PersonDirectory personDirectory;
    /**
     * Creates new form CreatePersonProfileJPanel
     */
    public CreatePersonProfileJPanel(JPanel container,PersonDirectory directory) {
        
        initComponents();
        this.userProcessContainer = container; // Assign the userProcessContainer
        this.personDirectory = directory; //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wstreetaddresstxt = new javax.swing.JTextField();
        wunitnumbertxt = new javax.swing.JTextField();
        hcitylbl = new javax.swing.JLabel();
        ssnlbl = new javax.swing.JLabel();
        wphonenumbertxt = new javax.swing.JTextField();
        wcitylbl = new javax.swing.JLabel();
        hstatelbl = new javax.swing.JLabel();
        agelbl = new javax.swing.JLabel();
        hzipcodelbl = new javax.swing.JLabel();
        wcitytxt = new javax.swing.JTextField();
        createbtn = new javax.swing.JButton();
        ssntxt = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        wstatelbl = new javax.swing.JLabel();
        hphonenumberlbl = new javax.swing.JLabel();
        ssnage = new javax.swing.JTextField();
        hstreetaddresstxt = new javax.swing.JTextField();
        wstatetxt = new javax.swing.JTextField();
        hunitnumbertxt = new javax.swing.JTextField();
        hcitytxt = new javax.swing.JTextField();
        homeaddresslbl = new javax.swing.JLabel();
        wzipcodelbl = new javax.swing.JLabel();
        hstatetxt = new javax.swing.JTextField();
        hstreetaddresslbl = new javax.swing.JLabel();
        hzipcodetxt = new javax.swing.JTextField();
        wphonenumberlbl = new javax.swing.JLabel();
        hphonenumbertxt = new javax.swing.JTextField();
        workaddresslbl = new javax.swing.JLabel();
        firstnamelbl = new javax.swing.JLabel();
        wstreetaddresslbl = new javax.swing.JLabel();
        lastnamelbl = new javax.swing.JLabel();
        wunitnumberlbl = new javax.swing.JLabel();
        firstnametxt = new javax.swing.JTextField();
        lastnametxt = new javax.swing.JTextField();
        hunitnumberlbl = new javax.swing.JLabel();
        wzipcodetxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        hcitylbl.setText("City");

        ssnlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ssnlbl.setText("social security Number");

        wcitylbl.setText("City");

        hstatelbl.setText("State");

        agelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agelbl.setText("Age");

        hzipcodelbl.setText("Zip Code");

        createbtn.setText("create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        updatebtn.setText("update");

        wstatelbl.setText("State");

        hphonenumberlbl.setText("Phone Number");

        homeaddresslbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        homeaddresslbl.setText("Home Address ");

        wzipcodelbl.setText("Zip Code");

        hstreetaddresslbl.setText("Street Address");

        wphonenumberlbl.setText("Phone Number");

        workaddresslbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        workaddresslbl.setText("Work Address");

        firstnamelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstnamelbl.setText("first name");

        wstreetaddresslbl.setText("Street Address");

        lastnamelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastnamelbl.setText("last name");

        wunitnumberlbl.setText("Unit Number");

        hunitnumberlbl.setText("Unit Number");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Person Profile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createbtn)
                    .addComponent(updatebtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hunitnumberlbl)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ssnlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(firstnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeaddresslbl)
                    .addComponent(hstreetaddresslbl)
                    .addComponent(hcitylbl)
                    .addComponent(hzipcodelbl)
                    .addComponent(workaddresslbl)
                    .addComponent(wstreetaddresslbl)
                    .addComponent(wcitylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wzipcodelbl)
                    .addComponent(firstnametxt)
                    .addComponent(ssntxt)
                    .addComponent(hstreetaddresstxt)
                    .addComponent(hcitytxt)
                    .addComponent(hzipcodetxt)
                    .addComponent(wstreetaddresstxt)
                    .addComponent(wcitytxt)
                    .addComponent(wzipcodetxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wunitnumberlbl)
                                    .addComponent(hstatelbl)
                                    .addComponent(hphonenumberlbl)
                                    .addComponent(wstatelbl)
                                    .addComponent(wphonenumberlbl)))
                            .addComponent(agelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ssnage, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hunitnumbertxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hstatetxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hphonenumbertxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wunitnumbertxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wstatetxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wphonenumbertxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnamelbl)
                    .addComponent(lastnamelbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(firstnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssnlbl)
                    .addComponent(agelbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssnage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(homeaddresslbl)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hstreetaddresslbl)
                    .addComponent(hunitnumberlbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hstreetaddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hunitnumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hcitylbl)
                    .addComponent(hstatelbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hcitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hstatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hzipcodelbl)
                    .addComponent(hphonenumberlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hzipcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hphonenumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(workaddresslbl)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(wstreetaddresslbl)
                        .addGap(18, 18, 18)
                        .addComponent(wstreetaddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(wcitylbl))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wunitnumberlbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wunitnumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wstatelbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wcitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wstatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wzipcodelbl)
                    .addComponent(wphonenumberlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wphonenumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wzipcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(createbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updatebtn)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        // TODO add your handling code here:
        String firstName = firstnametxt.getText();
    String lastName = lastnametxt.getText();
    String ssn = ssntxt.getText();
    String age = ssnage.getText();
    String homeStreetAddress = hstreetaddresstxt.getText();
    String homeUnitNumber = hunitnumbertxt.getText();
    String homeCity = hcitytxt.getText();
    String homeState = hstatetxt.getText();
    String homeZipCode = hzipcodetxt.getText();
    String homePhoneNumber = hphonenumbertxt.getText();
    String workStreetAddress = wstreetaddresstxt.getText();
    String workUnitNumber = wunitnumbertxt.getText();
    String workCity = wcitytxt.getText();
    String workState = wstatetxt.getText();
    String workZipCode = wzipcodetxt.getText();
    String workPhoneNumber = wphonenumbertxt.getText();

    // Validate inputs
    if (firstName.isBlank() || lastName.isBlank() || ssn.isBlank() || age.isBlank() || 
        homeStreetAddress.isBlank() || homeCity.isBlank() || homeState.isBlank() || 
        homeZipCode.isBlank() || homePhoneNumber.isBlank() || 
        workStreetAddress.isBlank() || workCity.isBlank() || 
        workState.isBlank() || workZipCode.isBlank() || workPhoneNumber.isBlank()) {
        
        JOptionPane.showMessageDialog(this, "All fields are mandatory.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Create a new Person object
    Person newPerson = new Person();
    newPerson.setFirstName(firstName);
    newPerson.setLastName(lastName);
    newPerson.setSocialSecurityNumber(ssn);
    newPerson.setAge(age);
    newPerson.setHomeStreetAddress(homeStreetAddress);
    newPerson.setHomeUnitNumber(homeUnitNumber);
    newPerson.setHomeCity(homeCity);
    newPerson.setHomeState(homeState);
    newPerson.setHomeZipCode(homeZipCode);
    newPerson.setHomePhoneNumber(homePhoneNumber);
    newPerson.setWorkStreetAddress(workStreetAddress);
    newPerson.setWorkUnitNumber(workUnitNumber);
    newPerson.setWorkCity(workCity);
    newPerson.setWorkState(workState);
    newPerson.setWorkZipCode(workZipCode);
    newPerson.setWorkPhoneNumber(workPhoneNumber);

    // Add the new person to the directory
    personDirectory.addPerson(newPerson);

    // Show success message
    JOptionPane.showMessageDialog(this, "Person profile successfully created.", "Information", JOptionPane.INFORMATION_MESSAGE);
    
    // Clear the input fields
    firstnametxt.setText("");
    lastnametxt.setText("");
    ssntxt.setText("");
    ssnage.setText("");
    hstreetaddresstxt.setText("");
    hunitnumbertxt.setText("");
    hcitytxt.setText("");
    hstatetxt.setText("");
    hzipcodetxt.setText("");
    hphonenumbertxt.setText("");
    wstreetaddresstxt.setText("");
    wunitnumbertxt.setText("");
    wcitytxt.setText("");
    wstatetxt.setText("");
    wzipcodetxt.setText("");
    wphonenumbertxt.setText("");
    
    this.revalidate();
    this.repaint();
        
    }//GEN-LAST:event_createbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agelbl;
    private javax.swing.JButton createbtn;
    private javax.swing.JLabel firstnamelbl;
    private javax.swing.JTextField firstnametxt;
    private javax.swing.JLabel hcitylbl;
    private javax.swing.JTextField hcitytxt;
    private javax.swing.JLabel homeaddresslbl;
    private javax.swing.JLabel hphonenumberlbl;
    private javax.swing.JTextField hphonenumbertxt;
    private javax.swing.JLabel hstatelbl;
    private javax.swing.JTextField hstatetxt;
    private javax.swing.JLabel hstreetaddresslbl;
    private javax.swing.JTextField hstreetaddresstxt;
    private javax.swing.JLabel hunitnumberlbl;
    private javax.swing.JTextField hunitnumbertxt;
    private javax.swing.JLabel hzipcodelbl;
    private javax.swing.JTextField hzipcodetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastnamelbl;
    private javax.swing.JTextField lastnametxt;
    private javax.swing.JTextField ssnage;
    private javax.swing.JLabel ssnlbl;
    private javax.swing.JTextField ssntxt;
    private javax.swing.JButton updatebtn;
    private javax.swing.JLabel wcitylbl;
    private javax.swing.JTextField wcitytxt;
    private javax.swing.JLabel workaddresslbl;
    private javax.swing.JLabel wphonenumberlbl;
    private javax.swing.JTextField wphonenumbertxt;
    private javax.swing.JLabel wstatelbl;
    private javax.swing.JTextField wstatetxt;
    private javax.swing.JLabel wstreetaddresslbl;
    private javax.swing.JTextField wstreetaddresstxt;
    private javax.swing.JLabel wunitnumberlbl;
    private javax.swing.JTextField wunitnumbertxt;
    private javax.swing.JLabel wzipcodelbl;
    private javax.swing.JTextField wzipcodetxt;
    // End of variables declaration//GEN-END:variables
}
