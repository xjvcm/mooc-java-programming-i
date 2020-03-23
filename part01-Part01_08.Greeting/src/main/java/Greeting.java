
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their name
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        
        // Print greeting with name
        System.out.println("Hi " + name);

    }
}
