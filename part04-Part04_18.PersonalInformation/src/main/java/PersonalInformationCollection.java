
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<PersonalInformation> collection = new ArrayList<>();
        
        
        while (true) {
            
            System.out.println("First name:");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("Last name:");
            String last = scanner.nextLine();
            System.out.println("Identification number:");
            String ident = scanner.nextLine();
            
            collection.add(new PersonalInformation(name,last,ident));
            
            
        }
        
        
        for (PersonalInformation personalInformation : collection) { 
            System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName());
        }
    }
}