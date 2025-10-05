import java.util.Scanner;

class EvenOdd{
    public static void main(String []args){
        
        int n;
        System.out.print("Enter any number:  ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        if(n % 2==0){
            System.out.println(n + " This is Even number: ");
        }else{
            System.out.println(n + " This is odd number: ");
        }
    }
}