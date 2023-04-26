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

    /* The buttons used for Welcome Screen are declared here
     */
    private JButton addDebitCard_welcomeScreen, 
                    addCreditCard_welcomeScreen,
                    checkBalance_welcomeScreen,
                    debitCardInfo_welcomeScreen,
                    creditCardInfo_welcomeScreen,
                    withdraw_welcomeScreen;
       
    /**
     * ALl the Jframe components are made inside its constructor
     */
    private BankGUI() {
        mainJFrame = new JFrame("Bank GUI"); //Creating the main JFrame 

        /* creating Jpanels*/
        JPanel mainScreen_panel = new JPanel();

        /* Initializing different fonts */
        Font headerFont = new Font(Font.DIALOG, Font.PLAIN, 24);
        Font inputLabelFont = new Font(Font.DIALOG, Font.PLAIN, 18);

        /* JLabel components welcomeScreen*/
        JLabel mainScreenWelcome_label = new JLabel("Welcome User,");
        JLabel mainScreenInstruction_label = new JLabel("Please add client name before proceeding");

        /* setting fonts for JLabel */
        mainScreenWelcome_label.setFont(headerFont);
        mainScreenInstruction_label.setFont(inputLabelFont);

        /*JButton Components welcome Screen*/

        /* JTextFeild Components */

        /*setBounds for components*/
        mainScreenWelcome_label.setBounds(250, 169, 166, 35);
        mainScreenInstruction_label.setBounds(250, 208, 337, 25);

        /* Add components to JPanel */
        mainScreen_panel.add(mainScreenWelcome_label);
        mainScreen_panel.add(mainScreenInstruction_label);

        /* set layout of jpanel */
        mainScreen_panel.setLayout(null);
        mainScreen_panel.setSize(1200, 672);

        /* Add JPanel to JFrame */
        mainJFrame.add(mainScreen_panel);

        
        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        mainJFrame.setLayout(null); //removing the default layout 
        mainJFrame.setSize(1200, 672); //setting the width and height of the JFrame
        mainJFrame.setVisible(true); //setting the visibility of mainFrame
    }

    public static void main (String[] Args) {
      new BankGUI();
    }
}
