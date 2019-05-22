import java.util.LinkedHashMap;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code


        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, Integer> res = new LinkedHashMap<>();

        String input = "";

        while (!"stop".equals(input = scan.nextLine())) {
            String resources = input;
            int quantity = Integer.parseInt(scan.nextLine());


            if (!res.containsKey(resources)) {

                res.put(resources, quantity);

            } else {
                res.put(resources,res.get(resources)+ quantity);
            }

        }

        res.forEach((key,value)-> System.out.println(key + " -> " + value));

    }
}
