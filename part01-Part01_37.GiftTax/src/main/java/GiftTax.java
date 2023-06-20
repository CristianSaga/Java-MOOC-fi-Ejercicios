
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("VALUE OF THE GIFT");
        double gift = Double.valueOf(scan.nextLine());
        double tax = 0;
        int taxLower = 100;

        if (gift >= 5000 && gift <= 25000) {
            tax = taxLower + (gift - 5000) * 0.08;
            System.out.println("TAX:" + tax);
        } else if (gift > 25000 && gift <= 55000) {
            taxLower = 1700;
            tax = taxLower + (gift - 25000) * 0.1;
            System.out.println("TAX:" + tax);
        } else if (gift > 55000 && gift <= 200000) {
            taxLower = 4700;
            tax = taxLower + (gift - 55000) * 0.12;
            System.out.println("TAX:" + tax);
        } else if (gift > 200000 && gift <= 1000000) {
            taxLower = 22100;
            tax = taxLower + (gift - 200000) * 0.15;
            System.out.println("TAX:" + tax);
        } else if (gift > 1000000) {
            taxLower = 142100;
            tax = taxLower + (gift - 1000000) * 0.17;
            System.out.println("TAX:" + tax);
        } else {
            System.out.println("no tax!");
        }

    }
}
