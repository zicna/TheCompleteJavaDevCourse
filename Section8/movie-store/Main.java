import models.Store;
import models.Movie;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n********************JAVA VIDEO STORE********************\n");

        Store movieStore = new Store();
        movieStore.addMovie(new Movie("The Godfather", "Blue-Ray", 9.1));
        movieStore.addMovie(new Movie("The Shawshank Redemption", "Blue-Ray", 9.2));
        movieStore.addMovie(new Movie("The Godfather: Part II", "DVD", 9));

        
        System.out.println(movieStore);
        movieStore.action("The Godfather", "sell");
        movieStore.action("The Shawshank Redemption", "rent");
        
        System.out.println(movieStore);
        movieStore.action("The Shawshank Redemption", "return");
        System.out.println(movieStore);
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

}
