/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author msneh
 */
public class WorkQueue_Chemicals {
    private ArrayList<WorkRequest> workRequestListChem;
    //private ArrayList<WorkRequest_Chemicals> workRequestList_Chemicals;

    public WorkQueue_Chemicals() {
        workRequestListChem = new ArrayList();
      //  workRequestList_Chemicals=new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestListChem() {
        return workRequestListChem;
    }
}
