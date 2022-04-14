package models;

import java.util.ArrayList;

public class Store{
    ArrayList<Movie> movies;

    public Store(){
        movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index){
        return new Movie(movies.get(index));
    }

    public void setMovie(int index, Movie movie){
        movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie){
        movies.add(new Movie(movie));
    }

    public void action(String name, String action){
        for (int i = 0; i < movies.size(); i++) {
            if(movies.get(i).getName().equals(name)){
                if(action.equals("sell")){
                    movies.remove(i);
                }else if(action.equals("rent")){
                    movies.get(i).setIsAvaiable(false);
                }else if(action.equals("return")){
                    movies.get(i).setIsAvaiable(true);
                }
            }
        }
    }

    // public void sellMovie(String movieName){
    //     for (int i = 0; i < movies.size(); i++) {
    //         if(movies.get(i).getName().equals(movieName)){
    //             movies.remove(i);
    //         }
    //     }
    // }
    
    // public void rentMovie(String movieName){
    //     for (int i = 0; i < movies.size(); i++) {
    //         if(movies.get(i).getName().equals(movieName)){
    //             movies.get(i).setIsAvaiable(false);
    //         }
    //     }
    // }

    // public void returnMovie(String movieName){
    //     for (int i = 0; i < movies.size(); i++) {
    //         if(movies.get(i).getName().equals(movieName)){
    //             movies.get(i).setIsAvaiable(true);
    //         }
    //     }
    // }

    public String toString(){
        String temp = "";
        for (int i = 0; i < movies.size(); i++) {
            temp += movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }
}