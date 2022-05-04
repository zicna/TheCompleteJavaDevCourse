import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntSumStats{
    public static void main(String[] args) {
        sumStats();
    }

    public static void sumStats(){
        IntSummaryStatistics summary = IntStream.of(2, 45, 67, 89, 92, 100)
            .summaryStatistics();

            System.out.println(summary);
    }
}