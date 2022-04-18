import models.Product;
import models.Shirt;
import models.Pants;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {

        Shirt product = new Shirt(Shirt.Size.SMALL, 19.99,  "RED", "NIKE");

        Shirt productOne = new Shirt(product);

        Pants pants = new Pants(32, 129.99, "INDIGO", "VERSACE");

        System.out.println(product.equals(productOne));
        pants.discount();
        System.out.println(pants);
    

    }
  
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
}
