package buffered_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        try(
            FileInputStream myFile = new FileInputStream("numbers.dat");
            BufferedInputStream buff = new BufferedInputStream(myFile);
            ){

            while(true){
                int byteValue = buff.read();
                System.out.println(byteValue + " ");
                if(byteValue == -1){
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}