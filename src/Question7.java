import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the First number");
        int first= number.nextInt();
        System.out.println("Enter the second number");
        int second= number.nextInt();
        if(first>second){
            System.out.println(first);
        }
        if(second>first){
            System.out.println(second);
        }
    }
}
