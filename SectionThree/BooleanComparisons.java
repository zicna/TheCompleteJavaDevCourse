public class BooleanComparisons{
    public static void main(String[] args){

        boolean comparison = 5 < 1;
        boolean comparisonTwo = 5 < 1;
        
        // *comparison on integers
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;

        System.out.println(biologyGrade > chemistryGrade);
        System.out.println(biologyGrade >= englishGrade);

        // * comparison of decimals
        double sales = 37.55;
        double costs = 5.55;
        System.out.println(sales > costs);

        // *  "=="

        System.out.println(chemistryGrade == englishGrade);

        String sentence = "I love this course!";
        String sentenceTwo = "I love this course";
        System.out.println("Strings are equals: " + !sentence.equals(sentenceTwo));

    }
}