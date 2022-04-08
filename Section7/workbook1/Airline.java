public class Airline{
    Person[] seats;

    Airline(){
        this.seats = new Person[11];
    }

    public Person getPerson(int index){
        return new Person(this.seats[index]);
    }
    
    public void setPerson(Person person, int index){
        this.seats[index] = new Person(person);
    }


}