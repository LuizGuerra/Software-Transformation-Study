import java.util.HashMap;
import java.util.Map;

public class IntegratedCodeSmells {

    private Map<String, String> hashMap;
    // Class initializer
    public IntegratedCodeSmells() {
        hashMap = new HashMap<>();
    }

    // Fake public function
    public void start() {
        // Code smell: String literals should not be duplicated
        // https://rules.sonarsource.com/java/type/Code%20Smell/RSPEC-1192
        configureState("[some input]");
        startExecution("[some input]");
        endExecution("[some input]");
    }

    // Fake private functions
    private void configureState(String input) {
        if(this.hashMap == null || this.hashMap.isEmpty()) {
            return;
        }
        for (Integer key = 0; key < 10; key++) {
            // Code smell: String literals should not be duplicated
            // https://rules.sonarsource.com/java/type/Code%20Smell/RSPEC-1192
            hashMap.put(
                    input + ": Index of " + key,
                    input + ": Index of " + (10 - key));
        }
    }

    private void startExecution(String input) {
        if(this.hashMap == null || this.hashMap.isEmpty()) {
            return;
        }
        // Code smell: "entrySet()" should be iterated when both the key and value are
        // needed
        // https://rules.sonarsource.com/java/type/Code%20Smell/RSPEC-2864
        for (String key : this.hashMap.keySet()) {
            // verify if key is equal the value
            if (key.equals(this.hashMap.get(key))) {
                System.out.println("Index with key <" + key + "> is equal.");
            }
        }
    }

    private void endExecution(String input) {
        if(this.hashMap == null || this.hashMap.isEmpty()) {
            return;
        }
        this.hashMap.clear();
    }
}
