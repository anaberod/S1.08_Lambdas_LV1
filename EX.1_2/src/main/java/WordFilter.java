import java.util.List;
import java.util.stream.Collectors;

public class WordFilter {

    public static List<String> filterWordsContainingOAndNoLongerThanFive(List<String> input) {
        return  input.stream()
                .filter(word ->word.contains("o"))
                .filter(word ->word.length()> 5)
                .collect(Collectors.toList());

    }
}

