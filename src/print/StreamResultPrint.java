package print;

import operations.StreamController;
import timeProfiler.StreamTimeProfiler;

public class StreamResultPrint {

    public static void printResults(int max){
        System.out.println("Result of stream API :");
        System.out.println();
        System.out.println("Sum of list = " + StreamController.getSumByStream(max) +
                "                       Elapsed time, ms : " + StreamTimeProfiler.measureGetSum(max)/1000000);

        System.out.println("Mean of list = " + StreamController.getMeanByStream(max) +
                "                         Elapsed time, ms : " + StreamTimeProfiler.measureGetMean(max)/1000000);

        System.out.println("Variance of list = " +
                StreamController.getVarianceByStream(max, StreamController.getMeanByStream(max)) +
                "                  Elapsed time, ms : " + StreamTimeProfiler.measureGetVariance(max)/1000000);
    }
}
