
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        System.out.println("How old are you?");
        
        if (number >=18) {
            System.out.println("You are an adult");
        } else { 
            System.out.println("You are not an adult");
        }
    }
}
