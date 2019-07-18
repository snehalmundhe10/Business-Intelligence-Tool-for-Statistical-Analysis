/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.TopLevelOrganization;
import Business.Organization.TopLevelOrganization_Chemicals;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TopLevelRole_Chemicals.AdminWorkRequestAreaJPanel_Chemicals;
import userinterface.TopLevelRole_Engineering.AdminWorkRequestAreaJPanel;

/**
 *
 * @author msneh
 */
public class TopLevelManagementRole_Chemicals extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AdminWorkRequestAreaJPanel_Chemicals(userProcessContainer, account, (TopLevelOrganization_Chemicals)organization, enterprise);
    }
    
    
}
