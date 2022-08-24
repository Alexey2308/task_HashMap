
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
                "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
                "occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {
                if (!map.containsKey(text.charAt(i))) {
                    map.put(text.charAt(i), 1);

                } else {
                    map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
                }
            }
        }
        int maxValue = (Collections.max(map.values()));
        int minValue = (Collections.min(map.values()));

        System.out.println("Наиболее часто встречается буква:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("Наиболее редко встречается буквы:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == minValue) {
                System.out.println(entry.getKey());
            }
        }


    }
}






