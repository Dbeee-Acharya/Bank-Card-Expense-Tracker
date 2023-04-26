/**
 * This is the main Parent class.
 * 
 * @author Dibbeshwor Acharya
 */

//Creating the BankCard Class
public class BankCard {
    
    //declaring the required attributes
    private String clientName; //This stores the client name
    private String issuerBank; //stores the issuer bank name
    private String bankAccount; //stores the bank account
    private int cardID; //stores the card number
    private int balance; //stores the balance 
    
    //creating the constructor with the given parameters 
    public BankCard(String issuerBank, String bankAccount, int cardID, int balance) {
       this.clientName = ""; //client name is assigned as an empty string
       
       //initializing the values of the instance variable
       this.issuerBank = issuerBank; 
       this.bankAccount = bankAccount;
       this.cardID = cardID;
       this.balance = balance;
    }
    
    /*creating accessor methods for each of our attributes
     * this returns the value of private attributes
     */
    public String get_clientName() {
        return this.clientName;
    }
    
     public String get_issuerBank() {
        return this.issuerBank;
    }
    
    public String get_bankAccount() {
        return this.bankAccount;
    }
    
    public int get_cardID() {
        return this.cardID;
    }
    
    public int get_balance() {
        return this.balance;
    }
    
    //creating setter methods for client name and balance amount
    public void set_clientName(String clientName){
        this.clientName = clientName;
    }
    
    public void set_balance(int balance) {
        this.balance = balance;
    }
    
    //display method to check if client name is empty and to print the required output
    public void display() {
        
        //checking if the client name is empty
        if(clientName.equals("")) { 
            System.out.println("Client name not found!");
        } else {
            //Displaying the required output
            System.out.println("Client Name: " + clientName);
            System.out.println("Issuer Bank: " + issuerBank);
            System.out.println("Bank Account: " + bankAccount);
            System.out.println("Card ID: " + cardID);
            System.out.println("Balance Amount: Npr." + balance);
        }
    }
}
