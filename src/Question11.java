import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("What's your age tim?");
        int a= age.nextInt();
        System.out.println("What's your age Jessy?");
        int b = age.nextInt();
        System.out.println("what's your age vib? ");
        int c = age.nextInt();
        if(a>b&&b>c){
            System.out.println("The oldest user is Tim");
        }
        if(b>a&&a>c){
            System.out.println("The oldest user is Jessy");
        }
        if(c>a&&c>b){
            System.out.println("The oldest user is vib");
        }
        if(a<b&&b<c){
            System.out.println("The younger user is Tim");
        }
        if(b<a&&b<c){
            System.out.println("The youngest user is Jessy");
        }
        if(c<a&&c<b){
            System.out.println("The youngest user is vib");
        }
    }
}
