/**
 * The BankGUI class 
 */

import javax.swing.*; //Importing the java swing components
import java.awt.event.*; //For event handling
import java.awt.color.*; //to set color
import java.awt.Font; // to set font
import java.util.ArrayList; //to use arrayList

public class BankGUI {
    
    private JFrame mainJFrame; //creating a new JFrame instance
   
    /**
     * ALl the Jframe components are made inside its constructor
     */
    private BankGUI() {
        mainJFrame = new JFrame("Bank GUI"); //Creating the main JFrame 

        /* Initializing different fonts */
        Font headerFont = new Font(Font.SANS_SERIF, Font.PLAIN, 24);
        Font inputLabelFont = new Font(Font.SANS_SERIF, Font.PLAIN, 18);

        /* JLabel components */
        JLabel loginScreenWelcome_label = new JLabel("Welcome");
        JLabel loginScreenUserName_label = new JLabel("Username");
        JLabel loginScreenPassword_label = new JLabel("Password");

        /* setting fonts for JLabel */
        loginScreenWelcome_label.setFont(headerFont);
        loginScreenUserName_label.setFont(inputLabelFont);
        loginScreenPassword_label.setFont(inputLabelFont);

        /* JTextFeild Components */


        /* JPanel Components */
        JPanel loginScreen_panel = new JPanel();

        /*setBounds for components*/
        loginScreenWelcome_label.setBounds(548, 548, 105, 40);
        loginScreenUserName_label.setBounds(385, 350, 95, 25);
        loginScreenPassword_label.setBounds(393, 423, 79, 25);

        /* Add components to JPanel */
        loginScreen_panel.add(loginScreenWelcome_label);
        loginScreen_panel.add(loginScreenUserName_label);
        loginScreen_panel.add(loginScreenPassword_label);

        /* set visibility of jpanel */
        loginScreen_panel.setSize(1200, 672);

        /* Add JPanel to JFrame */
        mainJFrame.add(loginScreen_panel);

        
        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        mainJFrame.setSize(1200, 672); //setting the width and height of the JFrame
        mainJFrame.setLayout(null); //removing the default layout 
        mainJFrame.setVisible(true); //setting the visibility of mainFrame
    }

    public static void main (String[] Args) {
      new BankGUI();
    }
}
