import models.Store;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import models.Movie;

public class Main {

    public static Store movieStore = new Store();
    public static void main(String[] args) {
        System.out.println("\n********************JAVA VIDEO STORE********************\n");
        
        try {
            loadMovies("movies.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("MOVIES LOADED\n\n");
            System.out.println(movieStore);
            manageMovies();
        }
    }

    /**
     * Name: manageMovies
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) purchase b) rent c) return d) exit.
     *   •        case a: ask for the name and sell.
     *   •        case b: ask for the name and rent.
     *   •        case c: ask for the name and return.
     *   • 3. call close() from the Scanner object.
     */

     public static void manageMovies(){
         Scanner scan = new Scanner(System.in);
         while(true){
             System.out.println("\nWould you like to \n\ta) purchase\n\tb) rent \n\tc) return.");
             String response = scan.nextLine();

             if(! (response.equals("a") || response.equals("b") || response.equals("c"))){
                 scan.close();
                 break;
             }

             System.out.println("Enter the name of the movie: ");
             String name = scan.nextLine();
             if(movieStore.getMovie(name) == null){
                System.out.println("\n\nThe input you provided is not valid. Please try again\n");
                continue;
             }

             switch(response){
                case "a": 
                if(!movieStore.getMovie(name).isAvailable()){
                    System.out.println("\n\n\nThe Movie is not avaiable for purchase. Please try again.");
                    continue;
                }
                movieStore.action(name, "sell");
                break;
                case "b": movieStore.action(name,"rent" ); break;
                case "c": movieStore.action(name,"return" ); break;
             }
             System.out.println("\n\nUPDATED MOVIES\n\n" + movieStore);
        }
        scan.close();
     }


    /**
     * Name: loadMovies
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads movies from <fileName>.txt.
     *   • 2. adds all movies to the store object's movie field.
     *        Hint: You will need to 'split' a String into three Strings.
     */

     public static void loadMovies(String fileName) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while(scanFile.hasNextLine()){
            String firstLine = scanFile.nextLine();

            String movieName = firstLine.split("--")[0];
            String format = firstLine.split("--")[1];
            double rating = Double.parseDouble(firstLine.split("--")[2]);
            
            movieStore.addMovie(new Movie(movieName, format, rating));
        }
        scanFile.close();
     }

}



// Store movieStore = new Store();
// movieStore.addMovie(new Movie("The Godfather", "Blue-Ray", 9.1));
// movieStore.addMovie(new Movie("The Shawshank Redemption", "Blue-Ray", 9.2));
// movieStore.addMovie(new Movie("The Godfather: Part II", "DVD", 9));


// System.out.println(movieStore);
// movieStore.action("The Godfather", "sell");
// movieStore.action("The Shawshank Redemption", "rent");

// System.out.println(movieStore);
// movieStore.action("The Shawshank Redemption", "return");
// System.out.println(movieStore);
