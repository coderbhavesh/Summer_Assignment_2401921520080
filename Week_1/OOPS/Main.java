//banking management system
class BankAccount {
    String name;
    double balance; // Simple variables, no complex private/protected keywords

    public BankAccount(String userName, double startingMoney) {
        name = userName;
        balance = startingMoney;
    }

  
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(name + " deposited $" + amount);
    }
}

// (Inheritance: SavingsAccount gets everything from BankAccount)
class SavingsAccount extends BankAccount {
    
   
    public SavingsAccount(String userName, double startingMoney) {
        super(userName, startingMoney); // 'super' just sends the name and money to the parent setup
    }

    // Polymorphism: Changing how interest works for this specific account
    public void addInterest() {
        double interest = balance * 0.05; // 5% interest
        balance = balance + interest;
        System.out.println("Added 5% interest! New Balance: $" + balance);
    }
}

// 3. MAIN CLASS (The entry point to run your code)
public class Main {
    public static void main(String[] args) {
        // Create a normal account for Bhavesh
        BankAccount account1 = new BankAccount("Bhavesh", 1000);
        account1.deposit(500);
        System.out.println("Bhavesh's Balance: $" + account1.balance);

        System.out.println("--------------------------------");

        // Create a savings account for Amit (Notice it can use deposit too!)
        SavingsAccount account2 = new SavingsAccount("Bhavesh", 2000);
        account2.deposit(500);   // Inherited from parent
        account2.addInterest();  // Unique child feature
    }
}