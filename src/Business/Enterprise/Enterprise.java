 
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

//Abstract Class  Enterprise which is a child class of Organization
public abstract class Enterprise extends Organization{

   //Declared Variables  
    private EnterpriseType enterpriseType; //******For my project--Subsidary Type ********//
    private OrganizationDirectory organizationDirectory; //*****For project--Department Directory*****//
//------------------------------------------------------------------------------------------------------
    //Getter of Organization Directory
    //*****For project--Department/Domain Directory
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
//-----------------------------------------------------------------------------------------------------  
     ///Enum is a data type
     //We can define multiple enums
    //To get the enum variable value into a string actual value not address at enum--hence 
    //created the variable String Value
    //Passed it into the method named EnterpriseType and initialised it.
    //Created getter of the String Value
    //Overriden toString method to get the actual value of the enum but not its address--to show
    
    //****For project--EnterpriseType--SubsidaryType********//
    public enum EnterpriseType{
        Engineering("Engineering"), Chemicals("Chemicals");
        private String value;
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
   }
//------------------------------------------------------------------------------------------------------    
//getter setter of EnterPriseType
 //***** For our Project SubsidaryType**************//   
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
//----------------------------------------------------------------------------------------------------
   //Created the constructor of Enterprise Class
   //supar(name)--it calls the constructor of the super class with parameter name  
   //name--Name of the enterprise
    
   //********For Project Enterprise class~~Subsidary Class**********// 
   //*********For Project EnterpriseType is---SubsidaryType*********//
  //*********For Project name--SubSidaryName***********************//
  //********For project Orgnization Directory---Department Directory*******//  
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
}
