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
public abstract class Employee {
    String firstName;
    String lastName;
    String socialSecurityNumber;
    
    public Employee(String firstName, String lastName,String socialSecurityNumber){
    
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    
    }
    
     abstract double getPayment();
     
   
    
    
    
    @Override
    public String toString(){
    
        return "Salary for " + firstName +" "+ lastName + " : " +"$"+  getPayment();
    
    }
    
    
}

