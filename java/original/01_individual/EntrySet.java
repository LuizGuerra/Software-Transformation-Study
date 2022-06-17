import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EntrySet {
    Map<String, String> hashMap;

    public EntrySet() {
        this.hashMap = new HashMap<>();
        for (Integer i = 0; i < 10; i++) {
            hashMap.put(i.toString(), (i * i).toString);
        }
        // Code smell: "entrySet()" should be iterated when both the key and value are
        // needed
        // https://rules.sonarsource.com/java/type/Code%20Smell/RSPEC-2864
        fromArgument(hashMap);
        fromAttribute();
    }

    // using an argument map
    private void fromArgument(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (String key : map.keySet()) {
            Object value = map.get(key);
        }
    }

    // using the class attribute map
    private void fromAttribute() {
        if (this.hashMap == null || this.hashMap.isEmpty()) {
            return;
        }
        for (String key : this.hashMap.keySet()) {
            if (key.equals(this.hashMap.get(key))) {
                System.out.println("Equal.");
            }
        }
    }
}
