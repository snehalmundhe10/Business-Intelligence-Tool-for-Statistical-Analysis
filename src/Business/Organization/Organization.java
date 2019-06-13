    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkQueue_Chemicals;
import java.util.ArrayList;

//Organization is an abstarct class
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private WorkQueue_Chemicals workQueueChem;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), TopLevelManagement("Top Level Management(Engineering)"), Sales("Sales"),Finance("Finance"),TopLevel("Top Level Management(Chemicals)");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        workQueueChem=new WorkQueue_Chemicals();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public WorkQueue_Chemicals getWorkQueueChem() {
        return workQueueChem;
    }

    public void setWorkQueueChem(WorkQueue_Chemicals workQueueChem) {
        this.workQueueChem = workQueueChem;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
