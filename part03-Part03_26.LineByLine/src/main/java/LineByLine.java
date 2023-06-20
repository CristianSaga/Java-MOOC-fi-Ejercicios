
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String array = scanner.nextLine();
            String[] pieces = array.split(" ");

            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);

            }

            if (array.equals("")) {
                break;
            }

        }

    }
}
