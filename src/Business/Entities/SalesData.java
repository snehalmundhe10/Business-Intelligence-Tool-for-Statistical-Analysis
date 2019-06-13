/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Entities;

/**
 *
 * @author msneh
 */
public class SalesData {
    
    private int year; 
    private double sales;
     private double profit;
     private double profitRatio;
     private double profitPerOrder;
     private double salesPerCust;
     
    
     private int quantity;

    public SalesData() {
        this.sales = sales;
        this.profit = profit;
        this.profitRatio = profitRatio;
        this.profitPerOrder = profitPerOrder;
        this.salesPerCust = salesPerCust;
       this.year=year;
        this.quantity = quantity;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getProfitRatio() {
        return profitRatio;
    }

    public void setProfitRatio(double profitRatio) {
        this.profitRatio = profitRatio;
    }

    public double getProfitPerOrder() {
        return profitPerOrder;
    }

    public void setProfitPerOrder(double profitPerOrder) {
        this.profitPerOrder = profitPerOrder;
    }

    public double getSalesPerCust() {
        return salesPerCust;
    }

    public void setSalesPerCust(double salesPerCust) {
        this.salesPerCust = salesPerCust;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

     public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
     
      
    
}
