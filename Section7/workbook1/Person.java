import java.util.Arrays;

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
        this.passport = new String[3];
    }

    Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.year = source.year;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.getPassport(), source.getPassport().length);
    }

    public String[] getPassport(){
        return Arrays.copyOf(this.passport, this.passport.length);
    }

    public void setPassport(String[] passport){
        this.passport = Arrays.copyOf(passport, passport.length);
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

    public boolean applyPassport(){
        int randNum = (int)(Math.random() * 2);
        boolean bool = randNum == 0 ? true : false;
        return bool;
    }
    public void chooseSeat(){
        int randNum = (int)(Math.random() * 11 + 1);
        this.setSeatNumber(randNum);
    }

    public String toString(){
        return "Name: " + this.getName() + "\n" + "Nationality: " + 
        this.getNationality() + "\n" + "Date of Birth: " + 
        this.getYear() + "\n" + "Seat Number: " +
        this.getSeatNumber() + "\n" + "Passport: " + 
        Arrays.toString(this.getPassport()) + "\n";
    }
    
}