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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName,String socialSecurityNumber,double commissionRate, double grossSale,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,commissionRate,grossSale);
        this.baseSalary = baseSalary;
    
    }
    
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    
    @Override
    public double getPayment(){
        return baseSalary + (grossSale * commissionRate);
    
    
    }
    
    
    
}
