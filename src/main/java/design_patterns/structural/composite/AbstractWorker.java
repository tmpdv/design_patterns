package design_patterns.structural.composite;

public abstract class AbstractWorker implements Worker {

    private final String name;
    private boolean isHappy = true;

    public AbstractWorker(String name) {
        this.name = name;
    }

    @Override
    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    public String getName() {
        return name;
    }
}
