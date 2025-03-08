package PolimorfizmSample;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void CalculateInterest() {
        int interest;
        interest = (int) (balance * 0.05);
        System.out.println("Earning amount of interest : "+interest);
    }
}
