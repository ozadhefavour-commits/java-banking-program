import java.util.Scanner;

public class omo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //JAVA BANLING PROGRAM FOR BEGINNERS
        //STEPS

        // DECLARE VARIABLE

        // DISPLAY MENU

        //GET AND PROCESS USER CHOICE

        // showBalance()

        // deposit()

        // withdraw()

        //Exit message

        // when using multiple method you declare the scanner before
        // the static void main,and the scanner must be static

// variable declaration
        double balance = 0;
        boolean isRuning = true;
        int choice;

        while (isRuning) {
            System.out.println("---------------------");
            System.out.println("BANKING PROGRAM");
            System.out.println("----------------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("----------------------");


            System.out.print("Enter your choice(1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRuning = false;
                default -> System.out.println("INVALID CHOICE");
            }

        }
            System.out.println("-----------------------------");
            System.out.println("THANK YOU! HAVE A NICE DAY!👋");
            System.out.println("-----------------------------");

            scanner.close();
        }


    static void showBalance(double balance) {
        System.out.printf("$%.2f", balance);
    }

    static double deposit() {

        double amount;


        System.out.print("Enter the amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;

        }

    }

    static double withdraw(double balance) {

        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount< 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}


















