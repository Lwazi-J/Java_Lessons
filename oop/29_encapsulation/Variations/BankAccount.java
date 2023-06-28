/* Example 2: Encapsulation with Validation */

public class BankAccount {
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.isEmpty()) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }
}


/* In this example, the BankAccount class encapsulates the accountNumber and balance variables. 
 * The accountNumber is validated in the setAccountNumber() method to ensure that it is not null or empty before assigning it to the private variable
 * The balance variable is encapsulated and can only be accessed through the getter (getBalance()).
 *
 * Additionally, the deposit() and withdraw() methods demonstrate encapsulation with validation. 
 * They check if the amount is valid (greater than zero) and perform the respective operations only if the conditions are met. 
 * By encapsulating the balance and providing controlled access through methods, 
 * the class ensures that the account balance is updated correctly and maintains data integrity.



