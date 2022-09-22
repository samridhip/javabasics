import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String day = dd.next();
        if (day == "MONDAY") {
            System.out.println("It's weekday");
        }
        else if (day == "Tuesday") {
            System.out.println("It's weekday");
        }
        else if (day == "Wednesday") {
            System.out.println("It's weekday");
        }
        else if (day == "Thursday") {
            System.out.println("It's weekday");
        }
        else if (day == "Friday") {
            System.out.println("It's weekday");
        }
        else {
            System.out.println("Its weekend");
        }
    }
}