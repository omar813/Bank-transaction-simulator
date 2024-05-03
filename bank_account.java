import  java.util.Scanner;

public class bank_account {
    private double balance;
    public bank_account(){
        balance=0.0;
    }
    public bank_account(double bal){
        balance=bal;
        System.out.println("balance="+balance);
    }
    public void deposit (double amount){
        balance+=amount;
        System.out.println("deposit done successfully");
    }
    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("NO ENOUGH MONEY IN YOUR ACCOUNT");
        }else{
            balance-=amount;
            System.out.println("withdraw done successfully");
        }

    }
    public double getBalance(){
        return balance;
    }
    public void transfer_money(bank_account otheraccount, int amount){
        if(amount>balance){
            System.out.println("no enough balance");
        }else{
            balance-=amount;
            otheraccount.deposit(amount);
            System.out.println("balance after trans"+ balance);
        }

    }
}
