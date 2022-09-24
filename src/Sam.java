import java.util.Scanner;

public class Sam {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = data.nextLine();
        System.out.println("Enter your age");
        int age = data.nextInt();
        System.out.println("Enter your marks");
        double marks = data.nextDouble();
        if (age >= 17 && age <= 21 && marks >=80 ) {
            System.out.println("The student is eligible");
        }
        else{
                    System.out.println("The student is not eligible");

            }
        }
    }



