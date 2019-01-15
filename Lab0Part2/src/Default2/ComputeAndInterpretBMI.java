package Default2;
import java.util.Scanner;
public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		
		System.out.println(name + " Enter your height in inches");
		double a = input.nextDouble();
		
		System.out.println(name + " Enter your weight in pounds");
		double b = input.nextDouble();
		
		double c = (b * 0.45359237);
		
		double d = a*(0.0254);
		
		double bmi = (( c ) / ((a)*(a)));
		System.out.println(name + "your BMI is");
		
		if (bmi < 18.5) {
			System.out.println("You are underweight! ");
		}
		if (bmi >= 18.5 && bmi < 25) {
		System.out.println("You are underweight! ");
		}
		
		if (bmi >= 25 && bmi < 30) {
			System.out.println("You are underweight! ");
		}
			if (bmi >= 30) {
				System.out.println("You are underweight! ");
				input.close();
			}
	}

}
