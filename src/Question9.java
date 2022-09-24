import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner bonus = new Scanner(System.in);
        System.out.println("Salary");
        int x = bonus.nextInt();
        System.out.println("Service");
        int y = bonus.nextInt();
        if (y > 5) {
            System.out.println("The bonus amount is " + (0.05 * x));
        }
    }
}
