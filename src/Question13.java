import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner character = new Scanner(System.in);
        System.out.println();
        char a = character.next().charAt(0);
        if(a>=65&&a<=90){
            System.out.println( "Uppercase");
        }
        else if(a<=122&&a>=97){
            System.out.println("Lowercase");
        }
        else{
            System.out.println();
        }
    }
}
