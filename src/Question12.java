import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner attendence = new Scanner(System.in);
        System.out.println("Number of class held");
        int a = attendence.nextInt();
        System.out.println("Number of class attended");
        int b = attendence.nextInt();
        double c = ((b*100)/a);
        System.out.println(c);
        System.out.println("Any medical condition?");
        char d = attendence.next().charAt(0) ;
        if (c>75&&d=='y') {
            System.out.println("You are having " + c +"% , hence allowed");
        } else {
            System.out.println("Not allowed");
        }
    }
    }

