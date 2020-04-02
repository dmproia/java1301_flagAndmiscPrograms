/**
 * Makes a frame for the program to run in.
 * 
 * @author (David Proia) 
 * @version (Flag Assignment 6)
 */
import javax.swing.JFrame;

public class FlagViewer
{
    public static void main(String[]args)
    {
        //frame for program of flags to run in
        JFrame frame;
        FlagProducer Panel = new FlagProducer();
        
        frame = new JFrame("Flags");
        frame.setVisible(true);
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        frame.add(Panel);
    }

}