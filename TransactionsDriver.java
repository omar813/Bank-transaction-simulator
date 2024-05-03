public class TransactionsDriver {
    public static void main(String[] args){
        SavingsAccount dadssaving= new SavingsAccount(0.3);
        CheckingAccount kidssaving= new CheckingAccount();


        dadssaving.deposit(10000);
        dadssaving.transfer_money(kidssaving,3000);
        System.out.println("---------------------------");



        kidssaving.withdraw(200);
        kidssaving.withdraw(400);
        kidssaving.withdraw(300);
        kidssaving.withdraw(200);
        kidssaving.withdraw(400);

        dadssaving.addCompoundInterest();
        kidssaving.addtional_fees();

        System.out.println("final balance for dadsaving is : "+dadssaving.getBalance());
        System.out.println("final balance for kidssaving is : "+kidssaving.getbalance());

    }

}
/*
- Withdraw 200 from kidsChecking
- Withdraw 400 from kidsChecking
- Withdraw 300 from kidsChecking
- Withdraw 500 from kidsChecking
- Withdraw 400 from kidsChecking
 */