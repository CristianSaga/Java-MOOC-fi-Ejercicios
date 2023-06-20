
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String array = scanner.nextLine();
            String[] pieces = array.split(" ");

            if (array.equals("")) {
                break;
            }
            int last = pieces.length - 1;
            System.out.println(pieces[last]);

        }

    }
}
