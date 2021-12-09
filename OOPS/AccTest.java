import java.util.Scanner;
public class AccTest
{
    Scanner input = new Scanner(System.in);
    private double balance=10000;
    public void withdraw()
    {

        System.out.println("Enter amount to withdraw: ");
        double amount = input.nextInt();
        if(balance>1500){
            balance = balance - amount;
        }
        else{
            System.out.println("Cannot Withdraw!!! Balance is less than 1500");
        }
    }
    public void deposit()
    {
        System.out.println("Enter amount: ");
        double amount = input.nextInt();
        balance = balance + amount;
    }
    public void accBalance(){
        System.out.println("Your balance is: "+this.balance);
    }
    public static void main(String[] args){
        AccTest t1=new AccTest();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account balance:");
        t1.balance=input.nextDouble();

        System.out.println("1.Withdrawal\n2.Deposit\n3.Balance Enquiry");
        System.out.println("Enter your choice");
        int c=input.nextInt();
        switch(c){
            case 1: t1.withdraw();
                t1.accBalance();
                break;
            case 2: t1.deposit();
                t1.accBalance();
                break;
            case 3: t1.accBalance();
                break;
        }
    }
}