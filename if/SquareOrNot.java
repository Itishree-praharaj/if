import java.util.Scanner;

public class SquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        int l=sc.nextInt();
        int b=sc.nextInt();
        if(l==b){
            System.out.println("It is a square");
        }
        else{
            System.out.println("It is not a square");
        }
    }
}
