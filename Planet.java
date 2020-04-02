/**
 * class Employee with name, age, isCertified, zip.
 * 
 * @author (David Proia) 
 * @version (Assignment 5)
 */
public class Planet
{
    // instance variables
    String name;
    double mass;
    double volume;
    double radius;
    double surfaceArea;
    double density;
    double distance;


    /**
     * Constructor for objects of class Employee
     */
    public Planet(String name, double mass, double radius, double distance)
    {
        // initialise instance variables
        this.mass = mass;
        this.name = name;
        this.distance = distance; 
        this.radius = radius;

    }

    //Mass instances
    public double getmass()
    {
        return mass;
    }


    public void setmass(double newMass)
    {
        mass = newMass;
    }

    //distance instances
    public double getdistance()
    {
        return distance;
    }


    public void setdistance(double newdistance)
    {
        distance = newdistance;
    }
    
    //Name instance
    public String getname()
    {
        return name;
    }


    public void setname(String newName)
    {
        name = newName;
    }
    
    //Volume instance
    public double getvolume()
    {
        volume = 4 / 3 * 3.14 * radius * 3;
        return volume;
    }


    public void setvolume(double newVolume)
    {
        volume = newVolume;
    }
    
    //Surfacearea instance
    public double getsurfaceArea()
    {
        surfaceArea = 4 * 3.13 * radius * 2;
        return surfaceArea;
    }


    public void setsurfaceArea(double newsurfaceArea)
    {
        surfaceArea = newsurfaceArea;
    }    
    
    //density instance
    public double getdensity()
    {
        density = mass / getvolume();
        return density;
    }


    public void setdensity(double newdensity)
    {
        density = newdensity;
    }    
    
    //Radius instance
    public double getradius()
    {
        return radius;
    }


    public void setradius(double newRadius)
    {
        radius = newRadius;
    }
    
    public String toString()
    {
        String result;
        result = "name = \t" + name;
        result += "\nmass   = \t" + mass;
        result += "\nvolume  = \t" + volume;
        result += "\nradius = \t" + radius;
        result += "\ndistance = \t" + distance;
        result += "surfaceArea = \t" + surfaceArea;
        result += "density = \t" + density;
        return result;
    }
}