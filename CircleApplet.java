
/**
 * Write a description of class CircleApplet here.
 * 
 * @author (David) 
 * @version (lab 26)
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JApplet;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class CircleApplet extends JApplet
{  


    Circle myCircle1, myCircle2, myCircle3;
    public void init()
    {
        resize(500,1000);
        getData();
    }
    
    private static Circle parseLine(double line)
    {
        JOptionPane.showMessageDialog(null, "entering parseLine"); 
        
        Scanner lineScanner; 
        Font big;
        Color gray;
        double Circle;
        
        
        
        double Radius;
        double Circumference;
        double Area;

        return Circle;

        
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
            myCircle1 = parseLine(line);
            
            line = scan.nextLine();
            myCircle2 = parseLine(line);
            
            line = scan.nextLine();
            myCircle3 = parseLine(line);            
        }
        catch(IOException exception)
        {
            JOptionPane.showMessageDialog(null, "file not opened");
        }
        
    }


    

   public void paint(Graphics g)
   {  
       //Display Circles in applet
        displayCircle( g, myCircle1, 20, 40);
        displayCircle( g, myCircle2, 20, 80);
        displayCircle( g, myCircle3, 20, 120);
      
   }
   public void displayCircle(Graphics g, Circle cir, int x, int y)
   {
       String response;
       //builds text to display an applet
       response = "Radius: " + Circle.getRadius() + " Area: " + Circler.getArea() + "Circumference: " + Circle.getCircumference();
       
       g.drawString(response, x+20, y);
       
    }
}
