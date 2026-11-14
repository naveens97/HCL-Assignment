import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int accountType=scan.nextInt();
        int accountNumber=scan.nextInt();
        double balance=scan.nextDouble();
        BankAccount account;
        if(accountType==1){
            double interestRate=scan.nextDouble();
            account=new SavingsAccount(accountNumber, balance, interestRate);
        }
        else{
            double overdraftLimit=scan.nextDouble();
            account=new CurrentAccount(accountNumber, balance, overdraftLimit);
        }
        System.out.println(account.calculateFinalBalance());
    }
}
