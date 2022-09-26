import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        for(int i = 0; i<4;i++){
            System.out.print('*');
        }
        System.out.println();
        for(int i = 0; i<3;i++){
            System.out.print('*');
        }
        System.out.println();
        for(int i = 0; i<2;i++){
            System.out.print('*');
        }
        System.out.println();
        for(int i = 0; i<1;i++){
            System.out.print('*');
        }

        System.out.println("----------------------");

        for (int i=0;i<4;i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }



    }
}
