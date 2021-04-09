package design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Head extends AbstractWorker {

    private final List<Worker> subordinates = new ArrayList<>();

    public Head(String name) {
        super(name);
    }

    public void add(Worker worker) {
        subordinates.add(worker);
    }

    public void remove(Worker worker) {
        subordinates.remove(worker);
    }

    public List<Worker> getSubordinates() {
        return subordinates;
    }

    public void cussOut() {
        if (subordinates.size() > 0) {
            subordinates.forEach(Worker::cussOut);
        } else {
            System.out.println(getName() + ": \"No one to cuss at :(\"");
            setHappy(false);
        }
    }


}
