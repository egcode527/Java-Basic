package If_statements;

import java.util.Scanner;

public class Main {

    /*
    If Statements Practice Questions

    1. Write a Java program to check whether a number is positive, negative, or zero.

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
