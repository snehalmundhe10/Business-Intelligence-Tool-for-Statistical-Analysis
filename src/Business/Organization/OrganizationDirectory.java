/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;
public class OrganizationDirectory {
   
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.TopLevelManagement.getValue())){
            organization = new TopLevelOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Sales.getValue())){
            organization = new SalesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Finance.getValue())){
            organization = new FinanceOrganization();
            organizationList.add(organization);
        }
        
         if (type.getValue().equals(Type.TopLevel.getValue())){
            organization = new TopLevelOrganization_Chemicals();
            organizationList.add(organization);
        }
        return organization;
    }
}