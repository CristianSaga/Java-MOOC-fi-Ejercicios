
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String array = scanner.nextLine();
            String[] pieces = array.split(" ");

            System.out.println(pieces[0]);

            if (array.equals("")) {
                break;
            }

        }
    }
}
