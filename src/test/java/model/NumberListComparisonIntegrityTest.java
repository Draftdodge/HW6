package model;

import model.IListCreator;
import model.RandomNumbersList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberListComparisonIntegrityTest {

    private RandomNumbersList listCreator;
    private NumberListComparison numberListComparison;

    @BeforeEach
    void setup() {
        listCreator = new RandomNumbersList(3, 1, 1);
        ArithmeticAverage arithmeticAverage = new ArithmeticAverage();
        numberListComparison = new NumberListComparison(arithmeticAverage);
    }

    @Test
    void testDifferentListSizeComparison() {
        List<Integer> firstList = listCreator.createList();
        listCreator.setSize(5);
        List<Integer> secondList = listCreator.createList();
        assertThat(numberListComparison.compare(firstList, secondList)).isEqualTo(0);
    }

    @Test
    void testCompareList() {
        List<Integer> firstList = listCreator.createList();
        listCreator.setMin(10);
        listCreator.setMax(20);
        List<Integer> secondList = listCreator.createList();
        assertThat(numberListComparison.compare(firstList, secondList)).isLessThan(0);
    }

}