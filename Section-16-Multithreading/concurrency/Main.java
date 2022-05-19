import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;


public class Main {

    static final String SALES = "data/sales.csv"; //Use backslash Windows users

    static double furnitureSales;
    static double technologySales;
    static double officeSupplies;
    static double totalAverage;
    public static void main(String[] args) {
        
        try {
            Path path = Paths.get(Thread.currentThread().getContextClassLoader().getResource(SALES).toURI());

            int nThreads = Runtime.getRuntime().availableProcessors();
            ExecutorService executor = Executors.newFixedThreadPool(nThreads);

            Future<Double> futureFurniture = executor.submit(()-> average(path, "Furniture"));

            Future<Double> futureOffice = executor.submit(() -> average(path, "Technology"));

            Future<Double> futureTech = executor.submit(() -> average(path, "Technology"));

            Future<Double> futureTotal = executor.submit(() -> totalAverage(path));

            // Callable<Double> furniture = ()-> average(path, "Furniture");
            // FutureTask<Double> futureFurniture = new FutureTask<>(furniture); 
            // Thread threadOne = new Thread(futureFurniture);

            // FutureTask<Double> futureTech = new FutureTask<>(() -> average(path, "Technology"));
            // Thread threadTwo = new Thread(futureTech);

            // FutureTask<Double> futureOffice = new FutureTask<>(() -> average(path, "Office Supplies"));
            // Thread threadThree = new Thread(futureOffice);

            // FutureTask<Double> futureTotal = new FutureTask<>(() -> totalAverage(path));
            // Thread threadFor = new Thread(futureTotal);

            // threadOne.start();
            // threadTwo.start();
            // threadThree.start();
            // threadFor.start();

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your name to access the Global Superstore dataset: ");
            String name = scan.nextLine();
            try {
                // System.out.println(Runtime.getRuntime().availableProcessors()); 
                furnitureSales = futureFurniture.get();
                technologySales = futureTech.get();
                officeSupplies = futureOffice.get();
                totalAverage = futureTotal.get();
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e.getMessage());
            }finally{
                executor.shutdown();
            }

            System.out.println("\nThank you " + name + ". The average sales for Global Superstore are:\n");
            System.out.println("Average Furniture Sales: " + furnitureSales);
            System.out.println("Average Technology Sales: " + technologySales);
            System.out.println("Average Office Supplies Sales: " + officeSupplies);
            System.out.println("Total Average: " + totalAverage);
            scan.close();

            
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        } 
    }

    /**
     * Function name: average
     * @param path (Path)
     * @param category (String)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three String values.
     *   3. Filters every value by the @param category
     *   4. Maps every element in the stream to a double (price * quantity).
     *   5. Applies the terminal operation average.
     *   6. Returns the average as double.
     * 
     */

     public static Double average(Path path, String category) {
        //  if(Thread.currentThread().isInterrupted()){
        //      return 0.0;
        //  }
         try {
             
             return Files.lines(path)
                .skip(1)
                .map(line -> line.split(","))
                .filter(array -> array[0].equals(category))
                .mapToDouble(values -> Double.valueOf(values[1]) * Double.valueOf(values[2]))
                .average().getAsDouble();
         } catch (IOException e) {
             System.out.println(e.getMessage());
             return 0.0;
         }
     }



    /**
     * Function name: totalAverage
     * @param path (Path)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three values.
     *   3. Maps every element in the stream to a double: (price * quantity).
     *   4. Applies the terminal operation average.
     *   5. Returns the average as double.
     */

     public static Double totalAverage(Path path){
         try {
             return Files.lines(path)
                .skip(1)
                .map(line -> line.split(","))
                .mapToDouble(values -> Double.valueOf(values[1]) * Double.valueOf(values[2]))
                .average()
                .getAsDouble();
             
         } catch (IOException e) {
             System.out.println(e.getMessage());
             return 0.0;

         }
     }
  

}
