/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
 //declared variables   
    private ArrayList<UserAccount> userAccountList;
//--------------------------------------------------------------------------------------------------
    //initialised declared variable in the constructor of userAccountDirectory
    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }
//--------------------------------------------------------------------------------------------------
    //getter setter for the variable
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
 //------------------------------------------------------------------------------------------------
    //authentication of user   
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
//----------------------------------------------------------------------------------------------- 
    //creating userAccount
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    //check if username is unique--username should be unique
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
