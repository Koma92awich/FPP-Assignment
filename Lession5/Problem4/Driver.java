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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee[] salo = {new SalariedEmployee("Godfrey", "Komakech", "123-344-34",1200.0),
                           new BasePlusCommissionEmployee("Rita", "Alice", "243-776-75",0.5,2000000.0,1200.0),
                           new HourlyEmployee("Kalr", "Walker", "673-737-44", 200,8),
                           new CommissionEmployee("Dick", "Simon","453-454-43",0.5,100000.0),
                           new SalariedEmployee("Walter", "Peters", "193-344-34",1200.0)};
        
        double sum = 0.0;
        
        for(Employee dime: salo){
            
            sum += dime.getPayment();
            
            System.out.println(dime.toString());
       
        }
        System.out.println();
        System.out.println("The total Salary for all the  Employees is $ " + sum);
    }
    
}
