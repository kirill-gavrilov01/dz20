public class AnotherExampleClass extends Searchable {
    private final String term;

    public AnotherExampleClass(String term) {
        this.term = term;
    }

    @Override
    public String getSearchTerm() {
        return term;
    }

    @Override
    public String toString() {
        return "AnotherExampleClass{" +
                "term='" + term + '\\';
    }
}
