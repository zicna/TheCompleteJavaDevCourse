public class Exams{
    public static void main(String[] args) {
        System.out.println("It's time to take your 5th year exams. Please, take your seats.\n");
        String[] students = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};

        for(int i =0; i<students.length; i++){
            System.out.println("Student " + students[0] + ", you will take seat " + i);
        }
    }
}