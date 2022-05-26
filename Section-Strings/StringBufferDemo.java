public class StringBufferDemo {
    public static void main(String[] args) {
        

        //* Strings 
        // String strOne = "Hello World";
        // String strTwo = "Hello World";

        // System.out.println(strOne == strTwo); //=> true

        // String strThree = new String("Hello World");
        // String strFor = new String("Hello World");

        // System.out.println(strThree == strFor); //=> false
        // System.out.println(strThree == strOne); //=> false

        // strThree = "Hello";
        // System.out.println(strThree == strFor); //=> false

        // strOne = "World";
        // System.out.println(strOne == strTwo); //=> false


        //* StringBuffer

        StringBuffer strBuffOne = new StringBuffer("Hello World");
        StringBuffer strBuffTwo = new StringBuffer("Hello World");

        System.out.println("Two string buffers are the same: " + (strBuffOne == strBuffTwo));
        
        strBuffOne = strBuffOne.append("changes have been maid");
        System.out.println("Two string buffers are the same: " + (strBuffOne == strBuffTwo));

        StringBuffer demo = new StringBuffer("hello");
        demo = new StringBuffer("world");
        System.out.println(demo);

    }
}
