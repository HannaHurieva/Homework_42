package operations;

import java.util.stream.IntStream;

public class StreamController {
    public static int getSumByStream(int max) {
        return IntStream.rangeClosed(1, max)
                .sum();
    }

    public static double getMeanByStream(int max) {
        return IntStream.rangeClosed(1, max)
                .average()
                .getAsDouble();
    }

    public static double getVarianceByStream(int max, double mean) {
        return IntStream.rangeClosed(1, max)
                .mapToDouble(x -> ((x - mean) * (x - mean)))
                .sum() / (max - 1);
    }

}
