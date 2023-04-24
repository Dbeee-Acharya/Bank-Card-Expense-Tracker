/**
 * The BankGUI class 
 */

import javax.swing.*; //Importing the java swing components

public class BankGUI {
    
    private JFrame mainFrame; //creating a new JFrame instance
    
    public BankGUI() {
        mainFrame = new JFrame("Bank GUI"); // Creating the main JFrame 
        
        
        
        mainFrame.setSize(1200, 672); // setting the width and height of the jframe
        mainFrame.setLayout(null);  // removing the default layout 
        mainFrame.setVisible(true); // setting the visibility of mainFrame
    }
}
