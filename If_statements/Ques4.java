package If_statements;

import java.util.Scanner;

public class Ques4 {

    /*
    If Statements Practice Questions

    4. Write a Java program to find the maximum of two numbers.


     */

    public static void main(String[] args) {
        System.out.println("Enter a first number");
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        System.out.println("Input first is " + input1);

        System.out.println("Enter a second number");
        int input2 = scanner.nextInt();
        System.out.println("Input second is " + input2);

        ques4(input1, input2);

    }

    public static void ques4(int input1, int input2) {

        if (input1 > input2) {
            System.out.println(input1 + " is greater than " + input2);
        }else{
            System.out.println(input2 + " is greater than " + input1);
        }
    }
}
