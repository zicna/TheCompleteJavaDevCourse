import models.Contact;
import models.ContactManager;

import java.text.ParseException;

public class Main {
    public static void main(String[] args){
        try {
            Contact milan = new Contact("Milan", "614-400-4944", "09/25/1987");
            milan.setBirthDate("09/25/1993");
            System.out.println(milan);
            
            ContactManager cm = new ContactManager();
            cm.addContact(new Contact("Ryan", "6135012424", "11/11/1992"));
            cm.addContact(new Contact("Gio", "6477092344", "11/11/1993"));
            cm.addContact(new Contact("Thomas", "8192256979", "11/11/1994"));
            System.out.println(cm);
            cm.removeContact("Gio");
            System.out.println(cm);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Progress Complete");
        }


        // System.out.println(milan);


    }

    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */



    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */

}
