public class SavingsAccount extends bank_account {
    private double interestrate;
    private double balance;
    public SavingsAccount(double interestRate) {
        this.interestrate = interestRate;
    }
    public SavingsAccount(double interestRate,int Balance) {
        this.interestrate = interestRate;
        deposit(Balance);
    }
    public void addCompoundInterest() {
        double interest = getBalance() * interestrate / 100.0;
        deposit(interest);
        System.out.println(interest + " added to your account as compound interest.");
    }

}
