public class Main{
    public static void main(String[] args) {
        DaysOfTheWeek monday = DaysOfTheWeek.MONDAY;

        System.out.println(monday);

        for (DaysOfTheWeek day : DaysOfTheWeek.values()) {
            System.out.println(day);
        }

        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness);
    }
}