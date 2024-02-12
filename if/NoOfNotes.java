import java.util.Scanner;

public class NoOfNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount should be in multiple of 100 ");
        System.out.println("Enter the amount ");
        int a = sc.nextInt();
        if(a>=2000){
            System.out.println("2000 * "+(a/2000));
            a=a%2000;
        }
        if(a>=500){
            System.out.println("500 * "+(a/500));
            a=a%500;
        }
        if(a>=200){
            System.out.println("200 * "+(a/200));
            a=a%200;
        }
        if(a>=100){
            System.out.println("100 * "+(a/100));
        }
    }
}
