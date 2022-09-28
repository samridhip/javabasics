import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the name");
        String[] name = new String[2];
        for( int i = 0;i<2;i++ )
        {name[i]= ss.next();}
        for(int i = 0; i<name.length;i++)
        {System.out.println(name[i]);


    }
}}
