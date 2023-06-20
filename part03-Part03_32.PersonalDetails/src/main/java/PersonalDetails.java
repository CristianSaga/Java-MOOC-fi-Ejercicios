
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int max = 0;
        int sum = 0;
        int count = 0;
        double avg = 0;
        String great = "";
        while (true) {

            String words = reader.nextLine();
            String[] pieces = words.split(",");

            if (words.isEmpty()) {
                break;
            }

            int num = pieces[0].length();

            if (max < num) {
                max = num;
                great = pieces[0];
                
            }
            
            sum += Integer.valueOf(pieces[1]);
            count++;
            
        }
        
        avg = sum / (double) count;
        System.out.println("Longest name: " + great);
        System.out.println("Average of birth years: " + avg);
       
    }
}
