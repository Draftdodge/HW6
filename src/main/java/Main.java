import model.ArithmeticAverage;
import model.IListCreator;
import model.NumberListComparison;
import model.RandomNumbersList;
import view.ConsoleView;
import view.IView;

public class Main {
    public static void main(String[] args) {
        NumberListComparison numberListComparison = new NumberListComparison(new ArithmeticAverage());
        IListCreator listCreator = new RandomNumbersList(5, 1, 50);
        IView view = new ConsoleView(listCreator, numberListComparison);
        view.run();
    }
}
