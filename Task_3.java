import java.util.*;

class ATM {
    float Balance;
    int PIN = 5674;

    public void checkpin() {
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enterPIN = sc.nextInt();
        if (enterPIN == PIN) {
            menu();
        } else {
            System.out.println("enter a valid pin");
            menu();
        }

    }

    public void menu() {
        System.out.println("Enter your choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withDrawMoney();
        } else if (opt == 3) {
            depositeMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance() {
        System.out.println("Balance : " + Balance);
        menu();
    }

    public void withDrawMoney() {
        System.out.println("Enter amout to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();

        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money withdrawl Successfully");

        }
        menu();
    }

    public void depositeMoney() {
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();
        Balance = Balance + amount;
        System.out.println("Money Deposite Successfully");
        menu();
    }
}

public class Task_3 {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
