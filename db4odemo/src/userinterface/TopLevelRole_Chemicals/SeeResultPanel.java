/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TopLevelRole_Chemicals;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author msneh
 */
public class SeeResultPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem; 
    public SeeResultPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
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
        seeChemicalReportButton = new javax.swing.JButton();
        fertilizersReportButton = new javax.swing.JButton();
        biofuelsFinanceReport = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        seeChemicalReportButton.setBackground(new java.awt.Color(153, 204, 255));
        seeChemicalReportButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        seeChemicalReportButton.setForeground(new java.awt.Color(102, 51, 255));
        seeChemicalReportButton.setText("Finance Report Chemical");
        seeChemicalReportButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        seeChemicalReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeChemicalReportButtonActionPerformed(evt);
            }
        });

        fertilizersReportButton.setBackground(new java.awt.Color(153, 204, 255));
        fertilizersReportButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        fertilizersReportButton.setForeground(new java.awt.Color(102, 51, 255));
        fertilizersReportButton.setText("Finance Report of  Fertilizers");
        fertilizersReportButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        fertilizersReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fertilizersReportButtonActionPerformed(evt);
            }
        });

        biofuelsFinanceReport.setBackground(new java.awt.Color(153, 204, 255));
        biofuelsFinanceReport.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        biofuelsFinanceReport.setForeground(new java.awt.Color(102, 51, 255));
        biofuelsFinanceReport.setText("Finance Report of Biofuels");
        biofuelsFinanceReport.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        biofuelsFinanceReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biofuelsFinanceReportActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 51, 255));
        jButton4.setText("Compare Reports");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(seeChemicalReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fertilizersReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(biofuelsFinanceReport, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fertilizersReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seeChemicalReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biofuelsFinanceReport, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSplitPane1.setTopComponent(jPanel1);

        bottomPanel.setBackground(new java.awt.Color(153, 204, 255));
        bottomPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        bottomPanel.setForeground(new java.awt.Color(102, 51, 255));
        bottomPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(bottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void seeChemicalReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeChemicalReportButtonActionPerformed
         ResultChemicalsPanel resultChemPanel=new ResultChemicalsPanel(bottomPanel, ecosystem);
        bottomPanel.add("resultChemPanel",resultChemPanel);
        CardLayout layout=(CardLayout)bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_seeChemicalReportButtonActionPerformed

    private void biofuelsFinanceReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biofuelsFinanceReportActionPerformed
        BiofuelsFinanceReport resultBioPanel=new BiofuelsFinanceReport(bottomPanel, ecosystem);
        bottomPanel.add("resultBioPanel",resultBioPanel);
        CardLayout layout=(CardLayout)bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_biofuelsFinanceReportActionPerformed

    private void fertilizersReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fertilizersReportButtonActionPerformed
      FertilizersFinanceReport resultFertiPanel=new FertilizersFinanceReport(bottomPanel, ecosystem);
        bottomPanel.add("resultFertiPanel",resultFertiPanel);
        CardLayout layout=(CardLayout)bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_fertilizersReportButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         ComparePanel comparePanel=new ComparePanel(bottomPanel, ecosystem);
        bottomPanel.add("comparePanel",comparePanel);
        CardLayout layout=(CardLayout)bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton biofuelsFinanceReport;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton fertilizersReportButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton seeChemicalReportButton;
    // End of variables declaration//GEN-END:variables
}
