import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit");
        float unit = sc.nextFloat();
        double amount=0.0, sur_charge=0.0;
        int count = 0;
        double netamount=0.0;
        System.out.println(20.25+25.0);
        while (unit > 0) {
            if (count == 0) {
                System.out.println("1a"+50*0.50f);
                amount =amount+50*0.50f;
                unit-=50;
                //System.out.println("1a= "+amount);
            }
            if(count==1){
                System.out.println("2a"+unit*0.75f);
                amount=amount+unit*0.75f;
                unit-=150;
                //System.out.println("2a= "+amount);
            }
            if(count==2){
                amount+=unit*1.20f;
                unit-=250;
                System.out.println("3a= "+amount);
            }
            if(count==3){
                amount+=unit*1.50f;
                unit-=unit;
                System.out.println("4a= "+amount);
            }
            count++;
        }
        netamount=amount;
        sur_charge=amount*0.2f;
        amount=sur_charge+amount;
        System.out.println("net amount = "+netamount);
        System.out.println("The total amount is "+amount);
    }
}
