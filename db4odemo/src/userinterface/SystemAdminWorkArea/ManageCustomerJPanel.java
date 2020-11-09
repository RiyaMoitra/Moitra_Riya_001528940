/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riyamoitra
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJPanel
     */
    
     public CustomerDirectory customerDirectory;
    public JPanel container;
    public EcoSystem business;
    

    ManageCustomerJPanel(JPanel userProcessContainer, EcoSystem business, CustomerDirectory customerDirectory) {

         initComponents();
        this.customerDirectory = customerDirectory;
        this.container = userProcessContainer;
        this.business = business;
        populateTable();

    }
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) customerJTable.getModel();

        model.setRowCount(0);
        for (UserAccount ua : business.getUserAccountDirectory().getUserAccountList()) {
            for (Customer customer : customerDirectory.getCustomerDirectory()) {
                if (customer.getCustomerId().equalsIgnoreCase(ua.getEmployee().getName())) {
                    Object[] row = new Object[5];
                    row[0] = customer.getCustomerId();
                    row[1] = customer.getName();
                    row[2] = customer.getPhoneNo();
                    row[3] = customer.getAddress();
                    row[4] = ua.getUsername();
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

        backBtn = new javax.swing.JButton();
        Customer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerJTable = new javax.swing.JTable();
        addCustomerBtn = new javax.swing.JButton();
        viewCustomerbtn = new javax.swing.JButton();
        deleteCustomerbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        Customer.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Customer.setText("Customers");

        customerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer Id", "Name", "Contact No", "Address", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerJTable);

        addCustomerBtn.setText("Add Customer");
        addCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerBtnActionPerformed(evt);
            }
        });

        viewCustomerbtn.setText("View Customer");
        viewCustomerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerbtnActionPerformed(evt);
            }
        });

        deleteCustomerbtn.setText("Delete Customer");
        deleteCustomerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerbtnActionPerformed(evt);
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
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Customer))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addCustomerBtn)
                .addGap(18, 18, 18)
                .addComponent(viewCustomerbtn)
                .addGap(18, 18, 18)
                .addComponent(deleteCustomerbtn)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Customer)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteCustomerbtn)
                    .addComponent(viewCustomerbtn)
                    .addComponent(addCustomerBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        CreateCustomerJPanel createCustomerJPanel = new CreateCustomerJPanel(container, business, customerDirectory);
        container.add(createCustomerJPanel);
        layout.next(container);
    }//GEN-LAST:event_addCustomerBtnActionPerformed

    private void viewCustomerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = customerJTable.getSelectedRow();
        int count = customerJTable.getSelectedRowCount();
        if(count == 1){
            if (selectedRow >= 0) {
                CardLayout layout = (CardLayout) container.getLayout();
                Customer customer = customerDirectory.getCustomerId(selectedRow);
                ViewCustomersJPanel viewCustomersJPanel = new ViewCustomersJPanel(container, customer, customerDirectory);
                container.add(viewCustomersJPanel);
                layout.next(container);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_viewCustomerbtnActionPerformed

    private void deleteCustomerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerbtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = customerJTable.getSelectedRow();
        int count = customerJTable.getSelectedRowCount();
        if(count == 1){
            if (selectedRow >= 0) {
                int selectionButton = JOptionPane.YES_NO_OPTION;
                int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
                if (selectionResult == JOptionPane.YES_OPTION) {
                    customerDirectory.deleteCustomer(selectedRow,business);
                    populateTable();
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteCustomerbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Customer;
    private javax.swing.JButton addCustomerBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable customerJTable;
    private javax.swing.JButton deleteCustomerbtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewCustomerbtn;
    // End of variables declaration//GEN-END:variables
}