package Oct21.Encapsulation;

public class Bank {
    private String accountHolderName;
    private String accountType;
    private long accountNumber;
    private double accountBalance;

    public void setAccountHolderName(String accountHolderName) {   //setter
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {   //getter
        return accountHolderName;
    }

    public String getAccountType() {    //getter
        return accountType;
    }

    public long getAccountNumber() {  //getter
        return accountNumber;
    }

    public Bank(String accountHolderName, String accountType, int accountNumber, double accountBalance) {                                   //constructor
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void withdraw(double amount){
        if(amount < accountBalance){
            accountBalance -= amount;
            System.out.println("withdraw: " + amount);
        } else{
            System.out.println("Invalid");
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            accountBalance += amount;
            System.out.println("Deposited Successfully");
        }else{
            System.out.println("Invalid");
        }
    }

    public double checkBalance(){
        return accountBalance;
    }

    public void statements(){
        System.out.println("Bank Statement");
    }
}
