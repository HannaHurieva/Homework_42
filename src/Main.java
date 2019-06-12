import print.FunctionResultPrint;
import print.StreamResultPrint;

public class Main {
    public static void main(String[] args) {
        int max = 50000;
        FunctionResultPrint.printResults(max);
        System.out.println("**********************");
        StreamResultPrint.printResults(max);
    }
}
