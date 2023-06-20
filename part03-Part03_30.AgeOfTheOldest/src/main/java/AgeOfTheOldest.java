
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        int max = 0;

        while (true) {

            String words = reader.nextLine();
            String[] pieces = words.split(",");

            if (words.isEmpty()) {
                break;
            }
            
            int num = Integer.valueOf(pieces[1]);
            
            if (max < num) {
                max = num;
            }

        }

        System.out.println("Age of the oldest: " + max);
    }
}