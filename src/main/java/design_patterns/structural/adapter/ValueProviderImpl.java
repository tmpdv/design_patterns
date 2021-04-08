package design_patterns.structural.adapter;

import java.util.Map;

public class ValueProviderImpl implements ValueProvider {

    private final Map<Integer, String> valueMap;

    public ValueProviderImpl(Map<Integer, String> valueMap) {
        this.valueMap = valueMap;
    }

    public Value getValue(int id) {
        String name = valueMap.get(id);
        if (name == null) {
            return null;
        }
        return new Value(id, valueMap.get(id));
    }
}
