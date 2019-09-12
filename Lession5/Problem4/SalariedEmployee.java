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
public class SalariedEmployee extends Employee {
    
    double weeklySalary;
    
    public SalariedEmployee(String firstName, String lastName,String socialSecurityNumber,double weeklySalary){
        
        super(firstName,lastName,socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    
    }

    @Override
    public double getPayment() {
      
        return weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
    
}
