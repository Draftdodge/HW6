package view;

import model.NumberListComparison;
import model.IListCreator;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ConsoleViewTest {

    @Test
    void testRun() {
        IListCreator listCreator = mock(IListCreator.class);
        NumberListComparison listComparison = mock(NumberListComparison.class);
        ConsoleView consoleView = new ConsoleView(listCreator, listComparison);
        when(listCreator.createList()).thenReturn(Arrays.asList(1, 1, 1));
        when(listComparison.compare(listCreator.createList(), listCreator.createList())).
                thenReturn(0).
                thenReturn(1).
                thenReturn(-1);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream modifiedSystemOut = new PrintStream(byteArrayOutputStream);
        PrintStream standardSystemOut = System.out;
        System.setOut(modifiedSystemOut);

        consoleView.run();
        String[] strings = byteArrayOutputStream.toString().split("\n");
        assertEquals("Средние значения равны.", strings[strings.length - 1]);

        consoleView.run();
        strings = byteArrayOutputStream.toString().split("\n");
        assertEquals("Среднее значение первого списка большее.", strings[strings.length - 1]);

        consoleView.run();
        strings = byteArrayOutputStream.toString().split("\n");
        assertEquals("Среднее значение второго списка большее.", strings[strings.length - 1]);

        System.setOut(standardSystemOut);
    }
}