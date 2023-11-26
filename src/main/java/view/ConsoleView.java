package view;

import model.IListCreator;
import model.NumberListComparison;

import java.util.List;

public class ConsoleView implements IView {

    private final NumberListComparison numberListComparison;
    private final IListCreator listCreator;

    public ConsoleView(IListCreator listCreator, NumberListComparison numberListComparison) {
        this.listCreator = listCreator;
        this.numberListComparison = numberListComparison;
    }

    @Override
    public void run() {
        System.out.println("Cравнения двух списков, состоящих чисел.");
        List<Integer> firstList = listCreator.createList();
        System.out.println("Первый список: " + firstList.toString());
        List<Integer> secondList = listCreator.createList();
        System.out.println("Второй список: " + secondList.toString());
        int compareValue = numberListComparison.compare(firstList,secondList);
        if (compareValue > 0) {
            System.out.println("Среднее значение первого списка большее.");
        }
        if (compareValue < 0) {
            System.out.println("Среднее значение второго списка большее.");
        }
        if (compareValue == 0) {
            System.out.println("Средние значения равны.");
        }

    }
}