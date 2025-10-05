import java.util.Scanner;
public class CharInputFromU{
    public static void main(String []args){

        char ch;
        System.out.println("Enter any charactor :");
        Scanner sc = new Scanner(System.in);

        ch=sc.next().charAt(0);
        System.out.println(ch);
    }
}