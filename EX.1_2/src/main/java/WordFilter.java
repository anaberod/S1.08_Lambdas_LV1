import java.util.List;
import java.util.stream.Collectors;

public class WordFilter {



    //recibe una lista de palabras y devuelve otra lista con solo las que contienen la letra "o"
    public static List<String> filterWordsContainingOAndNoLongerThanFive(List<String> input) {
        return  input.stream()
                .filter(word ->word.contains("o"))//filrar las que tiene o
                .filter(word ->word.length()> 5)//más de 5 letras
                .collect(Collectors.toList());// cnvertirlas en una lista

    }
}

