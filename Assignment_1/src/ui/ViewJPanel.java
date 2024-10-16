/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.Product;

/**
 *
 * @author jaswa
 */
public class ViewJPanel extends javax.swing.JPanel {
    Product product;
    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(Product p) {
        initComponents();
        product=p;
        
        displayProduct();
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
        txtaddressline1 = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtaddressline2 = new javax.swing.JTextField();
        txtnationality = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtstate = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtcountry = new javax.swing.JTextField();
        txtzipcode = new javax.swing.JTextField();
        txtqualification = new javax.swing.JTextField();
        txttelephonenumber = new javax.swing.JTextField();
        txtcurrentjobprofile = new javax.swing.JTextField();
        txtfaxnumber = new javax.swing.JTextField();
        txtdrivinglicensenumber = new javax.swing.JTextField();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtdrivinglicensestate = new javax.swing.JTextField();
        txtssn = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        lblnationality = new javax.swing.JLabel();
        lblqualification = new javax.swing.JLabel();
        lblcurrentjobprofile = new javax.swing.JLabel();
        lbldrivinglicensenumber = new javax.swing.JLabel();
        lblfirstname = new javax.swing.JLabel();
        lbllastname = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblphone = new javax.swing.JLabel();
        lbldrivinglicensestate = new javax.swing.JLabel();
        lblssn = new javax.swing.JLabel();
        lbladdressline1 = new javax.swing.JLabel();
        lbladdressline2 = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        lblstate = new javax.swing.JLabel();
        lblcountry = new javax.swing.JLabel();
        lblzipcode = new javax.swing.JLabel();
        lbltelephonenumber = new javax.swing.JLabel();
        lblfaxnumber = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Profile");

        lblnationality.setText("Nationality");

        lblqualification.setText("Qualification");

        lblcurrentjobprofile.setText("Current Job Profile");

        lbldrivinglicensenumber.setText("Driving License Number");

        lblfirstname.setText("First Name");

        lbllastname.setText("Last Name");

        lblgender.setText("Gender");

        lblage.setText("Age");

        lblemail.setText("Email");

        lblphone.setText("Phone");

        lbldrivinglicensestate.setText("Driving License State");

        lblssn.setText("Social Security Number");

        lbladdressline1.setText("Address Line 1 ");

        lbladdressline2.setText("Address Line 2");

        lblcity.setText("City");

        lblstate.setText("State");

        lblcountry.setText("Country");

        lblzipcode.setText("Zip Code");

        lbltelephonenumber.setText("Telephone Number");

        lblfaxnumber.setText("Fax Number");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("View Profile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnationality)
                    .addComponent(lbldrivinglicensenumber)
                    .addComponent(lblcurrentjobprofile)
                    .addComponent(lblqualification)
                    .addComponent(lblphone)
                    .addComponent(lblemail)
                    .addComponent(lblage)
                    .addComponent(lblgender)
                    .addComponent(lbllastname, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfirstname))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcurrentjobprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltelephonenumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txttelephonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtdrivinglicensenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblfaxnumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfaxnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtqualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblzipcode)
                                            .addComponent(lblcity)
                                            .addComponent(lbladdressline1)
                                            .addComponent(lbladdressline2)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblcountry))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblstate)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtstate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtcountry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addContainerGap())
                                        .addComponent(txtzipcode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtaddressline1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtaddressline2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblssn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                        .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbldrivinglicensestate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtdrivinglicensestate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtaddressline1, txtaddressline2, txtage, txtcity, txtcountry, txtcurrentjobprofile, txtdrivinglicensenumber, txtdrivinglicensestate, txtemail, txtfaxnumber, txtfirstname, txtgender, txtlastname, txtnationality, txtphone, txtqualification, txtssn, txtstate, txttelephonenumber, txtzipcode});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfirstname)
                    .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldrivinglicensestate)
                    .addComponent(txtdrivinglicensestate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbllastname, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtlastname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblgender, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbladdressline1)
                                .addComponent(txtaddressline1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbladdressline2)
                            .addComponent(txtaddressline2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblage, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnationality, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtnationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblcity)
                                .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblemail)
                                    .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblstate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblphone)
                                    .addComponent(txtcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcountry))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtqualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblzipcode)))
                            .addComponent(lblqualification))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblcurrentjobprofile)
                                    .addComponent(txtcurrentjobprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttelephonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbltelephonenumber)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbldrivinglicensenumber)
                            .addComponent(txtdrivinglicensenumber)
                            .addComponent(txtfaxnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblfaxnumber)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblssn)
                        .addComponent(txtssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(191, 191, 191))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtaddressline1, txtaddressline2, txtage, txtcity, txtcountry, txtcurrentjobprofile, txtdrivinglicensenumber, txtdrivinglicensestate, txtemail, txtfaxnumber, txtfirstname, txtgender, txtlastname, txtnationality, txtphone, txtqualification, txtssn, txtstate, txttelephonenumber, txtzipcode});

    }// </editor-fold>//GEN-END:initComponents

    private void displayProduct(){
        txtfirstname.setText(product.getFirstname());
        txtlastname.setText(product.getLastname());
        txtgender.setText(product.getGender());
        txtage.setText(product.getAge());
        txtnationality.setText(product.getNationality());
        txtemail.setText(product.getEmail());
        txtphone.setText(product.getPhone());
        txtqualification.setText(product.getQualification());
        txtcurrentjobprofile.setText(product.getCurrentjobprofile());
        txtdrivinglicensenumber.setText(product.getDrivinglicensenumber());
        txtdrivinglicensestate.setText(product.getDrivinglicensestate());
        txtssn.setText(product.getSocialsecuritynumber());
        txtaddressline1.setText(product.getAddressline1());
        txtaddressline2.setText(product.getAddressline2());
        txtcity.setText(product.getCity());
        txtstate.setText(product.getState());
        txtcountry.setText(product.getCountry());
        txtzipcode.setText(product.getZipcode());
        txttelephonenumber.setText(product.getTelephonenumber());
        txtfaxnumber.setText(product.getFaxnumber());
            
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel lbladdressline1;
    private javax.swing.JLabel lbladdressline2;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcountry;
    private javax.swing.JLabel lblcurrentjobprofile;
    private javax.swing.JLabel lbldrivinglicensenumber;
    private javax.swing.JLabel lbldrivinglicensestate;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfaxnumber;
    private javax.swing.JLabel lblfirstname;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lbllastname;
    private javax.swing.JLabel lblnationality;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblqualification;
    private javax.swing.JLabel lblssn;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lbltelephonenumber;
    private javax.swing.JLabel lblzipcode;
    private javax.swing.JTextField txtaddressline1;
    private javax.swing.JTextField txtaddressline2;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcountry;
    private javax.swing.JTextField txtcurrentjobprofile;
    private javax.swing.JTextField txtdrivinglicensenumber;
    private javax.swing.JTextField txtdrivinglicensestate;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfaxnumber;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtnationality;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtqualification;
    private javax.swing.JTextField txtssn;
    private javax.swing.JTextField txtstate;
    private javax.swing.JTextField txttelephonenumber;
    private javax.swing.JTextField txtzipcode;
    // End of variables declaration//GEN-END:variables
}
