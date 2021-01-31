package fundamentals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TasksExercises {
    static float pi = (float) Math.PI;
    int x = 10;
    static int y = 1;
    /*   Write an application that will read diameter of a circle (variable of type float) and
        calculate perimeter of given circle.
        Firstly, assume π = 3.14. Later, use value of π from built-in Math class */

    public static void circlePerimeter() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter: ");
        float diameter = scanner.nextFloat();

        System.out.println("The perimeter of the circle is: " + diameter * pi);
    }

    //
//    Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
//    Your application should read two variables: weight (in kilograms, type float) and height
//(in centimeters, type int). BMI should be calculated given following formula: weight/height(m)^2
//    The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal values.
//    Your program should write "BMI optimal" or "BMI not optimal", according to the assumptions above.
    public static void bodyMassIndex() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input weight in Kilogram:");
        float weight = scanner.nextFloat();

        System.out.println("\nInput height in centimeters:");
        int height = scanner.nextInt();
        float bmi = weight / ((float) height * height / 10000);
        System.out.println(bmi);
        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }
    }
//    Write an application that takes a positive number from the user (type int) and writes all numbers from 1
//    to the given number, each on the next line, with the following changes:
//
//            ● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
//            ● in place of numbers divisible by 7, instead of a number the program should write "Buzz"
//            ● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"

    public static void fizzBuzz() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a positive int number");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //    Write an application that takes a positive number from the user (type int)
//    and prints all prime numbers greater than 1 and less than the given number
    public static void primeNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String primeNumber = "";
        int c = 0;
        for (int i = 2; i < number; i++) {
            c = 0;
            for (int k = 2; k <= i / 2; k++) {
                if (i % k == 0) {
                    c++;
                }
            }
            if (c == 0) {
                primeNumber = primeNumber + i + " ";
            }


        }
        System.out.println("Prime numbers greater than 1 and less than" + number + " are ");
        System.out.println(primeNumber);
    }
//
//Write an application that will take a positive number from the user (type int)
//    and calculate the Fibonacci number at the indicated index. For example, if the number equals 5,
//    your program should print the fifth Fibonacci number. In Fibonacci sequence, each number is the
//    sum of the two preceding ones

    public static void fibonacciNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a positive number: ");
        int number = scanner.nextInt();
        long fib[] = new long[number + 2];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= number; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];

        }

        System.out.println("The number from Fibonacci sequence with index " + number + " is " + fib[number]);

    }

    //    Write an application that gets one positive number (type int) from the user and
//    calculates a sum of digits of the given number. Hint: to make some operations on every
//    single digit of the number (digit by digit), you can calculate the remainder of dividing
//    the number by 10 (to get the value of the last digit) and divide the number by 10 (to "move" to the next digit).
    public static void sumDigitNumber() {
        System.out.println("Give a positive integer number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int aux = number;
        int sum = 0;
        while (aux != 0) {
            sum = sum + aux % 10;
            aux = aux / 10;
        }
        System.out.println("Sum of digits of number " + number + " is " + sum);
    }

    //    Write an application that will read texts (variables of the
//    String type) until the user gives the text "Enough!" and then
//    writes the longest of the given texts (not including the text
//    "Enough!"). If the user does not provide any text, write
//    "No text provided".
    public static void logestWord() {
        System.out.println("Type a text at end write enough: ");
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String longestWord1 = "";

        do {
            word = scanner.next();
            if (longestWord1.length() < word.length() && !word.equals("Enough!")) {
                longestWord1 = word;
            }
        } while (!word.equals("Enough!"));
        if (longestWord1.length() == 0) {
            System.out.println("No text provides");
            return;
        }
        System.out.println("Cuvantul cel mai lung este " + longestWord1);
    }

    public static void logestWord1() {
        System.out.println("Type a text at end write enough: ");
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String longestWord1 = "";

        do {
            word = scanner.next();
            if (!word.equals("Enough!") && longestWord1.length() < word.length()) {
                longestWord1 = word;
            }
        } while (!word.equals("Enough!"));
        if (longestWord1.length() == 0) {
            System.out.println("No text provides");
            return;
        }
        System.out.println("Cuvantul cel mai lung este " + longestWord1);
    }

    public static void logestWord2() {
        System.out.println("Type a text at end write enough: ");
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String longestWord1 = "";
        while (!word.equals("Enough!")) {
            if (longestWord1.length() < word.length()) {
                longestWord1 = word;
            }
            word = scanner.next();
        }
        if (longestWord1.length() == 0) {
            System.out.println("No text provides");
            return;
        }
        System.out.println("Cuvantul cel mai lung este " + longestWord1);
    }

    // 	Write an application that reads a text from the user
// (type String) and counts a percentage of occurrences of a space character.
    public static void countSpace() {
        String text = "";
        int counter = 0;
        System.out.println("Type a text: ");
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                counter++;
            }
        }

        System.out.println("Space character appears " + counter + " times in " + text.length() + "characters, that represent " + ((float) counter / text.length()) * 100 + "%"); // De Ex daca pun float inainte de counter,  la textul introdus de mine procentul e 10.526316, dar daca nu pun float rezultatul este zero. Nu inteleg de ce nu afiseaza 10
    }

    //    	Write an application that "stutters", that is, reads the user's text (type String), and prints the given text, in which each
//    	word is printed twice. For example, for the input: "This is my test" the application should print "This This is is my my test test".
    public static void stutters() {
        String suttersText = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nr de cuvinte ");
        int noWords = scanner.nextInt();
        String[] text = new String[noWords];
        System.out.println("Type a textul ");
        for (int i = 0; i < noWords; i++) {
            text[i] = scanner.next();
            suttersText = suttersText + text[i] + " " + text[i] + " ";
        }
        System.out.println(suttersText);

    }

    //    	Write an application that "stutters", that is, reads the user's text (type String), and prints the given text, in which each
//    	word is printed twice. For example, for the input: "This is my test" the application should print "This This is is my my test test".
    public static void stutters1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti textul ");
        String text = scanner.nextLine();
        String[] words=text.split(" ");
        for (int i=0; i<words.length;i++){
            System.out.print(words[i]+" "+ words[i] + " ");
        }

    }
    // test string
    public static void testString(){
        String s1="abc";
        String s2="abc";
        String s3=new String ("abc");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }

    //	Write an application that reads two lowercase letters of the Latin alphabet (type char) and calculates how
// many characters is there in the alphabet between given letters. Hint - use the ASCII code table and treat the
// characters as int numbers.
    public static void countCharBetween2c() {
        char a1 = ' ';
        char a2 = ' ';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a lower character:");
        a1 = scanner.next().charAt(0);
        System.out.println("Type the second lowercase character: ");
        a2 = scanner.next().charAt(0);
        for (char i = a1; i < a2; i++) {
            count = count + 1;
        }
        System.out.println("Between " + a1 + " and " + a2 + " there are " + count + " characters");
    }

    //	Write an application that takes 10 numbers from the user (type int) and write the length of the
//	longest such subsequence of these numbers, which is increasing. For example, for the numbers:
//	"1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5" as the length of the longest increasing
//	subsequence (underlined in the example).
    public static void longestIncreasing() {
        int[] number = new int[10];
        int longestSubsequence = 0;
        int subsequence = 0;
        System.out.printf("Type 10 integer numbers ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            number[i] = scanner.nextInt();
        }
        for (int i = 1; i < 10; i++) {
            if (number[i] > number[i - 1]) {
                subsequence++;
                if (longestSubsequence < subsequence) {
                    longestSubsequence = subsequence;

                }
            } else {
                subsequence = 1;
            }
        }
        System.out.printf("The longest subsequence witch is increasing " + longestSubsequence);

    }
    public void testObjects(){
        Dog dog1 =new Dog( "Azorel");

 //       dog1.setName("Azorel");
        Dog dog2 =new Dog("Azorel");
//        dog2.setName("Azorel");
        System.out.println(dog1==dog2);
        System.out.println((dog1.equals(dog2)));
        System.out.println(dog1.getName().equals(dog2.getName()));
    }
}





