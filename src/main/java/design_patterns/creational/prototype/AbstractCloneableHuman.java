package design_patterns.creational.prototype;

import java.util.Objects;

public abstract class AbstractCloneableHuman implements CloneableHuman {

    private String name;
    private int speed;

    public AbstractCloneableHuman(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public AbstractCloneableHuman(AbstractCloneableHuman prototype) {
        this.name = prototype.getName();
        this.speed = prototype.getSpeed();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCloneableHuman that = (AbstractCloneableHuman) o;
        return speed == that.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
