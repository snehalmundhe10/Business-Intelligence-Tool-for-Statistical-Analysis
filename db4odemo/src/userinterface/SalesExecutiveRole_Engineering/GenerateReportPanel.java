/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SalesExecutiveRole_Engineering;


import Business.EcoSystem;
import Business.Entities.SalesData;
import Business.WorkQueue.SalesWorkRequest;
import com.orsoncharts.plot.PiePlot3D;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author msneh
 */
public class GenerateReportPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SalesWorkRequest request;
    private int year;
    private double sales;
     private double profit;
     private double profitRatio;
     private double profitPerOrder;
     private double salesPerCust;
     private EcoSystem ecosystem;
     private SalesData  salesData;
     private int quantity;
     
    public GenerateReportPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        this.ecosystem=ecosystem;
       this.salesData=salesData; 
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        salesTextField = new javax.swing.JTextField();
        profitTextField = new javax.swing.JTextField();
        profitRatioTextField = new javax.swing.JTextField();
        profitPerOrderTextField = new javax.swing.JTextField();
        salesPerCustomerTextField = new javax.swing.JTextField();
        quantityTextField = new javax.swing.JTextField();
        saveSalesReportButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        createNewRecordBuuton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 204, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("Generate Sales  Report");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 255));
        jLabel2.setText("Sales:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 255));
        jLabel3.setText("Profit :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 255));
        jLabel4.setText("Profit Ratio :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 255));
        jLabel5.setText("Profit per Order :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 51, 255));
        jLabel6.setText("Sales per Customer :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 255));
        jLabel8.setText("Quantity:");

        salesTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        salesTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        profitTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        profitTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        profitRatioTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        profitRatioTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        profitPerOrderTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        profitPerOrderTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        salesPerCustomerTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        salesPerCustomerTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        quantityTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        quantityTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        saveSalesReportButton.setBackground(new java.awt.Color(153, 204, 255));
        saveSalesReportButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        saveSalesReportButton.setForeground(new java.awt.Color(102, 51, 255));
        saveSalesReportButton.setText("Save Sales Report");
        saveSalesReportButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        saveSalesReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSalesReportButtonActionPerformed(evt);
            }
        });

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

        createNewRecordBuuton.setBackground(new java.awt.Color(153, 204, 255));
        createNewRecordBuuton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        createNewRecordBuuton.setForeground(new java.awt.Color(102, 51, 255));
        createNewRecordBuuton.setText("Create New Record");
        createNewRecordBuuton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        createNewRecordBuuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewRecordBuutonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 51, 255));
        jLabel7.setText("Year:");

        yearTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        yearTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(saveSalesReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createNewRecordBuuton, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(profitRatioTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(profitPerOrderTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(salesPerCustomerTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(quantityTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(profitTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salesTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yearTextField, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(398, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(salesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(profitRatioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(profitPerOrderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salesPerCustomerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveSalesReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNewRecordBuuton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveSalesReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSalesReportButtonActionPerformed
       if(salesTextField.getText().isEmpty() || profitTextField.getText().isEmpty() || profitRatioTextField.getText().isEmpty() || profitPerOrderTextField.getText().isEmpty() || salesPerCustomerTextField.getText().isEmpty() || quantityTextField.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(null, "All the details are mandatory", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
       }  
       try{
           String salesData=yearTextField.getText();
           if(salesData.isEmpty()==false)
           {
               year=Integer.parseInt(salesData);
           }
       }
       catch(NumberFormatException num)
       {
           JOptionPane.showMessageDialog(null, "Sales Data should be in number format only");
            return;
       }
       try{
           String salesData=salesTextField.getText();
           if(salesData.isEmpty()==false)
           {
               sales=Double.parseDouble(salesData);
           }
       }
       catch(NumberFormatException num)
       {
           JOptionPane.showMessageDialog(null, "Sales Data should be in number format only");
            return;
       }
       
       try{
           String profitData=profitTextField.getText();
           if(profitData.isEmpty()==false)
           {
               profit=Double.parseDouble(profitData);
           }
       }
       catch(NumberFormatException num)
       {
           JOptionPane.showMessageDialog(null, "Profit should be in number format only");
            return;
       }
       try{
           String profitRatioData=profitRatioTextField.getText();
           if(profitRatioData.isEmpty()==false)
           {
               profitRatio=Double.parseDouble(profitRatioData);
           }
       }
       catch(NumberFormatException num)
       {
           JOptionPane.showMessageDialog(null, "Profit Ratio should be in number format only");
            return;
       }
       try{
           String profitPerOrderData=profitPerOrderTextField.getText();
           if(profitPerOrderData.isEmpty()==false)
           {
               profitPerOrder=Double.parseDouble(profitPerOrderData);
           }
       }
       catch(NumberFormatException num)
       {
           JOptionPane.showMessageDialog(null, "Profit per Order should be in number format only");
            return;
       }
       try{
           String salesPerCustData=salesPerCustomerTextField.getText();
           if(salesPerCustData.isEmpty()==false)
           {
               salesPerCust=Double.parseDouble(salesPerCustData);
           }
       }
       catch(NumberFormatException num)
       {
           JOptionPane.showMessageDialog(null, "Sales per customer should be in number format only");
            return;
       }
     
       try{
           String quantityData=quantityTextField.getText();
           if(quantityData.isEmpty()==false)
           {
                quantity = Integer.parseInt(quantityData); 
           }
       }
       catch(NumberFormatException num)
       {
           JOptionPane.showMessageDialog(null, "Quantity should be in number format only");
            return;
       }
         
    
       if(salesTextField.getText().length()!=0 && profitTextField.getText().length()!=0 && profitRatioTextField.getText().length()!=0 && profitPerOrderTextField.getText().length()!=0 && salesPerCustomerTextField.getText().length()!=0 && quantityTextField.getText().length()!=0)
       {
           JOptionPane.showMessageDialog(null, "Sales Report is Successfully Saved!");
       }  
       SalesData salesData=ecosystem.addSalesData();
       salesData.setYear(Integer.parseInt(yearTextField.getText()));
       salesData.setSales(Double.parseDouble(salesTextField.getText()));
       salesData.setProfit(Double.parseDouble(profitTextField.getText()));
       salesData.setProfitRatio(Double.parseDouble(profitRatioTextField.getText()));
       salesData.setProfitPerOrder(Double.parseDouble(profitPerOrderTextField.getText()));
       salesData.setSalesPerCust(Double.parseDouble(salesPerCustomerTextField.getText()));
       salesData.setQuantity(Integer.parseInt(quantityTextField.getText()));
       
    }//GEN-LAST:event_saveSalesReportButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void createNewRecordBuutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewRecordBuutonActionPerformed
        yearTextField.setText("");
        salesTextField.setText("");
       profitTextField.setText("");
       profitRatioTextField.setText("");
       profitPerOrderTextField.setText("");
       salesPerCustomerTextField.setText("");
        quantityTextField.setText("");
    }//GEN-LAST:event_createNewRecordBuutonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createNewRecordBuuton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField profitPerOrderTextField;
    private javax.swing.JTextField profitRatioTextField;
    private javax.swing.JTextField profitTextField;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JTextField salesPerCustomerTextField;
    private javax.swing.JTextField salesTextField;
    private javax.swing.JButton saveSalesReportButton;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
