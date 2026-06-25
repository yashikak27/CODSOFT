package atm;

import java.util.Scanner;

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if(choice == 1) {
                System.out.println("Current Balance = ₹" + balance);
            }

            else if(choice == 2) {
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();

                balance = balance + deposit;

                System.out.println("Money Deposited Successfully.");
                System.out.println("New Balance = ₹" + balance);
            }

            else if(choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                double withdraw = sc.nextDouble();

                if(withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Money Withdrawn Successfully.");
                    System.out.println("Remaining Balance = ₹" + balance);
                }
                else {
                    System.out.println("Insufficient Balance!");
                }
            }

            else if(choice == 4) {
                System.out.println("Thank You!");
            }

            else {
                System.out.println("Invalid Choice");
            }

        } while(choice != 4);

        sc.close();
    }
}
