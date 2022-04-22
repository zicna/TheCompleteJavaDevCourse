package test;

import main.models.Cart;
import main.models.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CartTest{

    Cart cart;

    @Before
    public void setup(){
        cart = new Cart();
        cart.add(new Item("Pepsi", 1.99));
        cart.add(new Item("Crush", 1.99));
    }

    @Test
    public void itemAddedTest(){
        assertTrue(cart.contains(new Item("Pepsi", 1.99)));
    }

    @Test
    public void skipsDuplicate(){
        assertFalse(cart.add(new Item("Pepsi", 1.99)));
    }

    @Test
    public void removedItemTest(){
        cart.remove("Pepsi");
        assertFalse(cart.contains(new Item("Pepsi", 1.99)));
        // assertTrue(cart.remove("Pepsi"));
    }

    @Test
    public void subtotalIsValid(){
        assertTrue(cart.getSubtotal() == 3.98);
    }

    @Test 
    public void taxIsValid(){
        assertEquals(cart.getTax(), 0.5174);
    }

    @Test
    public void totalIsValid(){
        assertEquals(cart.getTotal(), (cart.getTax() + cart.getSubtotal()));
    }
}