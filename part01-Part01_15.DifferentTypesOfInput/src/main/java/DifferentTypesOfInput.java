
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String string = scan.nextLine();
        System.out.println("Give an integer:");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double:");
        double num2 = Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean value = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + string +
                "\nYou gave the integer " + num1 +
                "\nYou gave the double " + num2 +
                "\nYou gave the boolean " + value );

    }
}
