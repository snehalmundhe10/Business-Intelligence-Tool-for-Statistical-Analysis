/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FinanceExecutiveRole_Chemical.FinanceExecutiveWorkAreaJPanel;
import userinterface.SalesExecutiveRole_Engineering.SalesExecutiveWorkAreaJPanel;

/**
 *
 * @author msneh
 */
public class FinancialAnalystRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FinanceExecutiveWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
}
