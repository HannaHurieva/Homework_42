package operations;

import java.util.ArrayList;

public class FunctionController {
    public static ArrayList<Integer> getIntegersList(int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < max + 1; i++) {
            list.add(i);
        }
        return list;
    }

    public static int getSumByFunc(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static double getMeanByFunc(ArrayList<Integer> list, int sum) {
        return (double) sum / list.size();
    }

    public static double getVarianceByFunc(ArrayList<Integer> list, double mean) {
        float temp = 0;
        for (int elem : list) {
            temp += (elem - mean) * (elem - mean);
        }
        return temp / (list.size() - 1);
    }

}
