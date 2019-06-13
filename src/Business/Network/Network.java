/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author MyPC1
 */
public class Network {
   //Declared the variables 
    public String parentCompanyName;
    private String type;
    private String industry;
    private String headquarter;
    private String founder;
    private String areaServed;
    private int foundedIn;
    private EnterpriseDirectory enterpriseDirectory;
  
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
 

    public String getParentCompanyName() {
        return parentCompanyName;
    }

    public void setParentCompanyName(String parentCompanyName) {
        this.parentCompanyName = parentCompanyName;
    }
   

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getHeadquarter() {
        return headquarter;
    }

    public void setHeadquarter(String headquarter) {
        this.headquarter = headquarter;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getAreaServed() {
        return areaServed;
    }

    public void setAreaServed(String areaServed) {
        this.areaServed = areaServed;
    }

    public int getFoundedIn() {
        return foundedIn;
    }

    public void setFoundedIn(int foundedIn) {
        this.foundedIn = foundedIn;
    }
    
    
    
  
    @Override
    public String toString(){
        return parentCompanyName;
    }
    
}
