import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity");
        int q = sc.nextInt();
        int totalcost = q * 100;
        if (totalcost >= 1000) {
            int discount = (totalcost) - (totalcost * 10 / 100);
            System.out.println("The total cost after discount is " + discount);
        } else {
            System.out.println("total cost = " + totalcost);
        }
    }
}
