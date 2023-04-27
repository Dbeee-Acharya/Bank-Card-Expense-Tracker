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
            mainScreenInstruction_label,
            
            //debit card screen labels
            welcomeUserAddDebit_label,
            issuerBankAddDebit_label,
            bankAccountAddDebit_label,
            cardIdAddDebit_label,
            balanceAddDebit_label,
            pinNumberAddDebit_label;

    /* TextFields used */
    private JTextField clientNameMainScreen_textField,
            
            // debit card screen TextFields
            issuerBankAddDebit_textField,
            bankAccountAddDebit_textField,
            cardIdAddDebit_textField,
            balanceAddDebit_textField,
            pinNumberAddDebit_textFiled;

    /* Icons */
    private Icon addUser_icon = new ImageIcon("./icons/addUser.png"); //icon for add user
    private Icon addCard_icon = new ImageIcon("./icons/addCard.png"); //icon for adding debit and credit card
    private Icon checkBalance_icon = new ImageIcon("./icons/checkBalance.png"); //icon for checking balance
    private Icon card_icon = new ImageIcon("./icons/card.png"); //icon for credit and debit card
    private Icon withdraw_icon = new ImageIcon("./icons/withdraw.png"); //icon for withdraw
    private Icon sad_icon = new ImageIcon("./icons/sad.png"); // Icon for sad user
    private Icon clear_icon = new ImageIcon("./icons/clear.png"); // icon for clear info button
    private Icon exit_icon = new ImageIcon("./icons/exit.png"); // exit icon
       
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
        
        welcomeUserAddDebit_label = new JLabel("Welcome User");
        issuerBankAddDebit_label = new JLabel("Issuer Bank:");
        bankAccountAddDebit_label = new JLabel("Bank Account:");
        cardIdAddDebit_label = new JLabel("Card ID:");
        balanceAddDebit_label = new JLabel("Balance:");
        pinNumberAddDebit_label = new JLabel("PIN Number:");

        /* setting fonts for JLabel */
        mainScreenWelcome_label.setFont(headerFont);
        mainScreenInstruction_label.setFont(inputLabelFont);
        welcomeUserAddDebit_label.setFont(inputLabelFont);
        issuerBankAddDebit_label.setFont(inputLabelFont);
        bankAccountAddDebit_label.setFont(inputLabelFont);
        cardIdAddDebit_label.setFont(inputLabelFont);
        balanceAddDebit_label.setFont(inputLabelFont);
        pinNumberAddDebit_label.setFont(inputLabelFont);

        /*JButton Components*/
        addClientNameMainScreen_button = new JButton("Add Client", addUser_icon);

        addDebitCardMainScreen_button = new JButton("Add Debit Card", addCard_icon);
        addCreditCardMainScreen_button = new JButton("Add Credit Card", addCard_icon);
        checkBalanceMainScreen_button = new JButton("Check Balance", checkBalance_icon);
        debitCardInfoMainScreen_button = new JButton("Debit Card Info", card_icon);
        creditCardInfoMainScreen_button = new JButton("Credit Card Info", card_icon);
        withdrawMainScreen_button = new JButton("Withdraw", withdraw_icon);

        addDebitCard_button = new JButton("Add Card", addCard_icon);
        clearDebitCard_button = new JButton("Clear", clear_icon);
        exitDebitCard_button = new JButton("Exit", exit_icon);

        /* Event Listener for Buttons */
        addClientNameMainScreen_button.addActionListener(this); 

        addDebitCardMainScreen_button.addActionListener(this);
        addCreditCardMainScreen_button.addActionListener(this);
        checkBalanceMainScreen_button.addActionListener(this);
        debitCardInfoMainScreen_button.addActionListener(this);
        creditCardInfoMainScreen_button.addActionListener(this);
        withdrawMainScreen_button.addActionListener(this);
        
        addDebitCard_button.addActionListener(this);
        clearDebitCard_button.addActionListener(this);
        exitDebitCard_button.addActionListener(this);

        /* JTextFeild Components */
        clientNameMainScreen_textField = new JTextField();
        
        issuerBankAddDebit_textField = new JTextField();
        bankAccountAddDebit_textField = new JTextField();
        cardIdAddDebit_textField = new JTextField();
        balanceAddDebit_textField = new JTextField();
        pinNumberAddDebit_textFiled = new JTextField();

        /*setBounds for components*/

        // JLabel
        mainScreenWelcome_label.setBounds(250, 169, 490, 35);
        mainScreenInstruction_label.setBounds(250, 208, 337, 25);

        welcomeUserAddDebit_label.setBounds(100, 100, 500, 35);
        issuerBankAddDebit_label.setBounds(118, 175, 120, 25);
        bankAccountAddDebit_label.setBounds(118, 255, 120, 25);
        cardIdAddDebit_label.setBounds(118, 335, 120, 25);
        balanceAddDebit_label.setBounds(118, 415, 120, 25);
        pinNumberAddDebit_label.setBounds(118, 495, 120, 25);

        // TextField
        clientNameMainScreen_textField.setBounds(250, 250, 242, 34);

        issuerBankAddDebit_textField.setBounds(118, 200, 242, 35);
        bankAccountAddDebit_textField.setBounds(118, 280, 242, 35);
        cardIdAddDebit_textField.setBounds(118, 360, 242, 35);
        balanceAddDebit_textField.setBounds(118, 440, 242, 35);
        pinNumberAddDebit_textFiled.setBounds(118, 520, 242, 35);
        
        // Button
        addClientNameMainScreen_button.setBounds(250, 300, 202, 40);
        addDebitCardMainScreen_button.setBounds(794, 139, 202, 40);
        addCreditCardMainScreen_button.setBounds(794, 210, 202, 40);
        checkBalanceMainScreen_button.setBounds(794, 281, 202, 40);
        debitCardInfoMainScreen_button.setBounds(794, 352, 202, 40);
        creditCardInfoMainScreen_button.setBounds(794, 423, 202, 40);
        withdrawMainScreen_button.setBounds(794, 494, 202, 40);

        addDebitCard_button.setBounds(794, 255, 202, 40);
        clearDebitCard_button.setBounds(794, 316, 202, 40);
        exitDebitCard_button.setBounds(794, 377, 202, 40);


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

        addDebitCard_panel.add(welcomeUserAddDebit_label);
        addDebitCard_panel.add(issuerBankAddDebit_label);
        addDebitCard_panel.add(bankAccountAddDebit_label);
        addDebitCard_panel.add(cardIdAddDebit_label);
        addDebitCard_panel.add(balanceAddDebit_label);
        addDebitCard_panel.add(pinNumberAddDebit_label);
        addDebitCard_panel.add(issuerBankAddDebit_textField);
        addDebitCard_panel.add(bankAccountAddDebit_textField);
        addDebitCard_panel.add(cardIdAddDebit_textField);
        addDebitCard_panel.add(balanceAddDebit_textField);
        addDebitCard_panel.add(pinNumberAddDebit_textFiled);
        addDebitCard_panel.add(addDebitCard_button);
        addDebitCard_panel.add(clearDebitCard_button);
        addDebitCard_panel.add(exitDebitCard_button);

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
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        }

        mainScreen_panel.setVisible(false);
        addDebitCard_panel.setVisible(true);
      }

      if (e.getSource() == addCreditCardMainScreen_button) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        }

        mainScreen_panel.setVisible(false);
        addCreditCard_panel.setVisible(true);
      }

      if (e.getSource() == checkBalanceMainScreen_button) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        }

        mainScreen_panel.setVisible(false);
        checkBalance_panel.setVisible(true);
      }

      if (e.getSource() == debitCardInfoMainScreen_button) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        }

        mainScreen_panel.setVisible(false);
        debitCardInfo_panel.setVisible(true);
      }

      if (e.getSource() == creditCardInfoMainScreen_button) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        }

        mainScreen_panel.setVisible(false);
        creditCardInfo_panel.setVisible(true);
      }

      if (e.getSource() == withdrawMainScreen_button) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        }

        mainScreen_panel.setVisible(false);
        withdraw_panel.setVisible(true);
      }
    }

    public static void main (String[] Args) {
      new BankGUI();
    }
}
