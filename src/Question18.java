import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter a number");
        int i= ss.nextInt();
        do{System.out.println(i);
            i=i+1;}
        while(i<5);
    }
}
