package If_statements;

import java.util.Scanner;

public class Ques3 {

    /*
    If Statements Practice Questions


    3. Write a Java program to check whether a number is positive and even.

     */

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Input number is " + input);

        ques3(input);
    }

    public static void ques3(int input) {

        if (input > 0) {

            if (input % 2 == 0) {
                System.out.println("Input number is positive and even");
            } else {
                System.out.println("Input number is positive and odd");
            }

        } else {
            System.out.println("Input number is not positive");
        }
    }
}
