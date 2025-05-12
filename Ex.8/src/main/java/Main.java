public class Main {
    public static void main(String[] args) {
        // Inyectamos una lambda que invierte una cadena
        Reverser reverser = s -> new StringBuilder(s).reverse().toString();

        // Probamos el método
        String input = "hello";
        String result = reverser.reverse(input);

        // Imprimimos
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + result);
    }

}
