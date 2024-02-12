import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char c = sc.next().trim().charAt(0);
        if(c=='a' || c=='A' || c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='u'||c=='U'){
            System.out.println("Input is a vowel");
        }
        else{
            System.out.println("Input is consonant");
        }
    }
}
