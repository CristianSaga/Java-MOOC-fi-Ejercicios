
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word:");
        String word = scanner.nextLine();
        
        // Write your program here

        System.out.print(word + word + word);
    }
}
