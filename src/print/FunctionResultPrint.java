package print;

import operations.FunctionController;
import timeProfiler.FunctionTimeProfiler;

import java.util.ArrayList;

public class FunctionResultPrint {

    public static void printResults(int max){
        ArrayList<Integer> list = FunctionController.getIntegersList(max);
        System.out.println("Result of function :");
        System.out.println();
        int sum = FunctionController.getSumByFunc(list);
        System.out.println("Sum of list = " + sum +
                "                       Elapsed time, ms : " + FunctionTimeProfiler.measureGetSum(max)/1000000);

        double mean = FunctionController.getMeanByFunc(list, sum);
        System.out.println("Mean of list = " + mean +
                "                         Elapsed time, ms : " + FunctionTimeProfiler.measureGetMean(max)/1000000);

        System.out.println("Variance of list = " + FunctionController.getVarianceByFunc(list, mean) +
                "                  Elapsed time, ms : " + FunctionTimeProfiler.measureGetVariance(max)/1000000);
    }
}
