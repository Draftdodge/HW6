package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbersList implements IListCreator {
    private final Random rnd = new Random();
    private int size;
    private int min;
    private int max;

    public void setSize(int size) {
        this.size = size;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }



    public RandomNumbersList(int size, int min, int max) {
        this.size = size;
        this.min = min;
        this.max = max;
    }

    @Override
    public List<Integer> createList() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(min, max + 1));
        }

        return list;
    }
}