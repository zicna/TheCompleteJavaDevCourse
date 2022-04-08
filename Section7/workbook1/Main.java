public class Main{
    public static void main(String[] args) {
        Person person = new Person("Rayan S","Canadian", "1/1/11", 5);
        // person.passport = new String[]{person.name, person.nationality, person.year};

        Person person2 = new Person(person);

        person2.setSeatNumber(11);
        person2.setName("Brayan S");

        person.setSeatNumber(10);
        System.out.println(person.getName());
        System.out.println(person.getNationality());
        System.out.println(person.getYear());
        // System.out.println(person.getPassport);
        System.out.println(person.getSeatNumber());

        System.out.println(person2.getName());
        System.out.println(person2.getNationality());
        System.out.println(person2.getYear());
        // System.out.println(person.getPassport);
        System.out.println(person2.getSeatNumber());

        
    }
}