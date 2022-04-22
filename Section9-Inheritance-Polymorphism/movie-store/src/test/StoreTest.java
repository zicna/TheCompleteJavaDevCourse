
package test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.models.Store;
import main.models.Movie;


public class StoreTest{

    Store store;

    @Before
    public void setup(){
        store = new Store();
        store.addMovie(new Movie("The Shawshank Redemption", "Blue-Ray", 9.2));
        store.addMovie(new Movie("The Godfather", "Blue-Ray", 9.1));
    }

    @Test
    public void moviedAdded(){
        assertTrue(store.contains(new Movie("The Godfather", "Blue-Ray", 9.1)));
    }

    @Test
    public void sellMovieTest(){
        store.sellMovie("The Godfather");
        assertFalse(store.contains(new Movie("The Godfather", "Blue-Ray", 9.1)));
    }

    @Test
    public void rentMovieTest(){
        store.rentMovie("The Shawshank Redemption");
        assertFalse(store.getMovie(0).isAvailable());
    }
    
    @Test
    public void returnMovieTest(){
        store.returnMovie("The Shawshank Redemption");
        assertTrue(store.getMovie(0).isAvailable());
    }

    @Test(expected = IllegalStateException.class)
    public void movieNotInStock(){
        store.rentMovie("The Godfather");
        store.sellMovie("The Godfather");
    }


    
}