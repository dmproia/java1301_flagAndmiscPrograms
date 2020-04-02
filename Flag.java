/**
 * Flags and colors that are set/get to use in the FlagProducer Class.
 * 
 * @author (David Proia) 
 * @version (Assignment 6)
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;

public class Flag
{
   private String name;
   private String color1;
   private String color2;
   private String color3;
   
   public Flag (String nameflag, String type1, String type2, String type3)
   {
       name = nameflag;
       color1 = type1;
       color2 = type2;
       color3 = type3;
   }
   
   //flag instance, chooses which flag to use
    public String getname()
    {
        return name;
    }
    public void setname(String newName)
    {
        name = newName;
    }
   
   //color1 isntances
    public String getcolor1()
    {
        return color1;
    }
    public void setcolor1(String newColor1)
    {
        color1 = newColor1;
    }
    
   //color2 isntances
    public String getcolor2()
    {
        return color2;
    }
    public void setcolor2(String newColor2)
    {
        color2 = newColor2;
    }
   
    //color3 isntances
    public String getcolor3()
    {
        return color3;
    }
    public void setcolor3(String newColor3)
    {
        color3 = newColor3;
    }   
    
    //sets up a vertical display for the vflag.txt
     public void vdraw(Graphics g, int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;
         
        g2.drawString(name, x, y);
        Rectangle leftRectangle = new Rectangle (x, y, 30, 80);
        Color col1 = colorgetter(color1);
        g2.setColor(col1);
        g2.fill(leftRectangle);
        
        Rectangle middleRectangle = new Rectangle (x+30, y, 30, 80);
        Color col2 = colorgetter(color2);
        g2.setColor(col2);
        g2.fill(middleRectangle);
        
        Rectangle rightRectangle = new Rectangle (x+60, y, 30, 80);
        Color col3 = colorgetter(color3);
        g2.setColor(col3);
        g2.fill(rightRectangle);   
        
        
        g2.setColor(Color.black);
        g2.drawRect(x, y, 90, 80);
    }   
    
    //sets up a horizontal display for the hflag.txt
    public void hdraw(Graphics g,  int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString(name, x, y);
        
        Rectangle leftRectangle = new Rectangle (x, y, 120, 30);
        Color col1 = colorgetter(color1);
        g2.setColor(col1);
        g2.fill(leftRectangle);
                
        Rectangle middleRectangle = new Rectangle (x, y+30, 120, 30);
        Color col2 = colorgetter(color2);
        g2.setColor(col2);
        g2.fill(middleRectangle);
        
        Rectangle rightRectangle = new Rectangle (x, y+60, 120, 30);
        Color col3 = colorgetter(color3);
        g2.setColor(col3);
        g2.fill(rightRectangle);
        
        g2.setColor(Color.black);
        g2.drawRect(x, y, 120, 90);
    }      
    
    //translates colors
    public Color colorgetter(String c)
    {
        Color col;
        if (c.equalsIgnoreCase("BLUE"))
        {
            col = Color.BLUE;
        }
        else if (c.equalsIgnoreCase("yellow"))
        {
            col = Color.YELLOW;
        }
        else if (c.equalsIgnoreCase("black"))
        {
            col = Color.BLACK;
        }
        else if (c.equalsIgnoreCase("cyan"))
        {
            col = Color.CYAN;
        }
        else if (c.equalsIgnoreCase("gray"))
        {
            col = Color.GRAY;
        }

        else if (c.equalsIgnoreCase("green"))
        {
            col = Color.GREEN;
        }
        else if (c.equalsIgnoreCase("Magenta"))
        {
            col = Color.MAGENTA;
        }
        else if (c.equalsIgnoreCase("Orange"))
        {
            col = Color.ORANGE;
        }
        else if (c.equalsIgnoreCase("pink"))
        {
            col = Color.PINK;
        }
        else if (c.equalsIgnoreCase("red"))
        {
            col = Color.RED;
        }
        else if (c.equalsIgnoreCase("white"))
        {
            col = Color.WHITE;
        }
        else
        {
            col = Color.BLACK;
        }
        
        return col;
    }
}