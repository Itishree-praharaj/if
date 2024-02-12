import java.util.Scanner;

public class CharacterIsLowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ");
        char c = sc.next().trim().charAt(0);
        if(c>=97){
            System.out.println("It is in lowerCase");
        }
        else{
            System.out.println("It is in Uppercase");
        }
    }
}
