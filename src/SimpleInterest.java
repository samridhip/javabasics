import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle:");
        int principle = sc.nextInt() ;
        System.out.println("Enter Rate:");
        int rate = sc.nextInt();
        System.out.println("Enter Time:");
        int time = sc.nextInt();
        System.out.println("Simple Interest = ");
        int si = principle*rate*time/100;
        System.out.print(si);
    }
}
