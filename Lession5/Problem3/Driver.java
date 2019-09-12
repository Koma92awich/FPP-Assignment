/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem3;

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
        
        Figure[] design = {new Vertical(),new FaceMaker(),new UpwardHat(),new DownWardHat()};
        
        for( Figure a: design){
            a.getFigure();
        }
        System.out.println();
        System.out.println();
        
        for( Figure a: design){
            System.out.print( a.getClass().getSimpleName() + ":");
            a.getFigure();
            System.out.println();
          
        }
        
    }
}