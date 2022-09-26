import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int sum = 0;
        for(int i= 0;i<10;i++){
            System.out.println("Enter the number");
            sum=sum+ss.nextInt();
        }
        System.out.println("Sum is " + sum);
    }
}
