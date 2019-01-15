package Default2;
import java.util.Scanner;

public class IfStatementApp2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer balance: ");
        int initialBalance = input.nextInt();

        System.out.println("Enter an integer withdraw: ");
        int amount = input.nextInt();

        if(initialBalance < 0 || amount < 0 || amount >= initialBalance) {
            System.out.println("Error: Launch the program agian.");
        }
        else {
            int resultingBalance = initialBalance - amount;
            System.out.print("Initial balance " + initialBalance + " after withdrawing " + amount);
            System.out.println(" has the resulting balance " + resultingBalance);


        }
        input.close();

	}

}
