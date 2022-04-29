package byte_streams;
import java.io.FileInputStream;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        try (FileInputStream myFile = new FileInputStream("byte_streams/numbers.dat")){

            boolean control = false;

            while(!control){
                    int byteValue = myFile.read();
                    
                    if(byteValue == -1){
                        control = true;
                    } 
                    System.out.println(byteValue + " ");
            }
            
        } catch (IOException e) {
            System.out.println("exception is thrown " + e.getMessage());
        }
    }
}