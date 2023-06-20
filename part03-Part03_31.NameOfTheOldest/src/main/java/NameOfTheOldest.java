
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int max = 0;
        String great = "";
        while (true) {

            String words = reader.nextLine();
            String[] pieces = words.split(",");

            if (words.isEmpty()) {
                break;
            }

            int num = Integer.valueOf(pieces[1]);

            if (max < num) {
                max = num;
                great = pieces[0];
            }

        }

        System.out.println("Name of the oldest: " + great);

    }
}
