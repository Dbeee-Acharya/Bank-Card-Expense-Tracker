/*
 * The BankGUI class 
 */

import javax.swing.*; //Importing the java swing components

import java.awt.event.*; //For event handling
import java.awt.color.*; //to set color
import java.awt.Font; // to set font
import java.util.ArrayList; //to use arrayList

  public class BankGUI implements ActionListener {

    //creating a new JFrame instance
    private JFrame mainJFrame,
            checkBalance_frame,
            debitCardInfo_frame,
            creditCardInfo_frame; 
    
    /* Jpanels */
    private JPanel mainScreen_panel,
            addDebitCard_panel,
            addCreditCard_panel,
            withdraw_panel;

    /* The buttons used for Welcome Screen are declared here
     */
    private JButton addClientNameMainScreen_button,
            changeClientNameMainScreen_button,
            addDebitCardMainScreen_button, 
            addCreditCardMainScreen_button,
            checkBalanceMainScreen_button,
            debitCardInfoMainScreen_button,
            creditCardInfoMainScreen_button,
            withdrawMainScreen_button,
            cancelCreditMainScreen_button,

            //add debit card buttons
            addDebitCard_button,
            clearAddDebit_button,
            exitAddDebit_button,

            //add credit card button
            addCreditCard_button,
            clearAddCredit_button,
            exitAddCredit_button,

            //withdraw buttons
            withdraw_button,
            clearWithdraw_button,
            exitWithdraw_button;
            
    /* JLabel used */
    private JLabel mainScreenWelcome_label,
            mainScreenInstruction_label,
            
            //debit card screen labels
            welcomeUserAddDebit_label,
            issuerBankAddDebit_label,
            bankAccountAddDebit_label,
            cardIdAddDebit_label,
            balanceAddDebit_label,
            pinNumberAddDebit_label,

            // Credit Card screen labels
            welcomeUserAddCredit_label,
            issuerBankAddCredit_label,
            bankAccountAddCredit_label,
            cardIdAddCredit_label,
            balanceAddCredit_label,
            cvcNumberAddCredit_label,
            interestAddCredit_label,
            dayAddCredit_label,
            monthAddCredit_label,
            yearAddCredit_label,
            
            // Withdraw Screen Labels
            welcomeUserWithdraw_label,
            balanceWithdraw_label,
            cardIdWithdraw_label,
            withdrawalAmount_label,
            pinNumberWithdraw_label,
            dayWithdraw_label,
            monthWithdraw_label,
            yearWithdraw_label;
            

    /* TextFields used */
    private JTextField clientNameMainScreen_textField,
            
            // debit card screen TextFields
            issuerBankAddDebit_textField,
            bankAccountAddDebit_textField,
            cardIdAddDebit_textField,
            balanceAddDebit_textField,
            pinNumberAddDebit_textFiled,
            
            // credit card screen textFields
            issuerBankAddCredit_textField,
            bankAccountAddCredit_textField,
            cardIdAddCredit_textField,
            balanceAddCredit_textField,
            cvcNumberAddCredit_textFiled,
            interestAddCredit_textField,
            
            //withdraw Screen textfields
            cardIdWithdraw_textField,
            withdrawalAmount_textField,
            pinNumberWithdraw_textField;

    /* ComboBox used */
    private JComboBox<String> dateDayAddDebit_combo,
            dateMonthAddDebit_combo,
            dateYearAddDebit_combo,
            dateDayWithdraw_combo,
            dateMonthWithdraw_combo,
            dateYearWithdraw_combo;

    // Arrays to store date         
    private String[] dateDay = {
      "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", 
      "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", 
      "26", "27", "28", "29", "30", "31"
    };
    private String[] dateMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private String[] dateYear = {"2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"};

    private ArrayList<BankCard> bankCard_ArrayList;

    /* Icons */
    private Icon addUser_icon = new ImageIcon("./icons/addUser.png"); //icon for add user
    private Icon addCard_icon = new ImageIcon("./icons/addCard.png"); //icon for adding debit and credit card
    private Icon checkBalance_icon = new ImageIcon("./icons/checkBalance.png"); //icon for checking balance
    private Icon card_icon = new ImageIcon("./icons/card.png"); //icon for credit and debit card
    private Icon withdraw_icon = new ImageIcon("./icons/withdraw.png"); //icon for withdraw
    private Icon sad_icon = new ImageIcon("./icons/sad.png"); // Icon for sad user
    private Icon clear_icon = new ImageIcon("./icons/clear.png"); // icon for clear info button
    private Icon exit_icon = new ImageIcon("./icons/exit.png"); // exit icon
    private Icon changeClient_icon = new ImageIcon("./icons/changeUser.png"); // change user icon
    private Icon cancelCard_icon = new ImageIcon("./icons/cancelCard.png"); // cancel credit icon
       
    /**
     * ALl the Jframe components are made inside its constructor
     */
    public BankGUI() {
      // Creating an arraylist
      bankCard_ArrayList = new ArrayList<BankCard>();

      mainJFrame = new JFrame("Bank GUI"); //Creating the main JFrame 
      checkBalance_frame = new JFrame("Current Balance"); // Frame for displaying balance information
      debitCardInfo_frame = new JFrame("Debit Card Information"); // frame for displaying the debit card info
      creditCardInfo_frame = new JFrame("Credit Card Information"); // frame for displaying the credit card info

      /* creating Jpanels*/
      mainScreen_panel = new JPanel();
      addDebitCard_panel = new JPanel();
      addCreditCard_panel = new JPanel();
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

      welcomeUserAddCredit_label = new JLabel("Welcome User");
      issuerBankAddCredit_label = new JLabel("Issuer Bank:");
      bankAccountAddCredit_label = new JLabel("Bank Account:");
      cardIdAddCredit_label = new JLabel("Card ID:");
      balanceAddCredit_label = new JLabel("Balance:");
      cvcNumberAddCredit_label = new JLabel("CVC Number:");
      interestAddCredit_label = new JLabel("Interest Rate:");
      dayAddCredit_label = new JLabel("Day:");
      monthAddCredit_label = new JLabel("Month:");
      yearAddCredit_label = new JLabel("Year:");

      welcomeUserWithdraw_label = new JLabel("Welcome User");
      cardIdWithdraw_label = new JLabel("Card ID:");
      balanceWithdraw_label = new JLabel("Balance:");
      withdrawalAmount_label = new JLabel("Withdrawal Amount:");
      pinNumberWithdraw_label = new JLabel("PIN Number:");
      dayWithdraw_label = new JLabel("Day:");
      monthWithdraw_label = new JLabel("Month:");
      yearWithdraw_label = new JLabel("Year:");

      /* setting fonts for JLabel */
      mainScreenWelcome_label.setFont(headerFont);
      mainScreenInstruction_label.setFont(inputLabelFont);
      welcomeUserAddDebit_label.setFont(inputLabelFont);
      issuerBankAddDebit_label.setFont(inputLabelFont);
      bankAccountAddDebit_label.setFont(inputLabelFont);
      cardIdAddDebit_label.setFont(inputLabelFont);
      balanceAddDebit_label.setFont(inputLabelFont);
      pinNumberAddDebit_label.setFont(inputLabelFont);
      welcomeUserAddCredit_label.setFont(headerFont);
      issuerBankAddCredit_label.setFont(inputLabelFont);
      bankAccountAddCredit_label.setFont(inputLabelFont);
      cardIdAddCredit_label.setFont(inputLabelFont);
      balanceAddCredit_label.setFont(inputLabelFont);
      cvcNumberAddCredit_label.setFont(inputLabelFont);
      interestAddCredit_label.setFont(inputLabelFont);
      dayAddCredit_label.setFont(inputLabelFont);
      monthAddCredit_label.setFont(inputLabelFont);
      yearAddCredit_label.setFont(inputLabelFont);
      welcomeUserWithdraw_label.setFont(headerFont);
      cardIdWithdraw_label.setFont(inputLabelFont);
      balanceWithdraw_label.setFont(headerFont);
      pinNumberWithdraw_label.setFont(inputLabelFont);
      withdrawalAmount_label.setFont(inputLabelFont);
      dayWithdraw_label.setFont(inputLabelFont);
      monthWithdraw_label.setFont(inputLabelFont);
      yearWithdraw_label.setFont(inputLabelFont);

      /*JButton Components*/
      addClientNameMainScreen_button = new JButton("Add Client", addUser_icon);
      changeClientNameMainScreen_button = new JButton("Change Client", changeClient_icon);

      addDebitCardMainScreen_button = new JButton("Add Debit Card", addCard_icon);
      addCreditCardMainScreen_button = new JButton("Add Credit Card", addCard_icon);
      checkBalanceMainScreen_button = new JButton("Check Balance", checkBalance_icon);
      debitCardInfoMainScreen_button = new JButton("Debit Card Info", card_icon);
      creditCardInfoMainScreen_button = new JButton("Credit Card Info", card_icon);
      withdrawMainScreen_button = new JButton(" Withdraw", withdraw_icon);
      cancelCreditMainScreen_button = new JButton("Cancel Credit", cancelCard_icon);

      addDebitCard_button = new JButton("Add Card", addCard_icon);
      clearAddDebit_button = new JButton("Clear", clear_icon);
      exitAddDebit_button = new JButton("Exit", exit_icon);

      addCreditCard_button = new JButton("Add Card", addCard_icon);
      clearAddCredit_button= new JButton("Clear", clear_icon);
      exitAddCredit_button = new JButton("Exit", exit_icon);

      withdraw_button = new JButton("Add Card", addCard_icon);
      clearWithdraw_button= new JButton("Clear", clear_icon);
      exitWithdraw_button = new JButton("Exit", exit_icon);

      /* Event Listener for Buttons */
      addClientNameMainScreen_button.addActionListener(this); 
      changeClientNameMainScreen_button.addActionListener(this);

      addDebitCardMainScreen_button.addActionListener(this);
      addCreditCardMainScreen_button.addActionListener(this);
      checkBalanceMainScreen_button.addActionListener(this);
      debitCardInfoMainScreen_button.addActionListener(this);
      creditCardInfoMainScreen_button.addActionListener(this);
      withdrawMainScreen_button.addActionListener(this);
      cancelCreditMainScreen_button.addActionListener(this);
      
      addDebitCard_button.addActionListener(this);
      clearAddDebit_button.addActionListener(this);
      exitAddDebit_button.addActionListener(this);

      addCreditCard_button.addActionListener(this);
      clearAddCredit_button.addActionListener(this);
      exitAddCredit_button.addActionListener(this);

      withdraw_button.addActionListener(this);
      clearWithdraw_button.addActionListener(this);
      exitWithdraw_button.addActionListener(this);

      /* JTextFeild Components */
      clientNameMainScreen_textField = new JTextField();
      
      issuerBankAddDebit_textField = new JTextField();
      bankAccountAddDebit_textField = new JTextField();
      cardIdAddDebit_textField = new JTextField();
      balanceAddDebit_textField = new JTextField();
      pinNumberAddDebit_textFiled = new JTextField();

      issuerBankAddCredit_textField = new JTextField();
      bankAccountAddCredit_textField = new JTextField();
      cardIdAddCredit_textField = new JTextField();
      balanceAddCredit_textField = new JTextField();
      cvcNumberAddCredit_textFiled = new JTextField();
      interestAddCredit_textField = new JTextField();

      cardIdWithdraw_textField = new JTextField();
      withdrawalAmount_textField = new JTextField();
      pinNumberWithdraw_textField = new JTextField();

      /* JcomboBox components */
      dateDayAddDebit_combo = new JComboBox<String>(dateDay);
      dateMonthAddDebit_combo = new JComboBox<String>(dateMonth);
      dateYearAddDebit_combo = new JComboBox<String>(dateYear);

      dateDayWithdraw_combo = new JComboBox<String>(dateDay);
      dateMonthWithdraw_combo = new JComboBox<String>(dateMonth);
      dateYearWithdraw_combo = new JComboBox<String>(dateYear);

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

      welcomeUserAddCredit_label.setBounds(100, 100, 500, 35);
      issuerBankAddCredit_label.setBounds(118, 175, 120, 25);
      bankAccountAddCredit_label.setBounds(118, 255, 120, 25);
      cardIdAddCredit_label.setBounds(118, 335, 120, 25);
      balanceAddCredit_label.setBounds(118, 415, 120, 25);
      cvcNumberAddCredit_label.setBounds(118, 495, 120, 25);
      interestAddCredit_label.setBounds(450, 175, 113, 25);
      withdrawalAmount_label.setBounds(118, 302, 242, 35);
      dayAddCredit_label.setBounds(442, 280, 42, 25);
      monthAddCredit_label.setBounds(424, 326, 60, 25);
      yearAddCredit_label.setBounds(438, 372, 46, 25);

      welcomeUserWithdraw_label.setBounds(100, 100, 392, 35);
      balanceWithdraw_label.setBounds(100, 135, 392, 35);
      cardIdWithdraw_label.setBounds(118, 200, 72, 25);
      pinNumberWithdraw_label.setBounds(118, 355, 104, 25);
      withdrawalAmount_label.setBounds(118, 277, 160, 25);
      dayWithdraw_label.setBounds(438, 225, 42, 25);
      monthWithdraw_label.setBounds(420, 271, 60, 25);
      yearWithdraw_label.setBounds(434, 317, 46, 25);

      // TextField
      clientNameMainScreen_textField.setBounds(250, 250, 242, 34);

      issuerBankAddDebit_textField.setBounds(118, 200, 242, 35);
      bankAccountAddDebit_textField.setBounds(118, 280, 242, 35);
      cardIdAddDebit_textField.setBounds(118, 360, 242, 35);
      balanceAddDebit_textField.setBounds(118, 440, 242, 35);
      pinNumberAddDebit_textFiled.setBounds(118, 520, 242, 35);

      issuerBankAddCredit_textField.setBounds(118, 200, 242, 35);
      bankAccountAddCredit_textField.setBounds(118, 280, 242, 35);
      cardIdAddCredit_textField.setBounds(118, 360, 242, 35);
      balanceAddCredit_textField.setBounds(118, 440, 242, 35);
      cvcNumberAddCredit_textFiled.setBounds(118, 520, 242, 35);
      interestAddCredit_textField.setBounds(450, 200, 145, 35);

      cardIdWithdraw_textField.setBounds(118, 225, 242, 35);
      withdrawalAmount_textField.setBounds(118, 302, 242, 35);
      pinNumberWithdraw_textField.setBounds(118, 380, 242, 35);
      
      // Button
      addClientNameMainScreen_button.setBounds(250, 300, 202, 40);
      changeClientNameMainScreen_button.setBounds(250, 300, 202, 40);
      addDebitCardMainScreen_button.setBounds(790, 103, 202, 40);
      addCreditCardMainScreen_button.setBounds(790, 174, 202, 40);
      checkBalanceMainScreen_button.setBounds(790, 245, 202, 40);
      debitCardInfoMainScreen_button.setBounds(790, 316, 202, 40);
      creditCardInfoMainScreen_button.setBounds(790, 387, 202, 40);
      withdrawMainScreen_button.setBounds(790, 458, 202, 40);
      cancelCreditMainScreen_button.setBounds(790, 529, 202, 40);

      addDebitCard_button.setBounds(794, 255, 202, 40);
      clearAddDebit_button.setBounds(794, 316, 202, 40);
      exitAddDebit_button.setBounds(794, 377, 202, 40);

      addCreditCard_button.setBounds(794, 255, 202, 40);
      clearAddCredit_button.setBounds(794, 316, 202, 40);
      exitAddCredit_button.setBounds(794, 377, 202, 40);

      withdraw_button.setBounds(794, 255, 202, 40);
      clearWithdraw_button.setBounds(794, 316, 202, 40);
      exitWithdraw_button.setBounds(794, 377, 202, 40);

      // Combobox
      dateDayAddDebit_combo.setBounds(490, 280, 105, 34);
      dateMonthAddDebit_combo.setBounds(490, 326, 105, 34);
      dateYearAddDebit_combo.setBounds(490, 372, 105, 34);

      dateDayWithdraw_combo.setBounds(486, 225, 105, 35);
      dateMonthWithdraw_combo.setBounds(486, 271, 105, 35);
      dateYearWithdraw_combo.setBounds(486, 317, 105, 35);

      // Setting visibility of buttons/components false by default
      changeClientNameMainScreen_button.setVisible(false);

      /* Add components to JPanel */
      mainScreen_panel.add(mainScreenWelcome_label);
      mainScreen_panel.add(mainScreenInstruction_label);
      mainScreen_panel.add(addClientNameMainScreen_button);
      mainScreen_panel.add(changeClientNameMainScreen_button);
      mainScreen_panel.add(clientNameMainScreen_textField);
      mainScreen_panel.add(addDebitCardMainScreen_button);
      mainScreen_panel.add(addCreditCardMainScreen_button);
      mainScreen_panel.add(checkBalanceMainScreen_button);
      mainScreen_panel.add(debitCardInfoMainScreen_button);
      mainScreen_panel.add(creditCardInfoMainScreen_button);
      mainScreen_panel.add(withdrawMainScreen_button);
      mainScreen_panel.add(cancelCreditMainScreen_button);

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
      addDebitCard_panel.add(clearAddDebit_button);
      addDebitCard_panel.add(exitAddDebit_button);

      addCreditCard_panel.add(addCreditCard_button);
      addCreditCard_panel.add(clearAddCredit_button);
      addCreditCard_panel.add(exitAddCredit_button);
      addCreditCard_panel.add(welcomeUserAddCredit_label);
      addCreditCard_panel.add(issuerBankAddCredit_label);
      addCreditCard_panel.add(bankAccountAddCredit_label);
      addCreditCard_panel.add(cardIdAddCredit_label);
      addCreditCard_panel.add(balanceAddCredit_label);
      addCreditCard_panel.add(cvcNumberAddCredit_label);
      addCreditCard_panel.add(interestAddCredit_label);
      addCreditCard_panel.add(dayAddCredit_label);
      addCreditCard_panel.add(monthAddCredit_label);
      addCreditCard_panel.add(yearAddCredit_label);
      addCreditCard_panel.add(issuerBankAddCredit_textField);
      addCreditCard_panel.add(bankAccountAddCredit_textField);
      addCreditCard_panel.add(cardIdAddCredit_textField);
      addCreditCard_panel.add(balanceAddCredit_textField);
      addCreditCard_panel.add(cvcNumberAddCredit_textFiled);
      addCreditCard_panel.add(interestAddCredit_textField);
      addCreditCard_panel.add(dateDayAddDebit_combo);
      addCreditCard_panel.add(dateMonthAddDebit_combo);
      addCreditCard_panel.add(dateYearAddDebit_combo);

      withdraw_panel.add(welcomeUserWithdraw_label);
      withdraw_panel.add(balanceWithdraw_label);
      withdraw_panel.add(cardIdWithdraw_label);
      withdraw_panel.add(withdrawalAmount_label);
      withdraw_panel.add(pinNumberWithdraw_label);
      withdraw_panel.add(dayWithdraw_label);
      withdraw_panel.add(monthWithdraw_label);
      withdraw_panel.add(yearWithdraw_label);
      withdraw_panel.add(cardIdWithdraw_textField);
      withdraw_panel.add(withdrawalAmount_textField);
      withdraw_panel.add(pinNumberWithdraw_textField);
      withdraw_panel.add(withdraw_button);
      withdraw_panel.add(clearWithdraw_button);
      withdraw_panel.add(exitWithdraw_button);
      withdraw_panel.add(dateDayWithdraw_combo);
      withdraw_panel.add(dateMonthWithdraw_combo);
      withdraw_panel.add(dateYearWithdraw_combo);

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

      // Withdraw Panel
      withdraw_panel.setLayout(null);
      withdraw_panel.setSize(1200, 672);
      withdraw_panel.setVisible(false);

      /* Add JPanel to JFrame */
      mainJFrame.add(mainScreen_panel);
      mainJFrame.add(addDebitCard_panel);
      mainJFrame.add(addCreditCard_panel);
      mainJFrame.add(withdraw_panel);

      // JFrame methods        
      mainJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // making sure the JFrame is fully closed instead of just being not visible   
      mainJFrame.setLayout(null); //removing the default layout 
      mainJFrame.setSize(1200, 672); //setting the width and height of the JFrame
      mainJFrame.setLocationRelativeTo(null); // to make sure the frame appears from the middle  
      mainJFrame.setResizable(false);  
      mainJFrame.setVisible(true); //setting the visibility of mainFrame

      debitCardInfo_frame.setLayout(null); //removing the default layout 
      debitCardInfo_frame.setSize(1200, 672); //setting the width and height of the JFrame
      debitCardInfo_frame.setLocationRelativeTo(null); // to make sure the frame appears from the middle    
      debitCardInfo_frame.setVisible(false); //setting the visibility of mainFrame

      creditCardInfo_frame.setLayout(null); //removing the default layout 
      creditCardInfo_frame.setSize(1200, 672); //setting the width and height of the JFrame
      creditCardInfo_frame.setLocationRelativeTo(null); // to make sure the frame appears from the middle    
      creditCardInfo_frame.setVisible(false); //setting the visibility of mainFrame

      checkBalance_frame.setLayout(null); //removing the default layout 
      checkBalance_frame.setSize(390, 220); //setting the width and height of the JFrame
      checkBalance_frame.setLocationRelativeTo(null); // to make sure the frame appears from the middle    
      checkBalance_frame.setVisible(false); //setting the visibility of mainFrame
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      String clientName = clientNameMainScreen_textField.getText(); //setting the client name for instance variable
      BankCard bankCard_obj;

      if(e.getSource() == addClientNameMainScreen_button) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        } else {
          mainScreenWelcome_label.setText("Welcome " + clientName + ","); //Change client name of welcome screen
          welcomeUserAddDebit_label.setText("User: " + clientName); //Change client name of Debit Card Screen
          welcomeUserAddCredit_label.setText("User: " + clientName); //Change client name of Credit card screen
          addClientNameMainScreen_button.setVisible(false);
          mainScreenInstruction_label.setVisible(false);
          clientNameMainScreen_textField.setVisible(false);
          changeClientNameMainScreen_button.setVisible(true);
        }

      } else if(e.getSource()== changeClientNameMainScreen_button) {
        mainScreenWelcome_label.setText("Welcome User,");
        addClientNameMainScreen_button.setVisible(true);
        mainScreenInstruction_label.setVisible(true);
        clientNameMainScreen_textField.setVisible(true);
        changeClientNameMainScreen_button.setVisible(false);
        clientNameMainScreen_textField.setText("");
        clientName = "";

      } else if(e.getSource() == addDebitCardMainScreen_button ) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        } else {
          mainScreen_panel.setVisible(false);
          addDebitCard_panel.setVisible(true);
        }

      } else if (e.getSource() == addCreditCardMainScreen_button) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        } else {
          mainScreen_panel.setVisible(false);
          addCreditCard_panel.setVisible(true);
        }

      } else if (e.getSource() == checkBalanceMainScreen_button) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        } else {
          checkBalance_frame.setVisible(true);
        }

      } else if (e.getSource() == debitCardInfoMainScreen_button) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        } else {
          debitCardInfo_frame.setVisible(true);
        }

      } else if (e.getSource() == creditCardInfoMainScreen_button) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        } else {
          creditCardInfo_frame.setVisible(true);
        }

      } else if (e.getSource() == withdrawMainScreen_button) {
        if(clientName.isEmpty()) {
          JOptionPane.showMessageDialog(mainJFrame, "Client Name Cannot be Empty", "Alert", JOptionPane.ERROR_MESSAGE, sad_icon);
        } else {
          mainScreen_panel.setVisible(false);
          withdraw_panel.setVisible(true);
        }

      } else if(e.getSource() == exitAddDebit_button) {
        addDebitCard_panel.setVisible(false);
        mainScreen_panel.setVisible(true);

      } else if(e.getSource() == clearAddDebit_button) {
        issuerBankAddDebit_textField.setText("");
        bankAccountAddDebit_textField.setText("");
        cardIdAddDebit_textField.setText("");
        balanceAddDebit_textField.setText("");
        pinNumberAddDebit_textFiled.setText("");

      } else if(e.getSource() == exitAddCredit_button) {
        addCreditCard_panel.setVisible(false);
        mainScreen_panel.setVisible(true);

      } else if(e.getSource() == clearAddCredit_button) {
        issuerBankAddDebit_textField.setText("");
        bankAccountAddDebit_textField.setText("");
        cardIdAddDebit_textField.setText("");
        balanceAddDebit_textField.setText("");
        cvcNumberAddCredit_textFiled.setText("");
        interestAddCredit_textField.setText("");

      } else if(e.getSource() == exitWithdraw_button) {
        withdraw_panel.setVisible(false);
        mainScreen_panel.setVisible(true);

      } else if(e.getSource() == clearWithdraw_button) {
        cardIdWithdraw_textField.setText("");
        withdrawalAmount_textField.setText("");
        pinNumberWithdraw_textField.setText("");

      } else if(e.getSource() == addDebitCard_button) {
        if(e.getSource() == addDebitCard_button) {
          try {
            // getting the required items from the gui

            String issuerBank = issuerBankAddDebit_textField.getText();
            String bankAccount = bankAccountAddDebit_textField.getText();
            String dateDay = dateDayAddDebit_combo.getSelectedItem().toString();
            String dateMonth = dateMonthAddDebit_combo.getSelectedItem().toString();
            String dateYear = dateYearAddDebit_combo.getSelectedItem().toString();
            String date = dateDay + "/" + dateMonth + "/" + dateYear; // Converting the date into a string
            int cardId = Integer.parseInt(cardIdAddDebit_textField.getText());
            int balanceAmount = Integer.parseInt(balanceAddDebit_textField.getText());
            int pinNumber = Integer.parseInt(pinNumberAddDebit_textFiled.getText());

            if(issuerBank.isEmpty() || clientName.isEmpty() || bankAccount.isEmpty()) {
              JOptionPane.showMessageDialog(mainJFrame, "Empty Field Detected", "Error", JOptionPane.ERROR_MESSAGE, sad_icon);

            } else {
              // code to execute for add debit
              // bankCard_obj = new BankCard(issuerBank, bankAccount, cardId, balanceAmount);
              // DebitCard debitCard_obj = (DebitCard) bankCard_obj;
              // debitCard_obj = new DebitCard(clientName, issuerBank, bankAccount, cardId, balanceAmount, pinNumber);

              bankCard_ArrayList.add(debitCard_obj);
            }

            } catch(NumberFormatException numFormat_ex) {
              JOptionPane.showMessageDialog(mainJFrame, "Card ID, Balance Amount or Pin Number Invalid", "Error", JOptionPane.ERROR_MESSAGE, sad_icon);
            } 
          }

      } else if(e.getSource() == addCreditCard_button) {
        // code for add credit card
      }

    }

    public static void main (String[] Args) {
      new BankGUI();
    }
}
