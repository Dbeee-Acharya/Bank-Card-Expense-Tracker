/**
 * The BankGUI class 
 */

import javax.swing.*; //Importing the java swing components
import java.awt.event.*; //For event handling
import java.awt.color.*; //to set color
import java.awt.Font; // to set font
import java.util.ArrayList; //to use arrayList

  public class BankGUI implements ActionListener{
    
    private JFrame mainJFrame; //creating a new JFrame instance
    
    /* Jpanels */
    private JPanel mainScreen_panel,
            addDebitCard_panel,
            addCreditCard_panel,
            checkBalance_panel,
            debitCardInfo_panel,
            creditCardInfo_panel,
            withdraw_panel;

    /* The buttons used for Welcome Screen are declared here
     */
    private JButton addClientNameMainScreen_button,
            addDebitCardMainScreen_button, 
            addCreditCardMainScreen_button,
            checkBalanceMainScreen_button,
            debitCardInfoMainScreen_button,
            creditCardInfoMainScreen_button,
            withdrawMainScreen_button,

            //add debit card buttons
            addDebitCard_button,
            clearDebitCard_button,
            exitDebitCard_button;
      

    /* JLabel used */
    private JLabel mainScreenWelcome_label,
            mainScreenWelcome_label_after,
            mainScreenInstruction_label;

    /* TextFields used */
    private JTextField clientNameMainScreen_textField;

    /* Icons */
    private Icon addUser_icon = new ImageIcon("./icons/addUser.png"); //icon for add user
    private Icon addCard_icon = new ImageIcon("./icons/addCard.png"); //icon for adding debit and credit card
    private Icon checkBalance_icon = new ImageIcon("./icons/checkBalance.png"); //icon for checking balance
    private Icon card_icon = new ImageIcon("./icons/card.png"); //icon for credit and debit card
    private Icon withdraw_icon = new ImageIcon("./icons/withdraw.png"); //icon for withdraw
    private Icon sad_icon = new ImageIcon("./icons/sad.png"); // Icon for sad user
       
    /**
     * ALl the Jframe components are made inside its constructor
     */
    private BankGUI() {
        mainJFrame = new JFrame("Bank GUI"); //Creating the main JFrame 

        /* creating Jpanels*/
        mainScreen_panel = new JPanel();
        addDebitCard_panel = new JPanel();
        addCreditCard_panel = new JPanel();
        checkBalance_panel = new JPanel();
        debitCardInfo_panel = new JPanel();
        creditCardInfo_panel = new JPanel();
        withdraw_panel = new JPanel();

        /* Initializing different fonts */
        Font headerFont = new Font(Font.DIALOG, Font.PLAIN, 24);
        Font inputLabelFont = new Font(Font.DIALOG, Font.PLAIN, 18);

        /* JLabel components */
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

        /* Event Listener for Buttons */
        addClientNameMainScreen_button.addActionListener(this); 

        addDebitCardMainScreen_button.addActionListener(this);
        addCreditCardMainScreen_button.addActionListener(this);
        checkBalanceMainScreen_button.addActionListener(this);
        debitCardInfoMainScreen_button.addActionListener(this);
        creditCardInfoMainScreen_button.addActionListener(this);
        withdrawMainScreen_button.addActionListener(this);

        /* JTextFeild Components */
        clientNameMainScreen_textField = new JTextField();

        /*setBounds for components*/
        mainScreenWelcome_label.setBounds(250, 169, 490, 35);
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
        mainScreen_panel.setVisible(true);

        // Debit Card Panel
        addDebitCard_panel.setLayout(null);
        addDebitCard_panel.setSize(1200, 672);
        addDebitCard_panel.setVisible(false);

        // Credit Card Panel
        addCreditCard_panel.setLayout(null);
        addCreditCard_panel.setSize(1200, 672);
        addCreditCard_panel.setVisible(false);

        // Show Balance Panel
        checkBalance_panel.setLayout(null);
        checkBalance_panel.setSize(1200, 672);
        checkBalance_panel.setVisible(false);

        // Debit Card info panel
        debitCardInfo_panel.setLayout(null);
        debitCardInfo_panel.setSize(1200, 672);
        debitCardInfo_panel.setVisible(false);

        // Credit Card Info Panel
        creditCardInfo_panel.setLayout(null);
        creditCardInfo_panel.setSize(1200, 672);
        creditCardInfo_panel.setVisible(false);

        // Withdraw Panel
        withdraw_panel.setLayout(null);
        withdraw_panel.setSize(1200, 672);
        withdraw_panel.setVisible(false);

        /* Add JPanel to JFrame */
        mainJFrame.add(mainScreen_panel);
        mainJFrame.add(addDebitCard_panel);
        mainJFrame.add(addCreditCard_panel);

        
        mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        mainJFrame.setLayout(null); //removing the default layout 
        mainJFrame.setSize(1200, 672); //setting the width and height of the JFrame
        mainJFrame.setVisible(true); //setting the visibility of mainFrame

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String clientName = clientNameMainScreen_textField.getText();

      if (e.getSource() == addClientNameMainScreen_button) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        }

        mainScreenWelcome_label.setText("Welcome " + clientName + ",");
      }

      if (e.getSource() == addDebitCardMainScreen_button ) {
        mainScreen_panel.setVisible(false);
        addDebitCard_panel.setVisible(true);
      }

      if (e.getSource() == addCreditCardMainScreen_button) {
        mainScreen_panel.setVisible(false);
        addCreditCard_panel.setVisible(true);
      }

      if (e.getSource() == checkBalanceMainScreen_button) {
        mainScreen_panel.setVisible(false);
        checkBalance_panel.setVisible(true);
      }

      if (e.getSource() == debitCardInfoMainScreen_button) {
        mainScreen_panel.setVisible(false);
        debitCardInfo_panel.setVisible(true);
      }

      if (e.getSource() == creditCardInfoMainScreen_button) {
        mainScreen_panel.setVisible(false);
        creditCardInfo_panel.setVisible(true);
      }

      if (e.getSource() == withdrawMainScreen_button) {
        mainScreen_panel.setVisible(false);
        withdraw_panel.setVisible(true);
      }
    }

    public static void main (String[] Args) {
      new BankGUI();
    }
}
