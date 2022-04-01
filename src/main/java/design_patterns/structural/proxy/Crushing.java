package design_patterns.structural.proxy;

import java.util.List;

public interface Crushing {
    void crush(Object obj);
    List<String> getMessages();
}
