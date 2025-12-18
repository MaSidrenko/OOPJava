
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Storage<T> {

    ArrayList<T> items = new ArrayList<>();
    LinkedList<T> history = new LinkedList<>();

    void add(T element) {
        items.add(element);
        T record = (T) ("added: " + element);
        history.addFirst(record);
    }

    boolean remove(T element) {
        boolean result = items.remove(element);
        if (result) {
            T record = (T) ("removed: " + element);
            history.addFirst(record);
        }
        return result;
    }

    HashMap<T, Integer> statistics() {
        HashMap<T, Integer> map = new HashMap<>();
        for (T item : items) {
            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                int count = map.get(item);
                map.put(item, count + 1);
            }
        }

		return map;
    }
}
