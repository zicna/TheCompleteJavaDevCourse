package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact{

    private String name;
    private int age;
    private String birthDate;
    private String phoneNumber;

    public Contact(String name, String phoneNumber, String birthDate) throws ParseException{
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        SimpleDateFormat formater = new SimpleDateFormat("MM/dd/yyyy");
        formater.setLenient(false); // must follow format from above
        long diff = new Date().getTime() - formater.parse(birthDate).getTime();
        this.age = (int)(TimeUnit.MILLISECONDS.toDays(diff) / 365);
    }
    


}