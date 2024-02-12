import java.util.Scanner;

public class InputIsAlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything");
        char c = sc.next().trim().charAt(0);
        if((c>=97 && c<=122)||(c>=65 && c<=90)){
            System.out.println("It is an aplbhabet");
        }
        else{
            System.out.println("It is not an alphabet");
        }
    }
}
