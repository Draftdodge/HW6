package model;

import java.util.List;

public class ArithmeticAverage {
    public double getArithmeticAverage(List<Integer> list) {
        int sum = 0;
        for (int number: list) {
            sum += number;
        }
        return (double) sum / list.size();
    }
}