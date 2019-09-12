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
public class Professor extends DeptEmployee {
    int numberOfPublications;

    public Professor(String name,double salary,LocalDate date){
        super(name, salary, date);
    
    }
    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
    
    
    
    
    
}
