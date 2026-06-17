public class ArraySumCalculator {
    public static int calculateSumRecursive(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + calculateSumRecursive(arr, index + 1);
    }

    public static int calculateSumIterative(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
		
		/*
		To use System.nanoTime(), you don't need to import a specific package 
		because System is part of the java.lang package, which is automatically 
		imported in every Java program by default.
		*/

        // Recursive sum calculation
        long recursiveStartTime = System.nanoTime();
        int recursiveSum = calculateSumRecursive(arr, 0);
        long recursiveEndTime = System.nanoTime();
        long recursiveExecutionTime = recursiveEndTime - recursiveStartTime;
        System.out.println("Recursive Sum: " + recursiveSum);
        System.out.println("Recursive Execution Time (in nanoseconds): " + recursiveExecutionTime);

        // Iterative sum calculation
        long iterativeStartTime = System.nanoTime();
        int iterativeSum = calculateSumIterative(arr);
        long iterativeEndTime = System.nanoTime();
        long iterativeExecutionTime = iterativeEndTime - iterativeStartTime;
        System.out.println("Iterative Sum: " + iterativeSum);
        System.out.println("Iterative Execution Time (in nanoseconds): " + iterativeExecutionTime);
    }
}

/*
2. Write a program to calculate the sum of all elements in an array using both recursion and iteration. 
Implement a recursive function to calculate the sum and a loop-based function to calculate the sum. Compare the performance and efficiency of both approaches.
*/