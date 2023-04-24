 /**
  * This is the debit card class and also the child class of bank card
  * The client can withdraw money from there account. The money is withdrawn 
  * only if the required critera is fullfilled. The withdrawl amount is then 
  * deducted from the clients balance
  * 
  * @author Dibbeshwor Acharya
  */
 

//creating the DebitCard class with 'extends' keyword
public class DebitCard extends BankCard {
    
    //declaring the required attributes with private access modifier
    private int pinNumber; //the pin number required to complete the withdrawal process
    private int withdrawalAmount; //the amount of money to be withdrawn
    private String dateOfWithdrawal; //date at which money is being withdrawn
    private boolean hasWithdrawn; //to check if withdrawal process has completed successfully or not
    
    //constructor with the required parameters 
    public DebitCard(String clientName, String issuerBank,String bankAccount, int cardID, int balance, int pinNumber) {
        super(issuerBank, bankAccount, cardID, balance);//the super keyword calls the constructor from the parent class
        set_clientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }
    
    /*creating the required accessor methods for all the attributes
     * this returns the value of private attributes 
     */
    public int get_pinNumber() {
        return this.pinNumber;
    }
    
    public int get_withdrawalAmount() {
        return this.withdrawalAmount;
    }
    
    public String get_dateOfWithdrawal() {
        return this.dateOfWithdrawal;
    }
    
    public boolean get_hasWithdrawn() {
        return this.hasWithdrawn;
    }
    
    //creatig a mutator(setter) method for withdrawalAmount
    public void set_withdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }
    
    /*creating the withdraw method that conducts the withdraw process
     * This method accepts three parameters and checks two of them against the instance variable
     */
    public void withdraw(int pinNumber, int withdrawalAmount, String dateOfWithdrawal){ 
        if(pinNumber == this.pinNumber && withdrawalAmount <= get_balance()){ //checking if the pin is correct and if the balance is sufficient
            this.withdrawalAmount = withdrawalAmount; //setting the withdrawal amount of the main class
            this.dateOfWithdrawal = dateOfWithdrawal; //Setting the date of withdrawl
            hasWithdrawn = true; //to denote that the withdrawal process has completed successfully
            set_balance(get_balance() - withdrawalAmount); //setting the new balance by deducting the amount that has been withdrawn 
            System.out.println( "Nrs." + withdrawalAmount + " has been successfully withdrawn from your account");
            
        } else if(pinNumber != this.pinNumber) { 
            System.out.println("Pin Incorrect!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    
    //method overriding the display method
    @Override
    public void display(){
        
        //Checking if has withdrawn is true
        if(hasWithdrawn) { 
            super.display(); //calls the display method from the parent class 
            System.out.println("Pin Number: "+ pinNumber);
            System.out.println("Amount Withdrawn: " + withdrawalAmount);
            System.out.println("Date of withdrawal: " + dateOfWithdrawal);
        } else { 
            //to print if money was not withdrawn from the clients account
            System.out.println("Balance: Nrs." + get_balance()); 
        }

    }
}

