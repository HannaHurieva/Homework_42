package timeProfiler;

import operations.FunctionController;
import print.FunctionResultPrint;

import java.util.ArrayList;

public class FunctionTimeProfiler {

    public static long measureGetSum(int max) {
        long start, end;
        start = System.nanoTime();
        FunctionController.getSumByFunc(FunctionController.getIntegersList(max));
        end = System.nanoTime();
        return end - start;
    }

    public static long measureGetMean(int max) {
        long start, end;
        start = System.nanoTime();
        ArrayList<Integer> list = FunctionController.getIntegersList(max);
        FunctionController.getMeanByFunc(list,
                FunctionController.getSumByFunc(list));
        end = System.nanoTime();
        return end - start;
    }

    public static long measureGetVariance(int max) {
        long start, end;
        start = System.nanoTime();
        ArrayList<Integer> list = FunctionController.getIntegersList(max);
        int sum = FunctionController.getSumByFunc(list);
        double mean = FunctionController.getMeanByFunc(list, sum);
        FunctionController.getVarianceByFunc(list, mean);
        end = System.nanoTime();
        return end - start;
    }
}
