package fundamentals.array_strings;
import java.util .*;
public class ArrayExercises {


//Write a Java program to find maximum product of two integers in a given array of integers.
//Example: nums = { 2, 3, 5, 7, -7, 5, 8, -5 } => Pair is (7, 8), Maximum Product: 56

    static void maxProduct(int arr[], int n) {
        if (n < 2) {
            System.out.println("The array has only one element");
            return;
        }
        int x = arr[0], y = arr[1];
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] * arr[j] > x * y) {
                    x = arr[i];
                    y = arr[j];
                }
        System.out.println("Maximum product pair is (" +
                x + ", " + y + ")= " + x*y);
    }
}
