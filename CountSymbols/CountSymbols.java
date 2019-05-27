package CountSymbols;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        Map<String, Integer> elements = new TreeMap<>();
        for (int i = 0; i < input.length; i++) {

            if (!elements.containsKey(input[i])) {

                elements.put(input[i], 1);
            } else {
                elements.put((input[i]), elements.get(input[i]) + 1);
            }

        }
        elements.entrySet().forEach((kvp -> {
            System.out.println(String.format("%s: %d time/s", kvp.getKey(), kvp.getValue()));
        }));


    }
}
