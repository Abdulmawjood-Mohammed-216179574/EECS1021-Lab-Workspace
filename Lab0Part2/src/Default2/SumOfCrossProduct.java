package Default2;
import java.util.Scanner;

public class SumOfCrossProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st integer in sequence 1:");
		int a = input.nextInt();
		System.out.println("Enter the 2st integer in sequence 1:");
		int b = input.nextInt();
		System.out.println("Enter the 3st integer in sequence 1:");
		int c = input.nextInt();
		System.out.println("Enter the 4st integer in sequence 1:");
		int d = input.nextInt();
		System.out.println("Enter the 1st integer in sequence 2:");
		int e = input.nextInt();
		System.out.println("Enter the 2st integer in sequence 2:");
		int f = input.nextInt();
		System.out.println("Enter the 3st integer in sequence 2:");
		int g = input.nextInt();
		System.out.println("Enter the 4st integer in sequence 2:");
		int h = input.nextInt();
		
		int p1 = a * e;
		int p2 = b * f;
		int p3 = c * g;
		int p4 = d * h;
		int sum = p1 + p2 + p3 + p4;
		System.out.println("sum([" + a + ", " + b + ", "+ c + ", " + d + "] * [" + e + ", " + f + ", " + g + ", " + h + "]) = " + sum);
		
	}

}
