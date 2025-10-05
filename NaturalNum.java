import java.util.Scanner;
public class NaturalNum{
    public static void main(String []args){

        int n, sum=0;
        System.out.print("Enter any numbers: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
           
        System.out.print(i+ " ");
        }
    }
}