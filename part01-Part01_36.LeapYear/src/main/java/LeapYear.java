
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean leap = false;
        
        System.out.print("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            leap = true;
        }
        
        System.out.println("The year is " + (leap ? "" : "not ") + "a leap year.");
    }
}
