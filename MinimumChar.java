/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinChar;

/**
 *
 * @author koma9
 */
public class MinimumChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Komakech";
        System.out.println(min(name));
    }
    
    public static char min(String qwe){
         
        if(qwe.isEmpty())
             return 0;
        
        if(qwe.length() == 1)
             return qwe.charAt(0);
                   
        
        else{
            
            
        
        char first = qwe.charAt(0);
        char secondx = qwe.charAt(1);
        
         qwe =qwe.substring(1);
       
        if(first > secondx){
            
            first = secondx;
        }
        
        else {
           qwe = first+qwe.substring(1);
            //System.out.println(qwe);
        }
        return min(qwe);
    
    }
    }
    
}
