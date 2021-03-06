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

    public Movie getMovie(String name){
        for (int i = 0; i < movies.size(); i++) {
            if(this.movies.get(i).getName().equals(name)){
                return new Movie(this.movies.get(i));
            }
        }
        return null;
    }

    public void setMovie(int index, Movie movie){
        movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie){
        movies.add(new Movie(movie));
    }

    public void action(String name, String action){
        if(movies.isEmpty()){
            throw new IllegalStateException("Store not in valid state to perform action");
        }
        if(!(action.equals("sell") || action.equals("rent") || action.equals("return"))){
            throw new IllegalArgumentException("action must be sell, rent or return.");
        }
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be blank or null");
        }
        for (int i = 0; i < movies.size(); i++) {
            if(movies.get(i).getName().equals(name)){
                switch(action){
                    case "sell": 
                        if(!movies.get(i).isAvailable()){
                            throw new IllegalStateException("cannot sell movie theat is not avaiable");
                        }
                    movies.remove(i);break;
                    case "rent": 
                        movies.get(i).setIsAvaiable(false);break;
                    case "return":
                        movies.get(i).setIsAvaiable(true);break;
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