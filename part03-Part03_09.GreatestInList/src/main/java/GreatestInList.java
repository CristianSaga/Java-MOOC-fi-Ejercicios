
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        int a = 0;
        int great = list.get(a);
        // implement finding the greatest number in the list here
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (great < number) {
                great = number;
            }    
        }    
        
        System.out.println("The greatest number: " + great);
    }
}
