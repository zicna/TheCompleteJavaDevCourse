public class Beer{
    public static void main(String[] args) {
        for(int i = 99; i >= 1; i--){
            name(i);
        }
    }

    public static void name(int num){
        System.out.println(num + " bottles of beer on the wall, " + num + " bottles of beer!");
        System.out.println("take one down, pass it around, "+(num -1)+" bottles of beer on the wall!");
    }
}