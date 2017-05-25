import java.util.Scanner;

/**
 * Created by cstoker on 5/25/17.
 */
public class ContactManager {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

            int response;

        do {

            System.out.println("1. View contacts. 2. Add a new contact." +
                    "3. Search a contact by name." +
                    "4. Delete an existing contact." +
                    "5. Exit." + "Enter an option (1, 2, 3, 4 or 5):");

           response = scan.nextInt();

        } while(response != 5);


    }

}
