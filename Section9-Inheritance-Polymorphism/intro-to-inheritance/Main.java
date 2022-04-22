public class Main{
    public static void main(String[] args) {
        Person person = new Person("Zack", 27);
        Person personOne = new Person(person);
        Person personTwo = new Person(person);

        System.out.println("Equality: " + personOne.equals(person));
        System.out.println(personOne.hashCode());
        System.out.println(person.hashCode());
        System.out.println(person.toString());
        
    }
}