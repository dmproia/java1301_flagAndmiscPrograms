import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;

/**
 * Class IOApplet - example that shows the use of reading from a file with an Applet
 * 
 * @author (wayne summers) 
 * @version (10/16/2011)
 */
public class IOApplet extends JApplet
{

    Employee employee1, employee2, employee3;
/**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init() 
    {
        resize(500,1000);
        getData();
    }
   
    /**
     * parseLine method receives a line of text for an employee
     * of the form name,age,certified where each field is separated by a comma
     * the line is parsed and a rsponse is built and returned
     * 
     * @parm line - line of text
     * @return - Employee
     */
    private static Employee parseLine(String line) 
    {
      JOptionPane.showMessageDialog(null, "entering parseLine");
        
      Scanner lineScanner;
      String name;
      int age;
      boolean isCertified;
      Employee emp;
      
      lineScanner = new Scanner(line);
      lineScanner.useDelimiter(",");
      
      name = lineScanner.next();
      age = lineScanner.nextInt();
      isCertified = lineScanner.nextBoolean();
      
      emp = new Employee (name, age, isCertified);
      
      return emp;
    }
    
    public void getData()
    {
        try
        {
            String fileName = "data.txt"; //comma separated file
            File dataFile;
            Scanner scan;
                
            dataFile = new File(fileName);
            scan = new Scanner(dataFile);
        
            String line;
            
            line = scan.nextLine();
            employee1 = parseLine(line);
            
            line = scan.nextLine();
            employee2 = parseLine(line);
            
            line = scan.nextLine();
            employee3 = parseLine(line);
        }
        catch (IOException exception)
        {
            JOptionPane.showMessageDialog(null, "file not opened");
        }       
    }
    
    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
        // displays employees in Applet
        displayEmployee( g, employee1, 20, 40);
        displayEmployee( g, employee2, 20, 80);
        displayEmployee( g, employee3, 20, 120);
    }
 
    /**
     * displayEmployee method that displays an employee at a designated location.
     * 
     * @param  g   the Graphics object for this applet
     * @param  emp   employee
     * @param  x   x coordinate of location to drawString
     * @param  y   y coordinate of location to drawString
     */
    public void displayEmployee(Graphics g, Employee emp, int x, int y)
    {
        String response;
        // build text to display on applet
        response = "It is " + emp.getIsCertified() + " that " + emp.getName() + ", age "
         + emp.getAge() + ", is certified.";
         
        g.drawString(response, x+20, y);
        if (emp.getIsCertified())
            g.drawString("****", x-10, y);
        if (emp.getAge() < 21)
            g.drawString("underage", x, y+10);
        else
            g.drawString("age ok", x, y+10);
        if (emp.getName().equalsIgnoreCase("joe"))
            g.drawString("flag this record", x +50, y+10);
    }

}