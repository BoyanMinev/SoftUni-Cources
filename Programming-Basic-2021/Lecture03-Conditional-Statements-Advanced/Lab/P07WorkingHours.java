package L03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hour >= 10 && hour <= 18) {
            switch (day.toLowerCase()) {
                case "monday":
                case "tuesday":
                case "wednesday":
                case "thursday":
                case "friday":
                case "saturday":
                    System.out.println("open");
                    break;
                default:
                    System.out.println("closed");

            }


        } else {
            System.out.println("closed");
        }

    }
}