public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds or invalid amount!");
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }

    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);
        
        System.out.println("Initial Balance: $" + account.getBalance());
        
        account.deposit(200.0);
        account.withdraw(100.0);
        
        System.out.println("Remaining Balance: $" + account.getBalance());
    }
}