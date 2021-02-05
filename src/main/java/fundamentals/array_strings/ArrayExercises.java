package fundamentals.array_strings;

import java.util.*;

public class ArrayExercises {


//Write a Java program to find maximum product of two integers in a given array of integers.
//Example: nums = { 2, 3, 5, 7, -7, 5, 8, -5 } => Pair is (7, 8), Maximum Product: 56

    public static void maxProduct(int arr[], int n) {
        System.out.println("The array is: " + Arrays.toString(arr));
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
        System.out.println("Give me the index of the element to remove between 0 and " + (arraylengh - 1));
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

    //Write a Java program to find the max number (harder: the second max number) in an array of integers.
    public static void theSecondMax() {
        Scanner scanner = new Scanner(System.in);
        int arraylengh;
        int x;

        System.out.println("The lenght of the array: "); // lungimea array-ului
        arraylengh = scanner.nextInt();
        int[] myarray = new int[arraylengh];    // declar array-ul de lungimea introdusa
        System.out.println("The Array : ");
        for (int i = 0; i < arraylengh; i++) {  // preiau elementele array-ului
            myarray[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraylengh; i++) {    // ordonez array-ul
            for (int j = i + 1; j < arraylengh; j++) {
                if (myarray[i] > myarray[j]) {
                    x = myarray[i];
                    myarray[i] = myarray[j];
                    myarray[j] = x;
                }
            }
        }
        System.out.println("The max value is " + myarray[arraylengh - 1] + " and the second max is " + myarray[arraylengh - 2]);

    }

    // 	Write a Java program to find the duplicate values of an array of string values.
    public static void duplicatValue() {
        Scanner scanner = new Scanner(System.in);
        int arraylengh;
        System.out.println("The lenght of the array: "); // lungimea array-ului
        arraylengh = scanner.nextInt();
        String[] myarray = new String[arraylengh];    // declar array-ul de lungimea introdusa
        System.out.println("The Array : ");
        for (int i = 0; i < arraylengh; i++) {  // preiau elementele array-ului
            myarray[i] = scanner.next();
        }
        for (int i = 0; i < myarray.length - 1; i++) {
            for (int j = i + 1; j < myarray.length; j++) {
                if (myarray[i].equals(myarray[j])) {
                    System.out.println("Duplicat value is: " + myarray[i]);
                }
            }
        }

    }

    // 	Write a Java program to get the character at the given index within the String
    public static void charReturn() {
        Scanner scanner = new Scanner(System.in);
        String str = "This is a string";
        System.out.println("Original String = " + str);
        System.out.println("Give me the index of the char to return less then " + str.length());
        int index = scanner.nextInt();
        int index1 = str.charAt(index);
        System.out.println("The character at position " + index + " is " + (char) index1);

    }

    // 	Write a Java program to test if a given string contains the specified sequence of char values (another string)
    public static void containString1() {
        String str1 = "Acesta este un sir";
        String str2 = "sir";
        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));


    }
}