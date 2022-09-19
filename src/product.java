import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number1");
        float num1 = sc.nextFloat() ;
        System.out.println("Number2");
        float num2 = sc.nextFloat();
        float product = num1*num2;
        System.out.println(product);


    }
}
