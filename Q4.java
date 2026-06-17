import java.util.*;
public class Q4{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Marks: ");
		double marks=sc.nextDouble();

		if(marks>=75 && marks<=100){
			System.out.println("Grade A");
		}
		else if(marks>=65 && marks<75){
			System.out.println("Grade B");
		}
		else if(marks>=50 && marks<65){
			System.out.println("Grade C");
		}
		else if(marks>=35 && marks<50){
			System.out.println("Grade S");
		}
		else{
			System.out.println("Grade D");
		}
	}
}

/*
4. Write a program that determines the grade for a student based on their score. Prompt the user to enter a score, and then use explicit control-flow statements (if-else or switch-case) to determine and display the corresponding grade. For example, if the score is between 90 and 100, display "Grade A".
*/
