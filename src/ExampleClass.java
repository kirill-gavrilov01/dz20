public class ExampleClass extends Searchable {
    private final String term;

    public ExampleClass(String term) {
        this.term = term;
    }

    @Override
    public String getSearchTerm() {
        return term;
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
                "term='" + term + '\\';
    }
}





