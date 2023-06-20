
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int answer = Integer.parseInt(scanner.nextLine());
            
            if (answer == 0) {
                break;
            }
            
            if (answer < 0){
                number = number + 1;
            }
        }
        
        System.out.println("Number of negative numbers: " + number);
    }
}
