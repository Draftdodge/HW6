package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ArithmeticAverageTest {
    @Test
    void testGetArithmeticAverage() {
        ArithmeticAverage arithmeticAverage = new ArithmeticAverage();
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,1,1));
        assertThat(arithmeticAverage.getArithmeticAverage(list)).isEqualTo(1.0);
    }
}