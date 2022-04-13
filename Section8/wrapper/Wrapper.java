public class Wrapper{
    public static void main(String[] args) {
        int wholeNumber = 5;
        // Integer wholeNumberOne = new Integer(5); //this is long version and it's been deprecated
        Integer wholeNumberOne = 5;
        Integer wholeNumberTwo = wholeNumberOne;
        wholeNumberTwo = 10;

        // long largeWholeNumber = 5000000000L;
        Long largeWholeNumber = new Long(5000000000L);
        // double decimal = 5.493;
        Double decimal = 5.493;
        // char letter = 'b';   
        Character letter = new Character('b');
    }
}