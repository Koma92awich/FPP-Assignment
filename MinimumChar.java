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
        System.out.println(minChar(name));
    }
    
    public static char minChar(String str){
        if(str.length()==1)
            return str.charAt(0);
        
        if(minChar(str.substring(1)) > str.charAt(0))
                return str.charAt(0);
        else
            return minChar(str.substring(1));
    
    
    }
    
}
