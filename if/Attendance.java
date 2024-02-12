import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of class held ");
        int a = sc.nextInt();
        System.out.println("Enter number of class attended ");
        int b = sc.nextInt();
        System.out.println("Do yo have any medial condition Enter Y/N");
        String s = sc.next();
        double perc = 100 * b / a;
        if (perc < 75) {
            if (s.charAt(0)=='Y') {
                System.out.println("You are allowed to sit in the exam");
            } else {
                System.out.println("You are not allowed to sit in the exam ");

            }
        } else {
            System.out.println("You are allowed to sit in the exam ");
        }
    }
}
