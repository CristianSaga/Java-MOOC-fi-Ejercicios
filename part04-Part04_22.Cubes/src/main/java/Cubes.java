
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(line);
            int cube = number * number * number;
            System.out.println(cube);
        }
        
        
    }
}
