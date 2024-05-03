public class CheckingAccount extends bank_account{
    private double balance;
    private int allowed_free_transaction=2;
    private  double transaction_fees = 3.0;
    private int transactionCount;
    public CheckingAccount(){

        balance=0.0;
    }
    public CheckingAccount(double bal){
        balance=bal;
    }
    public double getbalance(){
        return balance;
    }
    @Override
    public void deposit(double amount){
        balance+=amount;
        System.out.println("transaction done successfully");
    }
    @Override
    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("NO ENOUGH MONEY IN YOUR ACCOUNT");
        }else{
            balance-=amount;
            transactionCount++;
            System.out.println("withdraw done successfully");
            System.out.println("balance after withdraw :"+balance);
            System.out.println("---------------------------");
        }
    }
    public void addtional_fees(){

            if (transactionCount > allowed_free_transaction) {
                double fee = (transactionCount - allowed_free_transaction) * 3.0;
                balance -= fee;
                System.out.println("---------------------------");
                System.out.println("Transaction fees charged: $" + fee);
                System.out.println("balance after fees: " + balance);
                System.out.println("---------------------------");
            }
    }

}
