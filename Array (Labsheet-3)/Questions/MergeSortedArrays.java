import java.util.Scanner;
public class MergeSortedArrays {

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }
        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }

    public static int[] readArray(Scanner sc, String label) {
        System.out.print("Enter number of elements in " + label + ": ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers in ascending (sorted) order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = readArray(sc, "array 1");
        int[] arr2 = readArray(sc, "array 2");

        int[] merged = merge(arr1, arr2);

        System.out.print("Merged sorted array: ");
        printArray(merged);

        sc.close();
    }
}
