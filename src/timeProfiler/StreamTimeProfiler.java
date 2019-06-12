package timeProfiler;

import operations.StreamController;

public class StreamTimeProfiler {
    public static long measureGetSum(int max) {
        long start, end;
        start = System.nanoTime();
        StreamController.getSumByStream(max);
        end = System.nanoTime();
        return end - start;
    }

    public static long measureGetMean(int max) {
        long start, end;
        start = System.nanoTime();
        StreamController.getMeanByStream(max);
        end = System.nanoTime();
        return end - start;
    }

    public static long measureGetVariance(int max) {
        long start, end;
        start = System.nanoTime();
        StreamController.getVarianceByStream(max, StreamController.getMeanByStream(max));
        end = System.nanoTime();
        return end - start;
    }
}
