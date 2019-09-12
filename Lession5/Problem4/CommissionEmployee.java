/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem4;

/**
 *
 * @author koma9
 */
public class CommissionEmployee extends Employee {
    
    double commissionRate;
    double grossSale;
    
    public CommissionEmployee(String firstName, String lastName,String socialSecurityNumber,double commissionRate, double grossSale ){
        
        super(firstName,lastName,socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    
    }

    @Override
    public double getPayment() {
        return commissionRate * grossSale;
        
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double CommissionRate) {
        this.commissionRate = CommissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }
    
    
    
}
