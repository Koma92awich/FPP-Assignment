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
public class Secretary extends DeptEmployee{
    
    public Secretary(String name, double salary, LocalDate date){
        super( name,salary, date);
    
    
    }
    
    double overTimeHours;

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }
    
    @Override
    public double computeSalary(){
        return salary + (12*overTimeHours);
    
    }
    
    
    
}
