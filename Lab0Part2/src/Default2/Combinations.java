package Default2;

import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st string: ");
		String e = input.nextLine();
		
		System.out.println("Enter 2nd string: ");
		String f = input.nextLine();
		
		System.out.println("Enter 3rd string: ");
		String g = input.nextLine();
		
		System.out.println("Enter 4th string: ");
		String h = input.nextLine();
		
		
		System.out.println("Enter 1st integer: ");
	        int a = input.nextInt();
	       
	        
	    System.out.println("Enter 2nd integer: ");
	        int b = input.nextInt();
	        
	       
	    System.out.println("Enter 3rd integer: ");
	        int c = input.nextInt();
	       
	       
	        
	    System.out.println("Enter 4th integer: ");
	        int d = input.nextInt();
	        
	        System.out.println("(" + e + ", " + a + ")");
	        System.out.println("(" + e + ", " + b + ")");
	        System.out.println("(" + e + ", " + c + ")");
	        System.out.println("(" + e + ", " + d + ")");
	        
	        System.out.println("(" + f + ", " + a + ")");
	        System.out.println("(" + f + ", " + b + ")");
	        System.out.println("(" + f + ", " + c + ")");
	        System.out.println("(" + f + ", " + d + ")");
	        
	        System.out.println("(" + g + ", " + a + ")");
	        System.out.println("(" + g + ", " + b + ")");
	        System.out.println("(" + g + ", " + c + ")");
	        System.out.println("(" + g + ", " + d + ")");
	        
	        System.out.println("(" + h + ", " + a + ")");
	        System.out.println("(" + h + ", " + b + ")");
	        System.out.println("(" + h + ", " + c + ")");
	        System.out.println("(" + h + ", " + d + ")");
	        
	        
	        input.close();

	}

}
