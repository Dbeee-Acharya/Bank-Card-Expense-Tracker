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
    private JButton addClientNameMainScreen_button,
            addDebitCardMainScreen_button, 
            addCreditCardMainScreen_button,
            checkBalanceMainScreen_button,
            debitCardInfoMainScreen_button,
            creditCardInfoMainScreen_button,
            withdrawMainScreen_button;

    /* JLabel used */
    private JLabel mainScreenWelcome_label,
            mainScreenInstruction_label;

    /* TextFields used */
    private JTextField clientNameMainScreen_textField;
       
    /**
     * ALl the Jframe components are made inside its constructor
     */
    private BankGUI() {
        mainJFrame = new JFrame("Bank GUI"); //Creating the main JFrame 

        /* creating Jpanels*/
        JPanel mainScreen_panel = new JPanel();

        /* Icons */
        Icon addUser_icon = new ImageIcon("./icons/addUser.png"); //icon for add user
        Icon addCard_icon = new ImageIcon("./icons/addCard.png"); //icon for adding debit and credit card
        Icon checkBalance_icon = new ImageIcon("./icons/checkBalance.png"); //icon for checking balance
        Icon card_icon = new ImageIcon("./icons/card.png"); //icon for credit and debit card
        Icon withdraw_icon = new ImageIcon("./icons/withdraw.png"); //icon for withdraw


        /* Initializing different fonts */
        Font headerFont = new Font(Font.DIALOG, Font.PLAIN, 24);
        Font inputLabelFont = new Font(Font.DIALOG, Font.PLAIN, 18);

        /* JLabel components mainScreen*/
        mainScreenWelcome_label = new JLabel("Welcome User,");
        mainScreenInstruction_label = new JLabel("Please add client name before proceeding");

        /* setting fonts for JLabel */
        mainScreenWelcome_label.setFont(headerFont);
        mainScreenInstruction_label.setFont(inputLabelFont);

        /*JButton Components*/
        addClientNameMainScreen_button = new JButton("Add Client", addUser_icon);

        addDebitCardMainScreen_button = new JButton("Add Debit Card", addCard_icon);
        addCreditCardMainScreen_button = new JButton("Add Credit Card", addCard_icon);
        checkBalanceMainScreen_button = new JButton("Check Balance", checkBalance_icon);
        debitCardInfoMainScreen_button = new JButton("Debit Card Info", card_icon);
        creditCardInfoMainScreen_button = new JButton("Credit Card Info", card_icon);
        withdrawMainScreen_button = new JButton("Withdraw", withdraw_icon);

        /* JTextFeild Components */
        clientNameMainScreen_textField = new JTextField("Client Name");

        /*setBounds for components*/
        mainScreenWelcome_label.setBounds(250, 169, 166, 35);
        mainScreenInstruction_label.setBounds(250, 208, 337, 25);

        addClientNameMainScreen_button.setBounds(250, 300, 202, 40); 

        clientNameMainScreen_textField.setBounds(250, 250, 242, 34);

        addDebitCardMainScreen_button.setBounds(794, 139, 202, 40);
        addCreditCardMainScreen_button.setBounds(794, 210, 202, 40);
        checkBalanceMainScreen_button.setBounds(794, 281, 202, 40);
        debitCardInfoMainScreen_button.setBounds(794, 352, 202, 40);
        creditCardInfoMainScreen_button.setBounds(794, 423, 202, 40);
        withdrawMainScreen_button.setBounds(794, 494, 202, 40);

        /* Add components to JPanel */
        mainScreen_panel.add(mainScreenWelcome_label);
        mainScreen_panel.add(mainScreenInstruction_label);
        mainScreen_panel.add(addClientNameMainScreen_button);
        mainScreen_panel.add(clientNameMainScreen_textField);
        mainScreen_panel.add(addDebitCardMainScreen_button);
        mainScreen_panel.add(addCreditCardMainScreen_button);
        mainScreen_panel.add(checkBalanceMainScreen_button);
        mainScreen_panel.add(debitCardInfoMainScreen_button);
        mainScreen_panel.add(creditCardInfoMainScreen_button);
        mainScreen_panel.add(withdrawMainScreen_button);

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
