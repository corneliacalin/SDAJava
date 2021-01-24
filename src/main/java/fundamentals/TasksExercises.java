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
        Scanner scanner =new Scanner(System.in);
        int number =scanner.nextInt();
        String primeNumber="";
        int c=0;
        for (int i=2; i<number; i++){
            c=0;
            for (int k=2; k<=i/2; k++) {
                if (i % k == 0) {
                    c++;
                }
            }
            if (c==0) {
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
        Scanner scanner =new Scanner(System.in);
        System.out.println("Give a positive number: ");
        int number=scanner.nextInt();
        long fib[] =new long[number+2];
        fib[0]=0;
        fib[1]=1;
        for (int i=2; i<=number;i++){
            fib[i]=fib[i-1]+fib[i-2];

        }

        System.out.println("The number from Fibonacci sequence with index " + number + " is " +fib[number]);

    }

}


