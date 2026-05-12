class Bank {
    void getInterestRate() {
        System.out.println("Bank Interest Rate: 0%");
    }
}

class SBI extends Bank {
    @Override
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 7%");
    }
}

class HDFC extends Bank {
    @Override
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 10%");
    }
}

class ICICI extends Bank {
    @Override
    void getInterestRate() {
        System.out.println("ICICI Interest Rate: 12%");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        // Using Parent class reference as requested in 1000030686.jpg
        Bank myBank;

        myBank = new SBI();
        myBank.getInterestRate();

        myBank = new HDFC();
        myBank.getInterestRate();

        myBank = new ICICI();
        myBank.getInterestRate();
    }
}