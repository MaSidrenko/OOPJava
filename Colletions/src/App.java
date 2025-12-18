
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) throws Exception {
        String text = "Java is a language programming, java usable in mobile dev, web dev, game dev";
        String cleanText = text.replaceAll("[^a-zA-Z\\s]", "");
        Map<String, Integer> map = new HashMap<>();
        String[] words = cleanText.toLowerCase().split(" ");
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                int count = map.get(word);
                map.put(word, count + 1);
            }
        }
        Set<String> treeSet = new TreeSet<>(map.keySet());
        System.out.println(treeSet);
        System.out.println(treeSet.size());
        System.out.println("Top used words: " + map
                .entrySet().stream().
                sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3).toList());

        // Storage<String> storage = new Storage<>();
        // storage.add("apple");
        // storage.add("banana");
        // storage.add("apple");
        // storage.remove("banana");
        // System.out.println(storage.statistics());
        // System.out.println(storage.history);
    }
}
