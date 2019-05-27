package AverageStudentsGrades;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsWithGrades = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String[] tokens = input.split("\\s+");
            studentsWithGrades.putIfAbsent(tokens[0], new ArrayList<>());

            studentsWithGrades.get(tokens[0]).add(Double.parseDouble(tokens[1]));

        }

        studentsWithGrades
                .forEach((name, grades) -> {
                    String allGrades = grades.stream()
                            .map(q -> String.format("%.2f", q))
                            .collect(Collectors.joining(" "));
                    double avg = grades.stream().mapToDouble(e -> e).average().getAsDouble();

                    System.out.println(String.format("%s -> %s (avg: %.2f)",
                            name,
                            allGrades, avg));
                });
    }

}
