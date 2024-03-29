/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SalesExecutiveRole_Engineering;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author msneh
 */
public class ProductsPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
  
    private EcoSystem ecosystem;
    
    public ProductsPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        commercialVehiclesButton = new javax.swing.JButton();
        militaryVehiclesButton = new javax.swing.JButton();
        electricVehiclesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        rightPanelSales = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        jPanel1.setForeground(new java.awt.Color(102, 51, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("Products");

        commercialVehiclesButton.setBackground(new java.awt.Color(153, 204, 255));
        commercialVehiclesButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        commercialVehiclesButton.setForeground(new java.awt.Color(102, 51, 255));
        commercialVehiclesButton.setText("Commercial Vehicles");
        commercialVehiclesButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 205), 2, true));
        commercialVehiclesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commercialVehiclesButtonActionPerformed(evt);
            }
        });

        militaryVehiclesButton.setBackground(new java.awt.Color(153, 204, 255));
        militaryVehiclesButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        militaryVehiclesButton.setForeground(new java.awt.Color(102, 51, 255));
        militaryVehiclesButton.setText("Military Vehicles");
        militaryVehiclesButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        militaryVehiclesButton.setEnabled(false);
        militaryVehiclesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                militaryVehiclesButtonActionPerformed(evt);
            }
        });

        electricVehiclesButton.setBackground(new java.awt.Color(153, 204, 255));
        electricVehiclesButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        electricVehiclesButton.setForeground(new java.awt.Color(102, 51, 255));
        electricVehiclesButton.setText("Electric Vehicles");
        electricVehiclesButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        electricVehiclesButton.setEnabled(false);
        electricVehiclesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electricVehiclesButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 255));
        jLabel2.setText("TATA MOTORS");

        backButton.setBackground(new java.awt.Color(153, 204, 255));
        backButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        backButton.setForeground(new java.awt.Color(102, 51, 255));
        backButton.setText("<< Previous Page");
        backButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(electricVehiclesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commercialVehiclesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(militaryVehiclesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(commercialVehiclesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(militaryVehiclesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(electricVehiclesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        rightPanelSales.setBackground(new java.awt.Color(153, 204, 255));
        rightPanelSales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        rightPanelSales.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightPanelSales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void commercialVehiclesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commercialVehiclesButtonActionPerformed
      CommercialVehiclesPanel commVehicles = new CommercialVehiclesPanel(rightPanelSales, ecosystem);
        CardLayout cardLayout = (CardLayout)rightPanelSales.getLayout();
        rightPanelSales.add("commVehicles",commVehicles);
        cardLayout.next(rightPanelSales);
    }//GEN-LAST:event_commercialVehiclesButtonActionPerformed

    private void militaryVehiclesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_militaryVehiclesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_militaryVehiclesButtonActionPerformed

    private void electricVehiclesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electricVehiclesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_electricVehiclesButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton commercialVehiclesButton;
    private javax.swing.JButton electricVehiclesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton militaryVehiclesButton;
    private javax.swing.JPanel rightPanelSales;
    // End of variables declaration//GEN-END:variables
}
