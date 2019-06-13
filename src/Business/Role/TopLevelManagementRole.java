/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.TopLevelOrganization;
import Business.Organization.Organization;
import Business.Organization.TopLevelOrganization_Chemicals;
import Business.UserAccount.UserAccount;
import userinterface.TopLevelRole_Engineering.AdminWorkRequestAreaJPanel;
import javax.swing.JPanel;
import userinterface.TopLevelRole_Chemicals.AdminWorkRequestAreaJPanel_Chemicals;

/**
 *
 * @author raunak
 */
public class TopLevelManagementRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AdminWorkRequestAreaJPanel(userProcessContainer, account, (TopLevelOrganization)organization, enterprise);
    }
    
    
}
