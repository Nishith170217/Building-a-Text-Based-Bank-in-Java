import java.util.Scanner;
public class bank1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println(userInput);
        int size = 0;
        double[] accountBalances = new double[250];
        String[] accountNames = new String[250];
        for (; true; ) {
            System.out.println("Bank Admin Menu: ");
            System.out.println("Please Enter the Menu Option: ");
            System.out.println("(1): Add Customer to Bank ");
            System.out.println("(2): Change Customer Name ");
            System.out.println("(3): Check Account Balance ");
            System.out.println("(4): Modify Account Balance ");
            System.out.println("(5): Summary of all accounts ");
            System.out.println("(-1): Quit");
            int userInput = input.nextInt();

            if (userInput == 1) {
                System.out.println("**Bank add Customer Menu**");
                System.out.println("Please enter an acount balance : ");
                double balance = input.nextDouble();
                accountBalances[size] = balance;
                System.out.println("Please enter the account name: ");
                input.nextLine();
                String name = input.nextLine();
                accountNames[size] = name;
                System.out.println("Customer ID is : " + size);
                size = size + 1;

            } else if (userInput == 2) {
                System.out.println("Bank Change name menu");
                System.out.println("Please enter a customer ID to change name : ");
                int index = input.nextInt();
                System.out.println("What is the customers new name : ");
                input.nextLine();
                accountNames[index] = input.nextLine();

            } else if (userInput == 3) {
                System.out.println("Bank check Balance Menu ");
                System.out.println("Please enter the customer ID to check the balance : ");
                int index = input.nextInt();
                double balance = accountBalances[index];
                System.out.println("This customer has $" + balance + " in his account...!");

            } else if (userInput == 4) {
                System.out.println("Bank modify Balance menu ");
                System.out.println("Please enter the customer ID to modify the balance : ");
                int index = input.nextInt();
                System.out.println("Please enter your new balance : ");
                accountBalances[index] = input.nextDouble();

            } else if (userInput == 5) {
                System.out.println("Bank All Customers summary Menu");
                double total = 0;
                for (int i = 0; i < size; i++) {
                    total = total + accountBalances[i];
                    System.out.println(accountNames[i] + " has $" + accountBalances[i]);
                }
                System.out.println("In total there is $" + total + " in the Bank");
            }
            else if (userInput == -1) {
                System.exit(-1);

            }
            else {
                System.out.println("Error :: Invalid input ");
            }


        }
    }
}