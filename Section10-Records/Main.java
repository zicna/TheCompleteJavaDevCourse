class Main{
    public static void main(String args[]) {

        // * if you would use args[]
        // try {
        //     System.out.println(args[0]);
            
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        StudentClass student = new StudentClass(1, "John Do");
        StudentClass studentOne = new StudentClass(1, "John Do");

        System.out.println(student.equals(studentOne));

        StudentRecord stud = new StudentRecord(1, "Jane Do");

        System.out.println(stud.name());
        System.out.println(stud.nameToUpperCase());
        System.out.println(StudentRecord.greeting());
    }
}