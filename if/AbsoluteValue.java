import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a= sc.nextInt();
        if(a>=0){
            System.out.println("The absolute value is "+a);
        }
        else{
            System.out.println("The absolute value is "+(a*-1));
        }
    }
}
