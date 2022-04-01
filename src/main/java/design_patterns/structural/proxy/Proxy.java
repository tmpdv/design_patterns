package design_patterns.structural.proxy;

import java.util.List;

public class Proxy implements Crushing {

    private Crushing heavyObject;

    public Crushing getHeavyObject() {
        return heavyObject;
    }

    @Override
    public void crush(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Unable to crush nothing");
        }
        if (heavyObject == null) {
            heavyObject = new HeavyObject();
        }
        heavyObject.crush(obj);
    }

    @Override
    public List<String> getMessages() {
        if (heavyObject == null) {
            return List.of();
        }
        return heavyObject.getMessages();
    }
}
