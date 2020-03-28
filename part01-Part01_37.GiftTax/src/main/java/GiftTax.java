
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double value = Double.valueOf(scan.nextLine());
        
        if (value < 5000) {
            System.out.println("No tax!");
        } else {
            System.out.print("Tax: " + calcTax(value));
        }
    }
    
    public static double calcTax(double value) {
        double tax = 0.00;
        
        if (value >= 1000000) {
            tax = (142100 + (value - 1000000) * .17);
        } else if (value >= 200000 && value < 1000000) {
            tax = (22100 + (value - 200000) * .15);
        } else if (value >= 55000 && value < 200000) {
            tax = (4700 + (value - 55000) * .12);
        } else if (value >= 25000 && value < 55000) {
            tax = (1700 + (value - 25000) * .10);
        } else {
            tax = (100 + (value - 5000) * .08);
        }
        
        return tax;
    }
}
