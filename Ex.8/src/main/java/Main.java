public class Main {
    public static void main(String[] args) {

        Reverser reverser = s -> new StringBuilder(s).reverse().toString();


        String input = "hello";
        String result = reverser.reverse(input);


        System.out.println("Original: " + input);
        System.out.println("Reversed: " + result);
    }

}
