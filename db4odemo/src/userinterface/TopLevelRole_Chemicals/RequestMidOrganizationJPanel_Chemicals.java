/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TopLevelRole_Chemicals;

import Business.Enterprise.Enterprise;
import Business.Organization.FinanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FinanceWorkRequest;
import Business.WorkQueue.SalesWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class RequestMidOrganizationJPanel_Chemicals extends javax.swing.JPanel {

    
     private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    
    public RequestMidOrganizationJPanel_Chemicals(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
       // valueLabel.setText(enterprise.getName());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fromTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        receipientTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        subjectTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        sendMessageButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        clearResultButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        jPanel1.setForeground(new java.awt.Color(102, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(153, 204, 255));
        requestTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(102, 51, 255));
        requestTestJButton.setText("Send");
        requestTestJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 611, 110, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("Message");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, -1));

        messageJTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        messageJTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        jPanel1.add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 160, -1));

        backJButton.setBackground(new java.awt.Color(153, 204, 255));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 51, 255));
        backJButton.setText("<< Previous Page");
        backJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 210, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 255));
        jLabel8.setText("Notify Through Mail");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 255));
        jLabel2.setText("Enter Your E-mai id:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        fromTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        fromTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        fromTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(fromTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 200, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 255));
        jLabel3.setText("Enter Username:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        usernameTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        usernameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        jPanel1.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 200, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 255));
        jLabel4.setText("Enter Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        passwordTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        passwordTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        jPanel1.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 200, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 255));
        jLabel5.setText("Enter Recipient:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        receipientTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        receipientTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        jPanel1.add(receipientTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 200, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 51, 255));
        jLabel6.setText("Write Subject:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        subjectTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        subjectTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        jPanel1.add(subjectTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 200, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 51, 255));
        jLabel7.setText("Write Message:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        messageTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        messageTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        jPanel1.add(messageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 200, -1));

        sendMessageButton.setBackground(new java.awt.Color(153, 204, 255));
        sendMessageButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        sendMessageButton.setForeground(new java.awt.Color(102, 51, 255));
        sendMessageButton.setText("Send ");
        sendMessageButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        sendMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sendMessageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 110, 40));

        clearButton.setBackground(new java.awt.Color(153, 204, 255));
        clearButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        clearButton.setForeground(new java.awt.Color(102, 51, 255));
        clearButton.setText("Clear");
        clearButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 205), 2, true));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel1.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 110, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 51, 255));
        jLabel9.setText("Notify through Dashboard");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, 30));

        clearResultButton.setBackground(new java.awt.Color(153, 204, 255));
        clearResultButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        clearResultButton.setForeground(new java.awt.Color(102, 51, 255));
        clearResultButton.setText("Clear");
        clearResultButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        clearResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearResultButtonActionPerformed(evt);
            }
        });
        jPanel1.add(clearResultButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 611, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String message = messageJTextField.getText();

        FinanceWorkRequest request = new FinanceWorkRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof FinanceOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
          if(messageJTextField.getText().length()!=0){
        JOptionPane.showMessageDialog(null, "Your message has been sent!");
        }
        else{
             JOptionPane.showMessageDialog(null, "Enter Message");
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkRequestAreaJPanel_Chemicals dwjp = (AdminWorkRequestAreaJPanel_Chemicals) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void fromTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromTextFieldActionPerformed

    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageButtonActionPerformed
        try{
            String host ="smtp.gmail.com" ;
            String user = usernameTextField.getText();
            String pass = passwordTextField.getText();
            String to = receipientTextField.getText();
            String from = fromTextField.getText();
            String subject = subjectTextField.getText();
            String messageText =messageTextField.getText();

            if (usernameTextField.getText().isEmpty() || passwordTextField.getText().isEmpty() || fromTextField.getText().isEmpty() || receipientTextField.getText().isEmpty()||subjectTextField.getText().isEmpty() || messageTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "All the details are mandatory", "Warning", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else{
                JOptionPane.showMessageDialog(null, "Your message has been sent!");
            }
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

            Transport transport=mailSession.getTransport("smtp");
            transport.connect(host, user, pass);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();

            System.out.println("message send successfully");

        }catch(Exception ex)
        {
            System.out.println(ex);
        }

    }//GEN-LAST:event_sendMessageButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        fromTextField.setText("");
        usernameTextField.setText("");
        passwordTextField.setText("");
        receipientTextField.setText("");
        subjectTextField.setText("");
        messageTextField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void clearResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearResultButtonActionPerformed
        messageJTextField.setText("");
    }//GEN-LAST:event_clearResultButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearResultButton;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField receipientTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JTextField subjectTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
