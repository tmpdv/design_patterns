package design_patterns.structural.adapter;

public class Value {

    private final int id;
    private final String name;

    public Value(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
