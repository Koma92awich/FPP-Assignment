/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

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
        Shape shapes [] = {new Rectangle("Blue",4.0,2.0),
                         new Circle("Blue",4.0),
                         new Square("Blue",2.0),
                         new Rectangle("Blue",10.0,10.0),
                         new Circle("Blue",4.0)  };
        
        printTotal(shapes);
        
        
        
        
    }
    public static void printTotal(Shape[] poly)  
        { // Implement your code   
            double totalArea = 0;
            double totalPerimeter = 0.0;
  
            for(Shape types: poly){
                
                totalArea += types.calculateArea();
                totalPerimeter += types.calculatePerimeter();
            
            
            }
            
            System.out.println("The total Area of all the shapes is " + totalArea);
            System.out.println("The total Perimeter of all the shapes is " + totalPerimeter );
            
        }
    
}
