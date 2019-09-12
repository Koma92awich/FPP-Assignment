
package Problem2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author koma9
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        DeptEmployee emp [] = {new Professor("Mike Smith", 500.0,LocalDate.of(1994,10,31)),
        new Professor("Mike Smith", 7000.0,LocalDate.of(2008,12,25)),
        new Professor("Allan Mark", 2500.0,LocalDate.of(2010,10,24)),
        new Secretary("Phlip Praff", 3000.0,LocalDate.of(2002,05,06)),
        new Secretary("Christine Millan", 4000.0,LocalDate.of(2005,01,12))};
        
        
        Scanner ask = new Scanner(System.in);
        System.out.println(" Do you wishes to see the sum of all Professor and Secretary salary in the department ?"+ "(Y/N)");
        
           
        String input = ask.nextLine();
        double sum =0.0;
        
        
        switch(input.toUpperCase()){
            case "Y":
                
                for(DeptEmployee worker: emp){
                
                    sum += worker.computeSalary();
                
                }
            System.out.println("The sumof all Proffessor and Secretary salries is $" + sum);
                break;
                
            case "N":
                System.out.println("Thak you");
                
                break;
                
            default:
                System.out.println("Nice try");
        
    
    }
        
    }
    
}
