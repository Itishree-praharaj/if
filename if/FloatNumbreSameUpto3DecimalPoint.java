import java.util.Scanner;

public class FloatNumbreSameUpto3DecimalPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 nums");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        int ar = (int)a*1000;
        int br = (int)b*1000;
        if(ar==br){
            System.out.println("Both numbers are same upto three dcimal numbers");
        }
        else 
        System.out.println("The numbers are not same upto three decimal points");
    }
}
