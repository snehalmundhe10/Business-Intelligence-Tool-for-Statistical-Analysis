/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
//list of enterprises
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   
//getter setter of enterprises
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    //constructor of enerprise directory class
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        //why made it null
        Enterprise enterprise=null;
       //enum variable type--enterprise type 
        //if type is equal to type of enterperise(enum) from enterprise class--engineering
        //then set the name of that type of enum(engieerig)--name etered by the user
        if(type==Enterprise.EnterpriseType.Engineering){
            enterprise=new EngineeringEnterprise(name);
            //and then add this enterprise name to enterprise list and retrn the enterise
            enterpriseList.add(enterprise);
        }
       else if(type==Enterprise.EnterpriseType.Chemicals){
            enterprise=new ChemicalsEnterprise(name);
            //and then add this enterprise name to enterprise list and retrn the enterise
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
