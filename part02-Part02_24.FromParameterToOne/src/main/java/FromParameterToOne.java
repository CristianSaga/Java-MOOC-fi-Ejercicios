

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(4);
    }

    public static void printFromNumberToOne(int number) {
        
        int d = 1;
        while (d <= number) {
            System.out.println(number);
            number--;
        }
    }
}
