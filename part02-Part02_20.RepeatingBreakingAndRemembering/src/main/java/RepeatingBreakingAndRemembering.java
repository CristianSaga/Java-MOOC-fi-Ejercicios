
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum, total, odd, even;
        double avg;
        sum = 0;
        total = 0;
        avg = 0;
        odd = 0;
        even = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num != -1) {
                sum += num;
                total++;

                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

            } else {
                break;
            }

            avg = (double) sum / total;

        }

        System.out.println("thx bye");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
         /*
         
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num = 0;
        int even = 0;
        int odd = 0;
        double fact = 0;
        
        while (true) {
            System.out.println("Give numbers:");
            int n = Integer.parseInt(scanner.nextLine());
            
            if (n == -1) {
                break;
            }
            
            fact = n%2;
            
            if (fact == 1) {
                odd++;
            } else {
                even++;
            }
            
            sum += n;
            num++;
        }

        double avg = (double)sum / num;
        System.out.println("Thx! Bye! " + "\nSum: " + sum + "\nNumbers: " + num + "\nAverage: " + avg + "\nEven: " + even + "\nOdd: " + odd);
        */
    }
}