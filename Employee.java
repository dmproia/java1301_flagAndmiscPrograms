/**
 * class Employee with name, age, isCertified, zip.
 * 
 * @author (wsummers) 
 * @version (10/6/2011)
 */
public class Employee
{
    // instance variables
    String name;
    int age;
    boolean isCertified;


    /**
     * Constructor for objects of class Employee
     */
    public Employee(String name,int age,boolean isCertified)
    {
        // initialise instance variables
        this.name = name;
        this.age = age; 
        this.isCertified = isCertified;
    }

    /**
     * getName - returns name name
     * 
     * @return     name name 
     */
    public String getName()
    {
        return name;
    }

    /**
     * setName - updates name name
     * 
     * @param  newName   new value of namename
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     * getAge - returns age 
     * 
     * @return     age 
     */
    public int getAge()
    {
        return age;
    }

    /**
     * setAge - updates age name
     * 
     * @param  newAge   new value of age 
     */
    public void setAge(int newAge)
    {
        age = newAge;
    }

    /**
     * getIsCertified - returns isCertified 
     * 
     * @return      isCertified 
     */
    public boolean getIsCertified()
    {
        return isCertified;
    }

    /**
     * setIsCertified - updates isCertified
     * 
     * @param  newIsCertified   new value of isCertified
     */
    public void setIsCertified(boolean newIsCertified)
    {
        isCertified = newIsCertified;
    }
      
    /**
     * toString - returns contents of object
     * 
     * @return    result
     */
    public String toString()
    {
        String result;
        result = "name = \t" + name;
        result += "\nage   = \t" + age;
        result += "\nisCertified  = \t" + isCertified;        
        return result;
    }
}