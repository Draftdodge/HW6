package model;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
class NumberListComparisonTest {

    @Test
    void testCompare() {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        List<Integer> secondtList = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 2));
        ArithmeticAverage arithmeticAverage = mock(ArithmeticAverage.class);
        when(arithmeticAverage.getArithmeticAverage(firstList)).thenReturn(1.0);
        when(arithmeticAverage.getArithmeticAverage(secondtList)).thenReturn(2.0);

        NumberListComparison numberListComparison = new NumberListComparison(arithmeticAverage);
        assertThat(numberListComparison.compare(firstList, secondtList)).isLessThan(0);
        assertThat(numberListComparison.compare(secondtList, firstList)).isGreaterThan(0);
        verify(arithmeticAverage, times(2)).getArithmeticAverage(firstList);
        verify(arithmeticAverage, times(2)).getArithmeticAverage(secondtList);

    }
}