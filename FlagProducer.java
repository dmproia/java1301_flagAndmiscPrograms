 /**
 * The core of the program that pulls and extracts files and modules.
 * 
 * @author (David Proia) 
 * @version (Assignment 6)
 */
import javax.swing.JComponent;
import java.awt.Graphics;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import javax.swing.*;

public class FlagProducer extends JComponent
{    
    Flag Flag1, Flag2, Flag3, Flag4, Flag5;
    String name;
    String color1;
    String color2;
    String color3;    
    String file;
    String choice;
    
    public FlagProducer ()
    {
        Scanner scan = new Scanner(System.in);    
        //system out print to ask user a question
        
        System.out.print("Please enter a choice either H to load up either Horizontal Flags or V to load up Vertical Flags: ");
        choice = scan.next();
        //if statement to pick either text documents
        if (choice.equalsIgnoreCase("h"))       
            file = "hflags.txt";
        else if(choice.equalsIgnoreCase("v"))
            file = "vflags.txt";
       getData();
    }
    
    private static Flag parseLine(String line)
    {
         Scanner lineScanner;
         String name;
         String color1;
         String color2;
         String color3;
         Flag country;
         //scans document in order and at the "," goes to next part
         lineScanner = new Scanner(line);
         lineScanner.useDelimiter(",");
         
         name = lineScanner.next();  
         color1 = lineScanner.next();
         color2 = lineScanner.next();
         color3 = lineScanner.next(); 
           
         country = new Flag (name, color1, color2, color3);
         
         return country;         
    }    
         
    public void getData()
    {
        try
        {
           String fileName = file; //pulls file from above that is detected
           File dataFile;
           Scanner scan;
           
           dataFile = new File(fileName);
           scan = new Scanner(dataFile);
           
           String line;
            
           line = scan.nextLine();
           Flag1 = parseLine(line);
            
           line = scan.nextLine();
           Flag2 = parseLine(line);
            
           line = scan.nextLine();
           Flag3 = parseLine(line);
            
           line = scan.nextLine();
           Flag4 = parseLine(line);  
            
           line = scan.nextLine();
           Flag5 = parseLine(line);            

        }
        catch (IOException exception){JOptionPane.showMessageDialog(null, "file not opened");}
    }

    public void paintComponent(Graphics g)
    
    {    
        
        //draws horizontal flags
        if (choice.equalsIgnoreCase("h"))        
        {
            Flag1.hdraw(g, 20, 20);
            Flag2.hdraw(g, 20, 140);
            Flag3.hdraw(g, 20, 260);
            Flag4.hdraw(g, 20, 380);
            Flag5.hdraw(g, 20, 500);
        }
        //draws vertical flags
        else if(choice.equalsIgnoreCase("v"))
        {
            Flag1.vdraw(g, 20, 20);
            Flag2.vdraw(g, 20, 120);
            Flag3.vdraw(g, 20, 220);
            Flag4.vdraw(g, 20, 320);
            Flag5.vdraw(g, 20, 420);
        }
    }     
}