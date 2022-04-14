import models.Contact;
import models.ContactManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    static ContactManager cm = new ContactManager();
    public static void main(String[] args){
        
        try {
            loadContacts("contacts.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("CONTACTS LOADED\n\n");
            System.out.println(cm);
            manageContacts();
        }

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

    public static void manageContacts(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Would you like to \n\ta) add another contact\n\tb) remove a contact \n\tc) exit");
            String choice = scan.nextLine();

            if(choice.equals("a")){
                System.out.print("\tName: ");
                String name = scan.nextLine();
                System.out.print("\tPhone Number: ");
                String phoneNumber = scan.nextLine();
                System.out.print("\tBirth Date: ");
                String birthDate = scan.nextLine();
                if(name.isBlank() || phoneNumber.isBlank() || birthDate.isBlank()){
                    System.out.println(("Input provided is not valid\n"));
                }else if(phoneNumber.length() < 5){
                    System.out.println(("Phone number Input provided is not valid\n"));
                }else{
                    try {
                        cm.addContact(new Contact(name, phoneNumber, birthDate));
                    } catch (ParseException e) {
                        System.out.println(e.getMessage());
                    }finally{
                        System.out.println("\n\n UPDATED CONTACTS");
                        System.out.println(cm);
                    }
                }
            }else if(choice.equals("b")){
                System.out.println("\nWho would you like to remove?");
                cm.removeContact(scan.next());
                System.out.println("\n\n UPDATED CONTACTS");
                System.out.println(cm);

            }else if(choice.equals("c")){
                System.out.println("Thak you have a good day!!");
                break;
            }else{
                System.out.println("wrong input");
                continue;
            }
        }
        scan.close();
    }




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


     public static void loadContacts(String fileName) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scan = new Scanner(fis);
        while(scan.hasNextLine()){
            try {
                cm.addContact(new Contact(scan.next(), scan.next(), scan.next()));
            } catch(ParseException e){
                System.out.println(e.getMessage());
            }

        }
        scan.close();
     }

}

// try {
        //     Contact milan = new Contact("Milan", "614-400-4944", "09/25/1987");
        //     milan.setBirthDate("09/25/1993");
        //     System.out.println(milan);
            
        //     cm.addContact(new Contact("Ryan", "6135012424", "11/11/1992"));
        //     cm.addContact(new Contact("Gio", "6477092344", "11/11/1993"));
        //     cm.addContact(new Contact("Thomas", "8192256979", "11/11/1994"));
        //     System.out.println(cm);
        //     cm.removeContact("Gio");
        //     System.out.println(cm);
        // } catch (ParseException e) {
        //     System.out.println(e.getMessage());
        // } finally{
        //     System.out.println("Progress Complete");
        // }
