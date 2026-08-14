package If_statements;

import java.util.Scanner;

public class Ques5 {

    /*
    If Statements Practice Questions

    5. Write a Java program to check whether three numbers are in increasing order.

     */

    public static void main(String[] args) {
        System.out.println("Enter a first number");
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        System.out.println("Input first is " + input1);

        System.out.println("Enter a second number");
        int input2 = scanner.nextInt();
        System.out.println("Input second is " + input2);

        System.out.println("Enter a third number");
        int input3 = scanner.nextInt();
        System.out.println("Input third is " + input3);

        ques5(input1, input2, input3);
    }

    public static void ques5(int input1, int input2, int input3) {

        if (input1 < input2 && input2 < input3) {
            System.out.println("Given numbers are in increasing order");
        } else {
            System.out.println("Given numbers are not in increasing order");
        }
    }

}
