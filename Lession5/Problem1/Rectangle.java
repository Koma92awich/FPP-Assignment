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
public class Rectangle extends Shape {
    
    protected double widith;
    protected double height;
    
  
    public Rectangle(String color,double widith, double height){
        super(color);
        this.height = height;
        this.widith = widith;
    
    
    }
    
    @Override
    public double calculateArea(){
        
        return widith * height;
    
    }
    
    public double calculatePerimeter(){
        
        return 2 * widith + 2 * height;
    
    
    }
    
}
