
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String array = scanner.nextLine();
            String[] pieces = array.split(" ");

            for (int i = 0; i < pieces.length; i++) {
                
                if (pieces[i].contains("av")) {
                    System.out.println(pieces[i]);
                }
                

            }

            if (array.equals("")) {
                break;
            }

        }
    }
}
