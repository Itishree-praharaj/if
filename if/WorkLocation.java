import java.util.Scanner;

public class WorkLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int a = sc.nextInt();
        System.out.println("Enter your gender M/F");
        char g = sc.next().trim().charAt(0);
        System.out.println("Enter Martial Status M/U");
        char m = sc.next().trim().charAt(0);
        if(g=='F'){
            System.out.println("Urban area");
        }
        else if((g=='M') && (a>=20 && a<=40)){
            System.out.println("Work Anywhere");
        }
        else if((g=='M')&&(a>40 && a<=60)){
            System.out.println("Urban Area");
        }
        else 
        {
            System.out.println("ERROR");
        }
    }
}
