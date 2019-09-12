/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem5;

/**
 *
 * @author koma9
 */
public class Driver {

    /**sout
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Computer type1 = new Computer("IBM","INTEL",32,1.8);
        Computer type2 = new Computer("DELL","CoreI5",64,2.5);
        
       
        System.out.println(type1.equals(type2));
        System.out.println(type1);
    }
    
}
