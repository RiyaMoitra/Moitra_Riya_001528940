/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.CarFleet;
import Business.Car;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author riyamoitra
 */


public class LeftJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LeftJPanel
     */
    private CarFleet carFleet;
    private JPanel userProcessContainer;

    LeftJPanel(JPanel userProcessContainer, CarFleet carFleet) {
         initComponents();
         this.userProcessContainer= userProcessContainer;
         this.carFleet= carFleet;
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        cbMinSeat = new javax.swing.JCheckBox();
        cbMaxSeat = new javax.swing.JCheckBox();
        cbBoth = new javax.swing.JCheckBox();
        txtMaxNumberOfSeats = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMinNumberOfSeats = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        cbMinSeat.setText("Enter Min Seats");
        cbMinSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMinSeatActionPerformed(evt);
            }
        });

        cbMaxSeat.setText("Enter Max.Seats ");
        cbMaxSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaxSeatActionPerformed(evt);
            }
        });

        cbBoth.setText("Enter BOTH");
        cbBoth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBothActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Min/Max Seats");

        jLabel2.setText("Min Seats");

        jLabel3.setText("Max Seats");

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMinNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnSearch)
                                        .addComponent(txtMaxNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnBack))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaxNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbMinSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMinSeatActionPerformed
        
        
    }//GEN-LAST:event_cbMinSeatActionPerformed

    private void cbMaxSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaxSeatActionPerformed
       
    }//GEN-LAST:event_cbMaxSeatActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        int min = Integer.parseInt(txtMaxNumberOfSeats.getText());
        int max = Integer.parseInt(txtMaxNumberOfSeats.getText());
        
        if (min<=0  || min>10){
            JOptionPane.showMessageDialog(null, "Min seats cannot be zero or less or more than 10", "Warning",JOptionPane.WARNING_MESSAGE );
        }
        
        if (max<2){
            JOptionPane.showMessageDialog(null, "Max seats cannot be less that 2", "Warning",JOptionPane.WARNING_MESSAGE );
        }
        
        
        CarJPanel panel = new CarJPanel(userProcessContainer , this.searchSeat(min, max));
        userProcessContainer.add("CarJPanel", panel);
        CardLayout layout =(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
           
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbBothActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBothActionPerformed
        
        
    }//GEN-LAST:event_cbBothActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbBoth;
    private javax.swing.JCheckBox cbMaxSeat;
    private javax.swing.JCheckBox cbMinSeat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMaxNumberOfSeats;
    private javax.swing.JTextField txtMinNumberOfSeats;
    // End of variables declaration//GEN-END:variables

    private ArrayList searchSeat(int min , int max) {
        
       ArrayList cf= new ArrayList <Car>();
        for(Car car : carFleet.getCarFleet())
        {
            int n =car.getMin_seats();
            int m =car.getMax_seats();
            
            if(car.isAvailable()==true && n>=min && m<=max ){
                cf.add(car);
            }
        }
        
        return cf;
    }
}

