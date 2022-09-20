import java.util.Scanner;

public class Boards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the first marks");
        int a = input.nextInt();
        System.out.println("enter the second marks");
        int b = input.nextInt();
        System.out.println("enter the third marks");
        int c = input.nextInt();
        System.out.println("enter the fourth marks" );
        int d = input.nextInt();
        System.out.println("enter the fifth marks");
        int e = input.nextInt();
        int g = (a+b+c+d+e)*100/500;
        System.out.println(g);

    }
}
