import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter name");
        String a = ss.nextLine();
        System.out.println("Roll number");
        String b = ss.next();
        System.out.println("Field of interest");
        String c = ss.next();
        System.out.println("Hey,my name is " + a + " and my roll number is "+ b  + ".My Field of interest are " +c );

    }
}
