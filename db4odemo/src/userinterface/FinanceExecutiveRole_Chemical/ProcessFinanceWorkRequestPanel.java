/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FinanceExecutiveRole_Chemical;

import Business.EcoSystem;
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

/**
 *
 * @author msneh
 */
public class ProcessFinanceWorkRequestPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    //private EcoSystem ecosystem;
    FinanceWorkRequest request;
    public ProcessFinanceWorkRequestPanel(JPanel userProcessContainer,FinanceWorkRequest request) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        //this.ecosystem=ecosystem;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fromTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        receipientTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        subjectTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        messageTextField = new javax.swing.JTextField();
        sendMessageButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        clearResultButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        setForeground(new java.awt.Color(102, 51, 255));

        backJButton.setBackground(new java.awt.Color(153, 204, 255));
        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 51, 255));
        backJButton.setText("<<Previous Page");
        backJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("Result");

        resultJTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        resultJTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        submitJButton.setBackground(new java.awt.Color(153, 204, 255));
        submitJButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(102, 51, 255));
        submitJButton.setText("Submit Result");
        submitJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 51, 255));
        jLabel4.setText("Notify Through Mail");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 51, 255));
        jLabel7.setText("Enter your email-id:");

        fromTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        fromTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        fromTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 255));
        jLabel5.setText("Enter Username:");

        usernameTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        usernameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 51, 255));
        jLabel6.setText("Enter Password:");

        passwordTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        passwordTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 255));
        jLabel8.setText("Enter Recipient:");

        receipientTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        receipientTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 51, 255));
        jLabel9.setText("Write Subject:");

        subjectTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        subjectTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 255));
        jLabel2.setText("Write Message:");

        messageTextField.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        messageTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));

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

        clearButton.setBackground(new java.awt.Color(153, 204, 255));
        clearButton.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        clearButton.setForeground(new java.awt.Color(102, 51, 255));
        clearButton.setText("Clear");
        clearButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 51, 255), 2, true));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 255));
        jLabel3.setText("Notify through Dashboard");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel2))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(receipientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clearResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(337, 337, 337)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sendMessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(526, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(receipientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(subjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendMessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

//        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        SalesExecutiveWorkAreaJPanel dwjp = (SalesExecutiveWorkAreaJPanel) component;
//        dwjp.populateTable();
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
        
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FinanceExecutiveWorkAreaJPanel dwjp = (FinanceExecutiveWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        request.setResult(resultJTextField.getText());
        request.setStatus("Completed");
        if(resultJTextField.getText().length()==0)
         JOptionPane.showMessageDialog(null, "Enter Status!");
    }//GEN-LAST:event_submitJButtonActionPerformed

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
        JOptionPane.showMessageDialog(null, "Your message has been sent!");
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
        resultJTextField.setText("");
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
    private javax.swing.JTextField messageTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField receipientTextField;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JTextField subjectTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}