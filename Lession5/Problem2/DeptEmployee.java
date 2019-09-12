/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

import java.time.LocalDate;
/**
 *
 * @author koma9
 */
public class DeptEmployee {
    String name;
    double salary;
    LocalDate date;
    
    public DeptEmployee(String name, double salary, LocalDate date){

        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public double computeSalary(){
        return salary;
    
    
    }

   
    
}
