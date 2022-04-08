public class Main{
    public static void main(String[] args) {
        Person person = new Person("Rayan S","Canadian", "1/1/11", 5);
        person.passport = new String[]{person.name, person.nationality, person.year};

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.year);
        System.out.println(person.passport);
        System.out.println(person.seatNumber);
        
    }
}