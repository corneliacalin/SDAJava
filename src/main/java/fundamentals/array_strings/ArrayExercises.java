package fundamentals.array_strings;

import java.util.*;

public class ArrayExercises {


//Write a Java program to find maximum product of two integers in a given array of integers.
//Example: nums = { 2, 3, 5, 7, -7, 5, 8, -5 } => Pair is (7, 8), Maximum Product: 56

    public static void maxProduct(int arr[], int n) {
        System.out.println("The array is: "+ Arrays.toString(arr));
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
                x + ", " + y + ")= " + x * y);
    }
//	Write a Java program to test if an array of strings contains a specific value

    public static void containString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti textul: ");
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        System.out.print("Introduceti cuvantul: ");
        String findWord = scanner.next();
        boolean verify;
        verify = false;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(findWord)) {
                verify = true;
            }
        }
        if (verify == true) {
            System.out.println("Cunvantul cautat '" + findWord + "'se afla in textul introdus '" + text + "'");
        } else {
            System.out.println("Cunvantul cautat '" + findWord + "'nu se afla in textul introdus '" + text + "'");
        }
    }

    // 	Write a Java program to remove a specific element from an array.
    public static void removeElement() {
        Scanner scanner = new Scanner(System.in);
        int arraylengh;
        System.out.println("The lenght of the array: ");
        arraylengh = scanner.nextInt();
        int[] myarray = new int[arraylengh];
        int[] myarray1 = new int[arraylengh - 1];
        System.out.println("The Array : ");
        for (int i = 0; i < arraylengh; i++) {
            myarray[i] = scanner.nextInt();
        }
        System.out.println("Give me the index of the element to revome beteew 0 and " + (arraylengh - 1));
        int removeIndex = scanner.nextInt();
        int k = 0;
        for (int j = 0; j < arraylengh; j++) {
            if (j != removeIndex) {
                myarray1[k] = myarray[j];
                k++;
            }
        }
        System.out.println("After removing the element: " + Arrays.toString(myarray1));
    }
}
