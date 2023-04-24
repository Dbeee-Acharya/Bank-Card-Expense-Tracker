/**
 * This is the credit card class which is the child class of BankCard
 * The client can request credit, and is granted the amound if all the
 * eligibility criteria is met. S/he can also cancel their credit card
 * if required 
 * 
 * @author Dibbeshwor Acharya
 */

//creating the CreditCard class with the 'extends' keyword
public class CreditCard extends BankCard {
    
    //declaring the required attributes
    private int cvcNumber;
    //credit limit is set as double because of the mulitiplication by 2.5 while cheking the condition
    private double creditLimit; //to store and check the credit limit given by the user
    private double interestRate; //the intrest at which money needs to be paid back
    private String expirationDate; //expiration date of the credit card
    private int gracePeriod; //number of days the user has to pay his/her dues
    private boolean isGranted; //to check if credit has been granted
    
    //creating the constructor with the required parameters
    public CreditCard(String clientName, String issuerBank, String bankAccount, int cardID, int balance, int cvcNumber, double interestRate, String expirationDate) {
       super(issuerBank, bankAccount, cardID, balance); //calling the parent class constructor 
       super.set_clientName(clientName); //calling the parent class client name setter method
       this.cvcNumber = cvcNumber;
       this.interestRate = interestRate;
       this.expirationDate = expirationDate;
       this.isGranted = false; //assigning the value of is Granted false as default
    }
    
    /*creating accessor methods for all the attributes 
     * accessor methods return the value of private attributes
     */
    public int get_cvcNumber() {
        return this.cvcNumber;
    }
    
    public double get_creditLimit() {
        return this.creditLimit;
    }
    
    public double get_interestRate() {
        return this.interestRate;
    }
    
    public String get_expirationDate() {
        return this.expirationDate;
    }
    
    public int get_gracePeriod() {
        return this.gracePeriod;
    }
    
    public boolean get_isGranted() {
        return this.isGranted;
    }
    
    /* method to set the credit limit 
     * It accepts two parameters and checks 
     * if the client is eligible for credit 
     */
    public void setCreditLimit(double creditLimit, int gracePeriod) {
        //calling the balance getter method from the parent class to check against credit limit
        if(creditLimit <= (2.5 * get_balance())) { 
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
            System.out.println("Credit Limit set to: Nrs." + this.creditLimit);
        } else {
            System.out.print("Credit limit set too high, please try again");
        }
    }
    
    /*method to cancel credit card 
     * It resets the value of four attributes
     */
    public void cancelCreditCard() {
        cvcNumber = 0;
        creditLimit = 0;
        gracePeriod = 0;
        isGranted = false;
        System.out.println("Credit Card cancelled");
    }
    
    
    //method overriding the display method to display the required information
    @Override
    public void display() {
        super.display();
        
        //checking if credit has been granted
        if(isGranted) { 
            System.out.println("CVC Number: " + cvcNumber);
            System.out.println("Intrest Rate: " + interestRate + "%");
            System.out.println("Expiration Date: " + expirationDate);
            System.out.println("Credit Limit: Rs." + creditLimit);
            System.out.println("Grace Period: " + gracePeriod + " days");
        //to display if credit has not been granted    
        } else { 
            System.out.println("CVC Number: " + cvcNumber);
            System.out.println("Intrest Rate: " + interestRate + "%");
            System.out.println("Expiration Date: " + expirationDate);
        }
    }
}