import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter a number");
        int a = ss.nextInt();
        while(a<10) {
            System.out.println(a);
            a=a+1;
        }
    }
}
