
package Business;

import Business.Entities.SalesData;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import java.util.List;


public class EcoSystem extends Organization
{
   
    private static EcoSystem business; 
    private ArrayList<Network> networkList;
   private ArrayList<SalesData>salesListNano;
  
    public static EcoSystem getInstance(){
       
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
  
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);  
        return network;
    }
 
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
  
    private EcoSystem(){
        super(null);
       networkList=new ArrayList<Network>(); 
       salesListNano=new ArrayList<SalesData>();
    }
 
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public ArrayList<SalesData> getSalesListNano() {
        return salesListNano;
    }

    public void setSalesListNano(ArrayList<SalesData> salesList) {
        this.salesListNano = salesListNano;
    }
    
    

    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
           
        }
        return true;
    }
    public Network addNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    public SalesData addSalesData()
    { 
        
         SalesData salesInfo=new SalesData();
          salesListNano.add(salesInfo);
        return salesInfo;
    }   
    public List<SalesData>getProfitData(double maxProf,double minProf)
    {
        List<SalesData>profitList=new ArrayList<>();
        for(SalesData sales: salesListNano)
        {
            if(sales.getProfit()<maxProf && sales.getProfit()>minProf)
            {
                profitList.add(sales);
            }
        }
        return profitList;
    }
    
}
