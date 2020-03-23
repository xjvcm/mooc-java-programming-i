
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // Write your program here
        
        // Declare variable to hold user's input
        String message = scanner.nextLine();
        
        // for loop to print statement 3 times
        for (int i = 0; i < 3; i++) {
            System.out.println(message);
        }
    }
}
