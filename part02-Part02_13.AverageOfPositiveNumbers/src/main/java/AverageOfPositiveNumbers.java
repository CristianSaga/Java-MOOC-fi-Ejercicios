
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double input = 0;
        double div = 0;
        
        while (true) {
            
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                sum += number;
                input = input +1;
                div = sum / input;
            }
            
            
        }
        
        if (input == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + div);
        }
       
    }
}
