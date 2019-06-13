/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TopLevelManagementRole;
import Business.Role.TopLevelManagementRole_Chemicals;
import java.util.ArrayList;

/**
 *
 * @author msneh
 */
public class TopLevelOrganization_Chemicals extends Organization {
    
     public TopLevelOrganization_Chemicals() {
        super(Organization.Type.TopLevel.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TopLevelManagementRole_Chemicals());
        return roles;
    }
     
}

