/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem business;
    private DeliveryManDirectory deliveryManDirectory;
    private OrderDirectory orderDirectory;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
   

    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, DeliveryManDirectory deliveryManDirectory, OrderDirectory orderDirectory) {
        
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.deliveryManDirectory = deliveryManDirectory;
        this.orderDirectory = orderDirectory;
        
         populateTable();
    }

    
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for(Order order: business.getOrderDirectory().getOrderDirectory()){
            if(order.getDeliveryMan() != null){
                if(order.getDeliveryMan().getDeliveryId().equalsIgnoreCase(userAccount.getEmployee().getName())){
                Object[] row = new Object[7];
                    row[0] = order.getMessage();
                    row[1] = order.getSender();
                    row[2] = order.getReceiver();
                    row[3] = order.getStatus();
                    row[4] = order.getOrderId();
                    row[5] = order.getCustomer().getAddress();
                    row[6] = order.getRestaurant().getAddress();
                    model.addRow(row);
            }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        processJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Order ID", "Customer Address", "Restaurant Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 58, 630, 96));

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        jLabel2.setText("Confirm Result:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 110, -1));

        processJButton1.setText("Confirm");
        processJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButton1ActionPerformed(evt);
            }
        });
        add(processJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a row!");
            return;
        }
        
        String selectedOrderId = (String) workRequestJTable.getValueAt(selectedRow, 4);
        Order order = business.getOrderDirectory().getOrderByOrderId(selectedOrderId);
     
        order.setStatus("Out For Delivery");
        JOptionPane.showMessageDialog(null, "Order updated!");
        populateTable();
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a row!");
            return;
        }
        
        String selectedOrderId = (String) workRequestJTable.getValueAt(selectedRow, 4);
        Order order = business.getOrderDirectory().getOrderByOrderId(selectedOrderId);
     
        order.setStatus("Out For Delivery");
        JOptionPane.showMessageDialog(null, "Order updated!");
        populateTable();

        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButton1ActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a row!");
            return;
        }

        String selectedOrderId = (String) workRequestJTable.getValueAt(selectedRow, 4);
        Order order = business.getOrderDirectory().getOrderByOrderId(selectedOrderId);

        if(order.getStatus().trim().equalsIgnoreCase("Out For Delivery")){
            order.setResult(resultJTextField.getText());
            order.setStatus("Completed");
            resultJTextField.setText("");
            JOptionPane.showMessageDialog(null, "Order updated!");
            populateTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Confirm order pick up before confirming delivery!");
        }
        //        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, order);
        //        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        //        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton processJButton1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
