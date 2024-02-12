import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println("The number is an even number");
        }        
        else{
            System.out.println("The number is an odd number");
        }
        evenOrOddUsingBitwiseOperator();
    }
    public static void evenOrOddUsingBitwiseOperator(){
        System.out.println("Checking even or odd using bitwise operator");
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = Sc.nextInt();
        if((a&1)==0){
            System.out.println("This is an even number");
        }
        else{
            System.out.println("This is an odd number");
        }
    }
}
