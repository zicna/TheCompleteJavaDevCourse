package models;

import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

// We can describe each movie using six fields: name, format, rating, sellingPrice, rentalPrice, and isAvailable.

public class Movie{
    private String name;
    private String format;
    private double rating;
    private boolean isAvailable;
    private double sallingPrice;
    private double rentalPrice;

    public Movie(String name, String format, double rating){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("name cannot be null or blank");
        }
        if(! (format.equalsIgnoreCase("Blue-Ray") || format.equalsIgnoreCase("DVD"))){
            throw new IllegalArgumentException("format must be 'Blue-Ray' or 'DVD'");
        }
        if(format == null || format.isBlank()){
            throw new IllegalArgumentException("format cannot be null or blank");
        }
        if(rating < 0 || rating > 10){
            throw new IllegalArgumentException("rating must be btween 0 and 10");
        }
        this.name = name;
        this.format = format;
        this.rating = rating;
        this.isAvailable = true;
        this.sallingPrice = setSellingPrice();
        this.rentalPrice = setRentalPrice();
    }

    public Movie(Movie source){
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
        this.isAvailable = source.isAvailable;
        this.sallingPrice = source.sallingPrice;
        this.rentalPrice = source.rentalPrice;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("name cannot be null or blank");
        }
        this.name = name;
    }

    public void setFormat(String format) {
        if(format == null || format.isBlank()){
            throw new IllegalArgumentException("format must be 'Blue-Ray' or 'DVD'");
        }
        if(!format.equalsIgnoreCase("Blue-Ray") || !format.equalsIgnoreCase("DVD")){
            throw new IllegalArgumentException("format must be 'Blue-Ray' or 'DVD'");
        }
        this.format = format;

    }public void setRating(double rating) {
        if(rating < 0 || rating > 10){
            throw new IllegalArgumentException("rating must be btween 0 and 10");
        }
        this.rating = rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    private double setSellingPrice(){
        return this.format.equals("Blue-Ray") ? 4.25 : 2.25;
    }

    private double setRentalPrice(){
        return this.format.equals("Blue-Ray") ? 1.99 : 0.99;
    }

    public String toString(){
        return "\t Name: " + this.name + "\n" +

        "\t Format: " + this.format + "\n" +
        
        "\t Rating: " + this.rating + "\n" +
        
        "\t Selling Price: " + this.sallingPrice + "\n" +
        
        "\t Rental Price: " + this.rentalPrice + "\n" +
        
        "\t Availability: " + (this.isAvailable ? " in-stock" : "rented") + "\n";
    }




}