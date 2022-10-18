import java.util.Scanner;

public class Nestedloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++)
                System.out.print(i + "" + j);
            System.out.println();
        }
    }
}
