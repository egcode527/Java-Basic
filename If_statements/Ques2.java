package If_statements;

import java.util.Scanner;

public class Ques2 {

    /*
    If Statements Practice Questions

    2. Write a Java program to check whether a number is even or odd.

     */

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Input number is " + input);

        ques2(input);
    }

    public static void ques2(int input) {

        if (input % 2 == 0) {
            System.out.println("Input number is even");
        } else {
            System.out.println("Input number is odd");
        }
    }
}
