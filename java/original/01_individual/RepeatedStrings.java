public class RepeatedStrings {
    public RepeatedStrings() {
        // Code smell: String literals should not be duplicated
        // https://rules.sonarsource.com/java/type/Code%20Smell/RSPEC-1192

        // 2 repeated strings
        foo("[2 inputs]");
        foo("[2 inputs]");

        // 3 repeated strings
        foo("[3 inputs]");
        foo("[3 inputs]");
        foo("[3 inputs]");
    }

    private void foo(String input) {
        // ...
    }
}
