package Problem6;

public class Computer implements Cloneable {
	
	 String manufacturer ;
	    String processor;
	    int ramSize;
	    double processorSpeed;
	    
	    //Constructor to initialize the instance variables
	    
	    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
	        
	        this.manufacturer = manufacturer;
	        this.processor = processor;
	        this.processorSpeed = processorSpeed;
	        this.ramSize = ramSize;
	    
	    }

	    public int getRamSize(){
	     
	        return ramSize;
	    }
	    
	    public double getProcessorSpeed(){
	    
	        return processorSpeed;
	    }
	    
	    public double computerPower(){
	    
	        return ramSize * processorSpeed;
	    }
	    
	    @Override
	    
	    public String toString(){
	        return manufacturer  + processor + processorSpeed + ramSize;
	    
	    }
	    
	    @Override
	    
	    public boolean equals(Object pc){
	        
	        if(pc == null) return false;
	        
	        if(pc == this) return true;
	        
	        //check if pc is an instance computer
	        
	        if(!(pc instanceof Computer))
	            return false;
	        
	        Computer comp = (Computer) pc;
	        
	       return comp.manufacturer.equals(manufacturer)
	               && comp.processor.equals(processor)
	               && comp.ramSize == this.ramSize 
	               && comp.processorSpeed == this.processorSpeed;
	        
	    }
	    
	    @Override
	    
	     public int hashCode(){
	         
	         int initialValue =7;
	         initialValue += manufacturer.hashCode();
	         initialValue += processor.hashCode();
	         initialValue += ramSize;
	         long f = Double.doubleToLongBits(processorSpeed);
	         initialValue += (int) (f ^ (f >>> 32));
	         return initialValue;

	 } 
}
