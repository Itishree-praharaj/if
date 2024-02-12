import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary ");
        int s = sc.nextInt();
        System.out.println("Enter your years of experience");
        float f = sc.nextFloat();
        if(f>5){
            System.out.println("Bonus = "+(s*5/100));
        }
        else{
            System.out.println("Required years of experience not match");
        }
    }
}
