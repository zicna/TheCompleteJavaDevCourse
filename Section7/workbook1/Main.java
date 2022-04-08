import java.util.Arrays;

public class Main{
    // public static void main(String[] args) {
    //     Person person = new Person("Rayan S","Canadian", "1/1/11", 5);
    //     // person.passport = new String[]{person.name, person.nationality, person.year};

    //     Person person2 = new Person(person);

    //     person2.setSeatNumber(11);
    //     person2.setName("Brayan S");

    //     person.chooseSeat();;
    //     System.out.println(person.getName());
    //     System.out.println(person.getNationality());
    //     System.out.println(person.getYear());
    //     System.out.println(person.getSeatNumber());
        
    //     if(person.applyPassport()){
    //         System.out.println("Congratulations "+person.getName()+". Your passport was approved!");
    //     }else{
    //         System.out.println("We're sorry "+person.getName()+". We cannot process your application.");

    //     }

    //     System.out.println(person2.getName());
    //     System.out.println(person2.getNationality());
    //     System.out.println(person2.getYear());
    //     System.out.println(person2.getSeatNumber());

        
    // }

    public static void main(String[] args) {

        Person person = new Person("Milan Zivkociv", "Serbian", "9/25/1987", 10); 
        if (person.applyPassport() == true) {

            person.setPassport(new String[] {person.getName(), person.getNationality(), person.getYear()});
    
            
        }
        System.out.println(person.toString());

        Person personOne = new Person(person);
        personOne.chooseSeat();
        personOne.setName("Ivan ZIvkovic");
        personOne.setPassport(new String[]{personOne.getName(), personOne.getNationality(), personOne.getYear()});

        System.out.println("Name: " + personOne.getName() + "\n" + 
    "Nationality: " + personOne.getNationality() + "\n" + 
    "Date of Birth: " + personOne.getYear() + "\n" +
    "Seat Number: " + personOne.getSeatNumber() + "\n" + "Passport: " +
     Arrays.toString(personOne.getPassport()) + "\n");

     }
}