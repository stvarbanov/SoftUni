package UniqueUsernames;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> names = new LinkedHashSet<>();
        String input;
        while (n-- > 0) {
            input = scanner.nextLine();

            if (!names.contains(input))
                names.add(input);

        }

        names.forEach(e -> System.out.println(e));
    }
}
