import java.util.Scanner;

public class NoOfDaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year ");
        int yr = sc.nextInt();
        System.out.println("Enter the month no.");
        int a =sc.nextInt();
        if(a%2!=0 || a==8){
            System.out.println("31 Days");
        }
        else if(a==2){
            if((yr%400==0) || (yr%4==0 && yr%100 !=0)){
                System.out.println("29 days");
            }
            else{
                System.out.println("28 days");
            }
        }
        else{
            System.out.println("30 days");
        }
    }
}
