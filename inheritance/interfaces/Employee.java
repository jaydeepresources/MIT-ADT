package inheritance.interfaces;

public class Employee implements Tax, ProvidentFund {
    public void payTax() {
        System.out.println("Pay the tax to the govt.");
    }

    @Override
    public void openAccount() {
        System.out.println("Opening a new PF Account");
    }

    @Override
    public void deposit() {
        System.out.println("Amount is deposited");
    }

    @Override
    public void withdraw() {
        System.out.println("Can withdraw a certain amount before maturity only in case of emergency");
    }
}