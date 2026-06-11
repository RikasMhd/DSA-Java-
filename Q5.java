import java.util.*;

public class Q5 {

    public static String performOperation(double n1, double n2, String op) {

        if (op.equals("+")) {
            return String.valueOf(n1 + n2);
        } 
        else if (op.equals("-")) {
            return String.valueOf(n1 - n2);
        } 
        else if (op.equals("*")) {
            return String.valueOf(n1 * n2);
        } 
        else if (op.equals("/")) {
            if (n2 == 0) {
                return "Cannot divide by zero";
            }
            return String.valueOf(n1 / n2);
        } 
        else {
            return "Enter a valid operator";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n1: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter n2: ");
        double n2 = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter Operator (+, -, *, /): ");
        String op = sc.nextLine();

        String result = performOperation(n1, n2, op);
        System.out.println("Result: " + result);
    }
}