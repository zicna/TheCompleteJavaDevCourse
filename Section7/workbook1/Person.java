public class Person{

    private String name;
    private String nationality;
    private String year;
    private String[] passport;
    private int seatNumber;

    Person(String name, String nationality, String year, int seatNumber){

        this.name = name;
        this.nationality = nationality;
        this.year = year;
        this.seatNumber = seatNumber;
    }

    Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.year = source.year;
        this.seatNumber = source.seatNumber;
    }
public String getName(){
    return this.name;
}
public void setName(String name){
    this.name = name;
}
public String getNationality(){
    return this.nationality;
}
public void set(String nationality){
    this.nationality = nationality;
}
public String getYear(){
    return this.year;
}
public void setYear(String year){
    this.year = year;
}
public int getSeatNumber(){
    return this.seatNumber;
}
public void setSeatNumber(int seatNumber){
    this.seatNumber = seatNumber;
}
    
}