import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        System.out.println(args[0]);

        HashMap<Character, Integer> countChar = new HashMap<>();
        char[] charArray = args[0].toCharArray();

        for (char c : charArray) {
            System.out.println(c);
            if(countChar.containsKey(c)){
                countChar.put(c, countChar.get(c) + 1);
            }else{
                countChar.put(c, 1);
            }
        }

        countChar.forEach((k,v) -> {
            System.out.println(k + ": " + v);
        });
    }
}