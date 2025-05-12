import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "mango", "kiwi");

        List<String> result =WordFilter.filterWordsContainingOAndNoLongerThanFive(fruits);

        System.out.println("Words containing 'o' and more than 5 letters: " + result);
    }
}
