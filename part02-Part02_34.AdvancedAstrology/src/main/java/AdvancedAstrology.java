
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {

        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        int space = size - 1;
        for (int i = 1; i <= size; i++) {

            printSpaces(space);
            printStars(i);
            space--;
        }
    }

    public static void christmasTree(int height) {
        int space = height - 1;
        int stars = 1;
        for (int i = 1; i <= height; i++) {

            printSpaces(space);
            printStars(stars);
            space--;
            stars += 2;
        }

        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(10);
        System.out.println("---");
//        christmasTree(10);
    }
    
    /*
    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {

        int i = 1;
        int s = size - 1;
        while (i <= size) {
            printSpaces(s);
            printStars(i);
            i++;
            s--;
        }
    }

    public static void christmasTree(int height) {

        int j = 1;
        int h = 0;
        int s = height - 1;
        while (j <= height) {
            printSpaces(s);
            printStars(j + h);
            j++;
            s--;
            h++;

        }

        int counter = 0;
        while (counter < 2) {
            printSpaces(height - 2);
            printStars(3);
            counter++;
        }
    }
    */
}
