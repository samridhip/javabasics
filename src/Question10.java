import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner grades= new Scanner(System.in);
        System.out.println("What's your Marks?");
        int x = grades.nextInt();
        if(x<25){
            System.out.println("F");
        }
        if(x>25&&x<45){
            System.out.println("E");
        }
        if(x>45&&x<50){
            System.out.println("D");
        }
        if(x>50&&x<60){
            System.out.println("C");
        }
        if(x>60&&x<80){
            System.out.println("B");
        }
        if(x>80){
            System.out.println("A");
        }
    }
}
