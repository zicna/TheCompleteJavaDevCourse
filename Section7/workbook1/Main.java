public class Main{
    public static void main(String[] args) {
        Person person = new Person("Rayan S","Canadian", "1/1/11", 5);
        // person.passport = new String[]{person.name, person.nationality, person.year};

        person.setSeatNumber(10);
        System.out.println(person.getName());
        System.out.println(person.getNationality());
        System.out.println(person.getYear());
        // System.out.println(person.getPassport);
        System.out.println(person.getSeatNumber());


        
    }
}