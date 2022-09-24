import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner square = new Scanner(System.in);
        System.out.println("Enter the length");
          int length = square.nextInt();
             System.out.println("Enter the breadth");
               int breadth = square.nextInt();
                if(length==breadth){
                    System.out.println("It is a square");

                }
                    else{System.out.println("It's not a square" );
                }

    }

}
