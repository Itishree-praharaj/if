import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println("B is greatest");
        } else if (a > b) {
            System.out.println("A is greatest");
        } else {
            System.out.println("Both are equal");
        }
    }
}
