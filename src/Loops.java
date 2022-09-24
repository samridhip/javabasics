import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner user= new Scanner(System.in);
        System.out.println("Type the number");
        int a = user.nextInt();
        for (int i =0;i<a;i=i+1){
            System.out.println(i);
        }
        System.out.println("yayyyyy");
    }
}
