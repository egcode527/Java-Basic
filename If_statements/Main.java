package If_statements;

import java.util.Scanner;

public class Main {

    /*
    If Statements Practice Questions

    1. Write a Java program to check whether a number is positive, negative, or zero.
    2. Write a Java program to check whether a number is even or odd.
    3. Write a Java program to check whether a number is positive and even.
    4. Write a Java program to find the maximum of two numbers.
    5. Write a Java program to check whether three numbers are in increasing order.

     */

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Input number is " + input);

        Ques1(input);

    }

    public static void Ques1(int input){
        if (input > 0) {
            System.out.println("Input number is positive");
        } else if (input < 0) {
            System.out.println("Input number is negative");
        } else {
            System.out.println("Input number is zero");
        }
    }
}
