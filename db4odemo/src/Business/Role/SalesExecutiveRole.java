/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.SalesExecutiveRole_Engineering.SalesExecutiveWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SalesExecutiveRole extends Role {
 //Role is a super class of the LabAssitantRole which has an abstract method
 //which is implemented here in its child class   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SalesExecutiveWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}
