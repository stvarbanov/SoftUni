package AMinerTask;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        Map<String, Integer> list = new LinkedHashMap<String, Integer>();

        int counter = 0;
        String previous = "";
        while (!"stop".equals(input = scanner.nextLine())) {
            counter++;

            if (counter % 2 == 0) {
//                quantity

                int quantity = Integer.parseInt(input);
                list.put(previous, list.get(previous) + quantity);

            } else {
//                resourse

                list.putIfAbsent(input, 0);
                previous = input;

            }


        }


        list.entrySet().stream().forEach((e -> {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }));


    }
}
