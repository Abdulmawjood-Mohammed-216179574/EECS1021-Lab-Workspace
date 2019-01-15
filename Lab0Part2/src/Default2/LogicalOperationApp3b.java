package Default2;
import java.util.Scanner;

public class LogicalOperationApp3b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer that is not between 1 and 10: ");
        int i = input.nextInt();
        // wrong choice of operator
        boolean isNotBetween1And10 = 1 > i && i > 10; // this condition is always false!!!

        System.out.println("The number you entered " + i + " is not between 1 and 10: " + isNotBetween1And10);

        input.close();

    }

}