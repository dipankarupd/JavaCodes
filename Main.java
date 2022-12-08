package folder;


import java.util.Scanner;

class Account {

    Scanner sc = new Scanner(System.in);
    int accNo;
    String name;
    int phone;
    float bal = 0;



    void createAcc() {
        System.out.println("Account created");
    }

    void deposite() {
        int x;
        System.out.println("enter the amt ot be deposited: ");
        x = sc.nextInt();
        bal = bal + x;

    }

    void withdraw() {
        int y;
        System.out.println("enter the amt to be withdrawn: ");
        y = sc.nextInt();
        bal = bal - y;

    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("acc no: " + accNo);
        System.out.println("phone no: " + phone);
        System.out.println("balance: " + bal);
    }

}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account a1 = new Account();

        System.out.println("enter the account number: ");
        a1.accNo = sc.nextInt();
        sc.nextLine();
        System.out.println("enter the account holder name: ");
        a1.name = sc.nextLine();

        System.out.println("enter phone: ");
        a1.phone = sc.nextInt();


        a1.createAcc();
        a1.deposite();
        a1.withdraw();
        a1.display();

    }
}
