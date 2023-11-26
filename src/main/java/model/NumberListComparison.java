package model;

import java.util.List;

public class NumberListComparison {

    private final ArithmeticAverage arithmeticAverage;

    public NumberListComparison(ArithmeticAverage arithmeticAverage) {
        this.arithmeticAverage = arithmeticAverage;
    }
    public int compare(List<Integer> firstList, List<Integer> secondList) {
        double firstListAverage = arithmeticAverage.getArithmeticAverage(firstList);
        double secondListAverage = arithmeticAverage.getArithmeticAverage(secondList);
        return Double.compare(firstListAverage, secondListAverage);
    }
}