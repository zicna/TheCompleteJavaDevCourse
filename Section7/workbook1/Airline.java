public class Airline{
    Person[] seats;

    Airline(){
        this.seats = new Person[11];
    }

    public Person getPerson(int index){
        return new Person(this.seats[index]);
    }
    
    public void setPerson(Person person, int index){
        this.seats[person.getSeatNumber() -1] = new Person(person);
    }

    public void createReservation(Person person){
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ". \n");
    }


}