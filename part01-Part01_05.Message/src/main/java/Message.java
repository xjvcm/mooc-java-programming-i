
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        
        // Save user input
        String message = scanner.nextLine();
        
        // Print user message
        System.out.println(message);

    }
}
