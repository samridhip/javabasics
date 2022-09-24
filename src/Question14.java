import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();
        for(;i>5;i=i-1){
            System.out.println(i);
        }
        System.out.println("Successful");
    }
}
