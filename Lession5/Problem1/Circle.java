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
public class Circle extends Shape {
    
    protected double radius;
    
    public Circle(String color,double radius){
        super(color);
        
    
    }
    
    @Override
    public double calculateArea(){
        
        return Math.PI*radius*radius;
        
        
    
    }
    
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    
    
    }
    
    
}
