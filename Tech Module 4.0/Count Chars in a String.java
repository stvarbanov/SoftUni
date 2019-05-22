import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<Character, Integer> countChars =
                new LinkedHashMap<>();

        String text = String.join("",
                scanner.nextLine().split("\\s+"));

        for (int i = 0; i < text.length(); i++) {

            char symbol = text.charAt(i);

            if (!countChars.containsKey(symbol)) {
                countChars.put(symbol, 1);
            } else {
                countChars.put(symbol, countChars.get(symbol) + 1);
            }

        }

        countChars.forEach((key, value) ->
                System.out.println(key + " -> " + value));

    }
}