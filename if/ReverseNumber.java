import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        int rev=0;
        while(a>0){
            int r = a%10;
            rev=(rev*10)+r;
            a/=10;
        }
        System.out.println(rev);
    }
}
