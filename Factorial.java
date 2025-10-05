import java.util.Scanner;
public class Factorial{
    public static void main(String []args){

        int i,n, fact = 1;
        System.out.println("Enter any numbers: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(n+ " number factorial is : "+ fact);
    }
}