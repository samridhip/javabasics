import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = ss.nextInt();
        int d= n-1;
        for(int i = 1; i>n-1;i++){
            System.out.println(i);
        }
    }
}
