package design_patterns.structural.adapter;

public class JsonValueAdapter implements JsonProvider {

    private final ValueProvider valueProvider;

    public JsonValueAdapter(ValueProvider valueProvider) {
        this.valueProvider = valueProvider;
    }

    public String getJson(int id) {
        Value value = valueProvider.getValue(id);
        if (value == null) {
            return wrapWithBrackets("");
        }
        return wrapWithBrackets(
                wrapKey("id") + wrapWithQuotes(value.getId().toString()) + ",\n"
                        + wrapKey("name") + wrapWithQuotes(value.getName())
        );
    }

    private String wrapWithQuotes(String s) {
        return String.format("\"%s\"", s);
    }

    private String wrapKey(String s) {
        return wrapWithQuotes(s) + ":";
    }

    private String wrapWithBrackets(String s) {
        return String.format("{%s}", s);
    }
}
