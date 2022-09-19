import java.util.Scanner;

public class name {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter First name: ");
        String firstname = sc.next();


        System.out.println("Enter Last name: ");
        String lastname = sc.next();

        String fullname = firstname+lastname;
        System.out.print("My Full name is : "+ fullname);
    }
}
