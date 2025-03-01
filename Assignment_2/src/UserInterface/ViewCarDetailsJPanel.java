/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Car;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author riyamoitra
 */
public class ViewCarDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCarDetailsJPanel
     */
    private JPanel userProcessContainer;
    private Car car;
    public ViewCarDetailsJPanel(JPanel userProcessContainer, Car car) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.car = car ;
        populateCarDetails();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
        txtBrandName.setEnabled(false);
        txtAvailibility.setEnabled(false);
        txtMCExpiryDate.setEnabled(false);
        txtModelNumber.setEnabled(false);
        txtNumberOfSeats.setEnabled(false);
        txtSerialNumber.setEnabled(false);
        txtYearOfManufacture.setEnabled(false);
        txtCity.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        txtAvailibility = new javax.swing.JTextField();
        txtMCExpiryDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBrandName = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        txtYearOfManufacture = new javax.swing.JTextField();
        txtNumberOfSeats = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        cbYes = new javax.swing.JCheckBox();
        cbNo = new javax.swing.JCheckBox();
        cbYesMC = new javax.swing.JCheckBox();
        cbNoMC = new javax.swing.JCheckBox();

        jRadioButton1.setText("jRadioButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Availibility");

        jLabel2.setText("                                           View Car Details");
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel3.setText("Serial Number");

        jLabel4.setText("Brand Name ");

        jLabel5.setText("Model Number");

        jLabel6.setText("Year of Manufacturing");

        jLabel7.setText("Maintenance certificate Expired");

        jLabel8.setText("Number of Seats");

        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });

        txtNumberOfSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberOfSeatsActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("<  Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel9.setText("City");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        cbYes.setText("YES");
        cbYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYesActionPerformed(evt);
            }
        });

        cbNo.setText("NO");
        cbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNoActionPerformed(evt);
            }
        });

        cbYesMC.setText("YES");
        cbYesMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYesMCActionPerformed(evt);
            }
        });

        cbNoMC.setText("NO");
        cbNoMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNoMCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addGap(414, 414, 414))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbYes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbNo))
                                    .addComponent(txtYearOfManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbYesMC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbNoMC)))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbYes)
                    .addComponent(cbNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYearOfManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbYesMC))
                    .addComponent(cbNoMC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void txtNumberOfSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberOfSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberOfSeatsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        txtBrandName.setEnabled(true);
        txtAvailibility.setEnabled(true);
        txtMCExpiryDate.setEnabled(true);
        txtModelNumber.setEnabled(true);
        txtNumberOfSeats.setEnabled(true);
        txtSerialNumber.setEnabled(false);
        txtYearOfManufacture.setEnabled(false);
        txtCity.setEnabled(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false); 
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String brandName = txtBrandName.getText();
       // boolean availibility = Boolean.parseBoolean(txtAvailibility.getText());
        
        //boolean mCExpiryDate =Boolean.parseBoolean(txtMCExpiryDate.getText());
       
        String modelNumber = txtModelNumber.getText();
        int numberOfSeats = Integer.parseInt(txtNumberOfSeats.getText());
        int serialNumber = Integer.parseInt( txtSerialNumber.getText());
        String yearOfManufacturing = txtYearOfManufacture.getText();
        
        String city = txtCity.getText();
        
        if (brandName.isEmpty() || modelNumber.isEmpty() ||
               numberOfSeats <0 || yearOfManufacturing.isEmpty() || city.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Fields Cannot be empty", "Warning",JOptionPane.WARNING_MESSAGE );
        } 
               else {
            car.setBrandName(brandName);
            car.setModelNumber(modelNumber);
            car.setMax_seats(numberOfSeats);
            
            car.setYearOfManufacturing(yearOfManufacturing);
            //car.setAvailable(availibility);
            //car.setMaintenenceCerticateExpiry(mCExpiryDate);
            
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);

            JOptionPane.showMessageDialog(null, "Account Updated Successfully"); 
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void cbYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYesActionPerformed
        // TODO add your handling code here:
        car.setAvailable(true);
        
    }//GEN-LAST:event_cbYesActionPerformed

    private void cbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNoActionPerformed
        // TODO add your handling code here:
        
        car.setAvailable(false);
    }//GEN-LAST:event_cbNoActionPerformed

    private void cbYesMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYesMCActionPerformed
        // TODO add your handling code here:
        
        car.setMaintenenceCerticateExpiry(true);
    }//GEN-LAST:event_cbYesMCActionPerformed

    private void cbNoMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNoMCActionPerformed
        // TODO add your handling code here:
        car.setMaintenenceCerticateExpiry(false);
        
    }//GEN-LAST:event_cbNoMCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbNo;
    private javax.swing.JCheckBox cbNoMC;
    private javax.swing.JCheckBox cbYes;
    private javax.swing.JCheckBox cbYesMC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField txtAvailibility;
    private javax.swing.JTextField txtBrandName;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMCExpiryDate;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtNumberOfSeats;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtYearOfManufacture;
    // End of variables declaration//GEN-END:variables

    private void populateCarDetails() {

        txtModelNumber.setText(car.getModelNumber());
        txtBrandName.setText(car.getBrandName());
        txtYearOfManufacture.setText(car.getYearOfManufacturing());
        txtCity.setText(car.getCity());
        txtAvailibility.setText(Boolean.toString(car.isAvailable()));
        txtMCExpiryDate.setText(Boolean.toString(car.isMaintenenceCerticateExpiry()));
        txtNumberOfSeats.setText(Integer.toString(car.getMax_seats()));
        txtSerialNumber.setText(Integer.toString(car.getSerialNumber()));
      
    }
}
