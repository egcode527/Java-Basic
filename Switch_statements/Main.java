package Switch_statements;

import java.util.Scanner;

public class Main {

    //switch statements

    static void main() {
        System.out.println("Enter a week day");
        Scanner scanner = new Scanner(System.in);
        int weekday = scanner.nextInt();
        System.out.println("Input week day is " + weekday);

        weekDayCalculate(weekday);
    }

    public static void weekDayCalculate(int weekDay) {

        switch (weekDay) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Input week day is not valid");
                break;
        }
    }
}
