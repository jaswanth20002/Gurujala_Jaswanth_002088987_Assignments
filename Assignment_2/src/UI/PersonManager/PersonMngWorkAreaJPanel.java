/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PersonManager;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.PersonProfileDirectory;

/**
 *
 * @author jaswa
 */
public class PersonMngWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    PersonProfileDirectory persondirectory;
    
    /**
     * Creates new form PersonMngWorkAreaJPanel
     */
    public PersonMngWorkAreaJPanel(JPanel container, PersonProfileDirectory directory) {
        initComponents();
        
       userProcessContainer = container;
       persondirectory = directory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ltlPersontitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnList = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 230, 250));

        ltlPersontitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        ltlPersontitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ltlPersontitle.setText("Manage Person Directory");

        btnAdd.setBackground(new java.awt.Color(200, 230, 250));
        btnAdd.setText("Add Person");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnList.setBackground(new java.awt.Color(200, 230, 250));
        btnList.setText("List Person");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ltlPersontitle, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnList});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(ltlPersontitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
         CreatePersonJPanel panel  = new CreatePersonJPanel(userProcessContainer, persondirectory);
        userProcessContainer.add("CreatePersonJPanel",panel);
        
        CardLayout layout  = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        ListPersonJPanel panel  = new ListPersonJPanel(userProcessContainer, persondirectory);
        userProcessContainer.add("ListPersonJPanel",panel);
        
        CardLayout layout  = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnList;
    private javax.swing.JLabel ltlPersontitle;
    // End of variables declaration//GEN-END:variables
}
