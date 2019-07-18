/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    //private ArrayList<WorkRequest_Chemicals> workRequestList_Chemicals;

    public WorkQueue() {
        workRequestList = new ArrayList();
      //  workRequestList_Chemicals=new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

//    public ArrayList<WorkRequest_Chemicals> getWorkRequestList_Chemicals() {
//        return workRequestList_Chemicals;
//    }

    
    
}