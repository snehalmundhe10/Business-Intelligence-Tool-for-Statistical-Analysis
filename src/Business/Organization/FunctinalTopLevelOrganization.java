/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.TopLevelManagementRole;
import Business.Role.Role;
import java.util.ArrayList;


public class FunctinalTopLevelOrganization extends Organization{
 
   
    public FunctinalTopLevelOrganization() {
        super(Organization.Type.Admin.getValue());
        
    }
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TopLevelManagementRole());
        return roles;
    }
     
}