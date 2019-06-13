/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FinancialAnalystRole;
import Business.Role.SalesExecutiveRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author msneh
 */
public class FinanceOrganization extends Organization {
    
     public FinanceOrganization() {
        super(Organization.Type.Finance.getValue());
  }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FinancialAnalystRole());
        return roles;
    }
}
