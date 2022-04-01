package design_patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class HeavyObject implements Crushing {

    private List<String> messages;

    @Override
    public List<String> getMessages() {
        if (messages == null) {
            return List.of();
        }
        return messages;
    }

    @Override
    public void crush(Object obj) {
        if (messages == null) {
            messages = new ArrayList<>();
        }
        messages.add(obj + " was crushed");
    }
}
