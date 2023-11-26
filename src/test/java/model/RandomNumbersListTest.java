package model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumbersListTest {
    @Test
    void testCreateList() {
        RandomNumbersList randomNumbersList = new RandomNumbersList(5, 3,5);
        List<Integer> list = randomNumbersList.createList();
        assertThat(list.size()).isEqualTo(5);
    }
}