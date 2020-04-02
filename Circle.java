/**
 * Write a description of class Circle here.
 * 
 * @author (David Proia) 
 * @version (Lab 26)
 */
public class Circle
{
    // instance variables - replace the example below with your own
    private double radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(double theRadius)
    {
        // initialise instance variables
        radius = theRadius;
    };

    public void setRadius(double aValue)   
    {
        radius = aValue;
    }
    
    public double getRadius()   
    {
        return radius;
    }    
    
    public double getCircumference()
    {
        double myCircumference = 2 * Math.PI * radius;
        return myCircumference;
    }    
    
    public double getArea()
    {
        double myArea = Math.PI * radius * radius;
        return myArea;
    }
    
    public String toString()
    {
        String myString = "";
        myString += "Radius:\t" + radius;
        myString += "\nCircumference:\t" + getCircumference();
        myString += "\nArea:\t" + getArea();
        return myString;
    }
        
}
