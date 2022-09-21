import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Length of the rectangle");
        Double a = ss.nextDouble();
        System.out.println("Breadth of the rectangle");
        Double b = ss.nextDouble();
        Double c = a*b;
        System.out.println(c);

    }
}
