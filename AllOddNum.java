import java.util.Scanner;
public class AllOddNum{
    public static void main(String []args){
      
        int n;
        System.out.print("Enter any numbers: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            if(n % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}