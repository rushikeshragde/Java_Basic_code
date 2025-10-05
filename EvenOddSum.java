import java.util.Scanner;
public class EvenOddSum{
    public static void main(String []args){
        
        int i, n, sum=0;
        System.out.println("Enter Range: ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        if(n % 2 ==0 ){
            for(i=0; i<=n; i++){
                if(i % 2==0 ){
                   sum = sum+i;
                }
            }
             System.out.print("Sum of all Even Numbers: "+ sum);
        }else{
            for(i=1; i<=n; i++){
                if(i % 2 != 0){
                    sum=sum+i;
                }
            }
           System.out.println("Sum of all Odd Numbers: "+ sum);
        }
    }
}