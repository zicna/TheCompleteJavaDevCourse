
public class Main{
    public static void main(String[] args) {
        
        System.out.println(ConsoleColors.RED + "Hello " + ConsoleColors.RESET );
      
        System.out.println(ConsoleColors.RED_BACKGROUND + "WORLD" + ConsoleColors.RESET);
        ConsoleColors newColor = new ConsoleColors("milan");
        System.out.println(newColor.name);
        
    }
}