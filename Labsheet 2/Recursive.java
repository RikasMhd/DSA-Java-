import java.util.*;
public class Recursive {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter No: ");
        int n=sc.nextInt();

        if(n>=0){
            System.out.println(factorial(5));
        }
        else{
            System.out.println("Enter Number Higher than 0");
        }
    }
}

/*
1. Write a recursive function to calculate the factorial of a given positive integer. Prompt the user to enter a number and display its factorial using recursion.
*/