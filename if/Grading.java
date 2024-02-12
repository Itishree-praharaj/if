import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark ");
        int m=sc.nextInt();
        if(m<25){
            System.out.println("F");
        }
        else if(m>=25 && m<45){
            System.out.println("E");
        }
        else if(m>=45 && m<50){
            System.out.println("D");
        }
        else if(m>=50 && m<60){
            System.out.println("C");
        }
        else if(m>=60 && m<80){
            System.out.println("B");
        }
        else if(m>=80 && m<=100){
            System.out.println("A");
        }
        else{
            System.out.println("Enter correct marks");
        }
    }
}
