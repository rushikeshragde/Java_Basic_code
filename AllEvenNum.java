import java.util.Scanner;
public class AllEvenNum{
    public static void main(String []args){

        int n,i;
        System.out.print("Enter Any numbers: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        System.out.print("Even number between 1 and "+ n +" are: ");
        for(i=1; i<=n; i++){
            if(i % 2 == 0){
                System.out.print(i +" ");
            }
        }
    }
}