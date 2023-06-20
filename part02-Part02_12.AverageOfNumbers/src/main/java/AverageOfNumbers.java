
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double input = 0;
        double d = 0;
        
        while (true) {
            
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            
            if (number == 0) {
                break;
            } else {
                sum += number;
                input = input +1;
                d = sum / input;
            }
        }
        System.out.println("Average of the numbers: " + d);
    }
}
