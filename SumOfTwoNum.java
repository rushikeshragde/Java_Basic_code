import java.util.Scanner;
public class SumOfTwoNum {
    public static void main(String []args){

        int a,b,Sum;
        System.out.print("Enter any two number: ");
        Scanner sc = new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();
        Sum = a+b;
        System.out.print(a +" + "+b +" ="+ Sum);

    }
}