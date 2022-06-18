public class FileWithTwoCodeSmells {
    private Map<String, String> hashMap;

    public FileWithTwoCodeSmells() {
        hashMap = new HashMap<>();
    }

    // Fake public function
    public void start() {
        // Code smell: String literals should not be duplicated
        // https://rules.sonarsource.com/java/type/Code%20Smell/RSPEC-1192
        configureState("[some input]");
        startExecution("[some input]", this.hashMap);
        endExecution("[some input]");
    }

    // Fake private functions
    // Initialize the hashmap
    private void configureState(String input) {
        for (Integer key = 0; key < 10; key++) {
            hashMap.put(input + key, input + (10 - key));
        }
    }

    // Use the hashmap
    private void startExecution(String input, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        // Code smell: "entrySet()" should be iterated when both the key and value are
        // needed
        // https://rules.sonarsource.com/java/type/Code%20Smell/RSPEC-2864
        for (String key : map.entrySet()) {
            Object value = map.get(key);
        }
    }

    // Clear the hashmap
    private void endExecution(String input) {
        if (this.hashMap == null || this.hashMap.isEmpty()) {
            return;
        }
        this.hashMap.clear();
    }
}
