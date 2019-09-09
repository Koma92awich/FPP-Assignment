/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

/**
 *
 * @author koma9
 */
public class SortedString {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        
        String first ="ace";
        String second = "bdf";
        System.out.println(merge(first,second));
    }
        public static String merge(String one, String two){
        //String one = "KOMA";
        //String two = "KECH";
        

        
        String combined =  one + two;
        
        if(combined.length() == 1)
            return combined;
        if(combined== null)
            return null;
        
        String arr[] = combined.split("");
        String min = arr[0];
        for(String s:arr){
            if(s.compareTo(min) == -1)
                min =s;
        
        
        }
        
        if(one.indexOf(min) == 0){
            one = one.substring(0,one.indexOf(min)) + one.substring(one.indexOf(min)+ 1) ; 
        }
            else if(two.indexOf(min) == 0){
            two = two.substring(0,two.indexOf(min)) + two.substring(two.indexOf(min)+ 1) ; 
        }
        
        return min + merge(one,two);
        
        
        }
        
    
}
