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
        if(name == null || name.isBlank()){
            throw  new IllegalArgumentException("name is null OR blank.");
        }
        if(phoneNumber == null || phoneNumber.isBlank()){
            throw new IllegalArgumentException("phoneNumber is null OR blank.");
        }
        if(phoneNumber.length() < 5){
            throw new IllegalArgumentException("phoneNumber length is less than 5.");
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;

        this.age = toAge(birthDate);
    }

    public Contact(Contact source){
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()){
            throw  new IllegalArgumentException("name is null OR blank.");
        }
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber == null || phoneNumber.isBlank()){
            throw new IllegalArgumentException("phone number is null OR blank.");
        }
        if(phoneNumber.length() < 5){
            throw new IllegalArgumentException("phone number length is less than 5.");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) throws ParseException{
        this.birthDate = birthDate;
        this.setAge(toAge(birthDate));
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int toAge(String birthDate) throws ParseException{
        SimpleDateFormat formater = new SimpleDateFormat("MM/dd/yyyy");
        formater.setLenient(false);
        long milliBirthDate = formater.parse(birthDate).getTime();
        long milliToDate = new Date().getTime();
        long days = TimeUnit.MILLISECONDS.toDays(milliToDate - milliBirthDate);

        return (int)(days / 365);
    }

    public String toString(){
        return "Name: " + this.name + "\n" +

                "Phone number: " + this.phoneNumber + "\n" +

                "Birth Date: " + this.birthDate + "\n" +

                "Age: " + this.age + " year old\n";
    }
}