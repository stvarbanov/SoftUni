package FixEmails;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        Map<String, String> list = new LinkedHashMap<String, String>();

        int counter = 0;
        String previous = "";

        while (!"stop".equals(input = scanner.nextLine())) {
            counter++;
            if (counter % 2 == 0) {
//                email
                if (!input.endsWith("us") && (!input.endsWith("uk")) && (!input.endsWith("com"))) {
                    list.put(previous, input);
                }
            } else {
//                person
                list.putIfAbsent(input, null);
                previous = input;

            }
        }
        list.entrySet().
                forEach((e -> {
                    if (e.getValue() == null) {
                        return;
                    } else {
                        System.out.println(e.getKey() + " -> " + e.getValue());
                    }
                    ;
                }));

    }
}
