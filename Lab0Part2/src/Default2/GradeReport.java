package Default2;
import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
String name = input.nextLine();
		
System.out.println (name + " What is your score for Quiz 1 (out of 100)");
int a1 = input.nextInt();
System.out.println (name + " What is your score for Quiz 2 (out of 100)");
int b1 = input.nextInt();
System.out.println (name + " What is your score for Quiz 3 (out of 100)");
int c1 = input.nextInt();
System.out.println (name + " What is your score for Quiz 4 (out of 100)");
int d1 = input.nextInt();
System.out.println (name + " What is your score for Quiz 5 (out of 100)");
int e1 = input.nextInt();
System.out.println (name + " What is your score for Quiz 6 (out of 100)");
int f1 = input.nextInt();
System.out.println (name + " What is your score for Quiz 7 (out of 100)");
int g1 = input.nextInt();
System.out.println (name + " What is your score for Quiz 8 (out of 100)");
int h1 = input.nextInt();
System.out.println (name + " What is your score for Quiz 9 (out of 100)");
int i1 = input.nextInt();

System.out.println (name + " What is your score for Assigment 1 (out of 100)");
int a2 = input.nextInt();
System.out.println (name + " What is your score for Assigment 2 (out of 100)");
int b2 = input.nextInt();
System.out.println (name + " What is your score for Assigment 3 (out of 100)");
int c2 = input.nextInt();
System.out.println (name + " What is your score for Assigment 4 (out of 100)");
int d2 = input.nextInt();
System.out.println (name + " What is your score for Assigment 5 (out of 100)");
int e2 = input.nextInt();
System.out.println (name + " What is your score for Assigment 6 (out of 100)");
int f2 = input.nextInt();
System.out.println (name + " What is your score for Assigment 7 (out of 100)");
int g2 = input.nextInt();
System.out.println (name + " What is your score for Assigment 8 (out of 100)");
int h2 = input.nextInt();
System.out.println (name + " What is your score for Assigment 9 (out of 100)");
int i2 = input.nextInt();
System.out.println (name + " What is your score for Assigment 10 (out of 100)");
int j2 = input.nextInt();

System.out.println (name + " What is your score for Lab Test 1 (out of 100)");
int a5 = input.nextInt();
System.out.println (name + " What is your score for Lab Test2 (out of 100)");
int b5 = input.nextInt();
System.out.println (name + " What is your score for Lab Test 3 (out of 100)");
int c5 = input.nextInt();

System.out.println (name + " What is your midterm score (out of 100)");
int a3 = input.nextInt();

System.out.println (name + " What is your final exam score (out of 100)");
int a4 = input.nextInt();

System.out.println (name + " Which course are you talking about? ");
String course = input.nextLine();

System.out.println(name +" here is your grade report for " + course + ": ");

System.out.println("--------------------------------------------------------");
System.out.println("Quiz 1" + a1);
System.out.println("Quiz 2" + b1);
System.out.println("Quiz 3" + c1);
System.out.println("Quiz 4" + d1);
System.out.println("Quiz 5" + e1);
System.out.println("Quiz 6" + f1);
System.out.println("Quiz 7" + g1);
System.out.println("Quiz 8" + h1);
System.out.println("Quiz 9" + i1);

System.out.println("--------------------------------------------------------");
System.out.println("Assigment 1" + a2);
System.out.println("Assigment 2" + b2);
System.out.println("Assigment 3" + c2);
System.out.println("Assigment 4" + d2);
System.out.println("Assigment 5" + e2);
System.out.println("Assigment 6" + f2);
System.out.println("Assigment 7" + g2);
System.out.println("Assigment 8" + h2);
System.out.println("Assigment 9" + i2);
System.out.println("Assigment 10" + j2);
System.out.println("--------------------------------------------------------");
System.out.println("Lab Test 1" + a5);
System.out.println("Lab Test 2" + b5);
System.out.println("Lab Test 3" + c5);
System.out.println("--------------------------------------------------------");
double avgA = (a1 +b1+c1+d1+e1+f1+g1+h1+i1)/9;
double avgB = (a2 +b2+c2+d2+e2+f2+g2+h2+i2+j2)/10;
double avgC = (a5 +b5+c5)/3;

double rawAverage = (avgA * 0.18) + (avgB * 0.20)  + (avgC * 0.12) + (a3 *0.15) + (a4 * 0.35);
System.out.println("Final raw mark: " + rawAverage);
input.close();

	
	}


}
