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
public class HourlyEmployee extends Employee {
    
    double wage;
    double hours;

    public HourlyEmployee(String firstName, String lastName,String socialSecurityNumber,double wage,double hours){
        super(firstName,lastName,socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    
    
    }
    @Override
    public double getPayment() {
        return wage * hours; 
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
}
