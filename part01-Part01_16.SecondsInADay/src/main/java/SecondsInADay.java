
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.parseInt(scanner.nextLine());
        int seconds = 86400;
        
        int result = days * seconds;
        System.out.println(result);
        
        
        


    }
}
