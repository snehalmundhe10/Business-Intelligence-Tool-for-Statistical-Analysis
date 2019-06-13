/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SalesExecutiveRole;
import Business.Role.Role;
import java.util.ArrayList;


public class SalesOrganization extends Organization{

    public SalesOrganization() {
        super(Organization.Type.Sales.getValue());
  }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalesExecutiveRole());
        return roles;
    }
     
   
    
    
}
