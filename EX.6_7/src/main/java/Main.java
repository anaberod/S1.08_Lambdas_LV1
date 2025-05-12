import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> elements = Arrays.asList("cat", 52236, "phone", 114, "laptop",2);
            // Ordenar por longitud del contenido (convertido a String en el momento)
            elements.sort((a, b) -> {
                int lengthA = a.toString().length();  // Convertimos a String para medir la longitud
                int lengthB = b.toString().length();
                return Integer.compare(lengthA, lengthB);
            });

            // Imprimir resultado
            elements.forEach(System.out::println);

        System.out.println();

        elements.sort((a, b) -> {
            int lengthA = a.toString().length();
            int lengthB = b.toString().length();
            return Integer.compare(lengthB, lengthA);
        });

        elements.forEach(System.out::println);



        }
    }

