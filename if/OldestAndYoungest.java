import java.util.Scanner;

public class OldestAndYoungest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three ages");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int old = 0;
        int youngest = 0;
        if (a > b) {
            old = a;
            youngest = b;
            if (c > a) {
                old = c;
            }
        } else if (b > c) {
            old = b;
            youngest = c;
            if (a > b) {
                old = a;
            }
        } else if (c > a) {
            old = c;
            youngest = a;
            if (b > c) {
                old = b;
            }
        }
        System.out.println("youngest = "+youngest);
        System.out.println("Oldest = "+old);
    }
}
