import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner ss = new Scanner(System.in);
        int a = ss.nextInt();
        System.out.println("Enter the second number");
        int b = ss.nextInt();
        int c = a+b;
        int d = a*b;
        System.out.println(c);
        System.out.println(d);
    }
}
