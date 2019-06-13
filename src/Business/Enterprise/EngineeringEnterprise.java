
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;


public class EngineeringEnterprise extends Enterprise {
    
    public EngineeringEnterprise(String name){
        super(name,EnterpriseType.Engineering);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
