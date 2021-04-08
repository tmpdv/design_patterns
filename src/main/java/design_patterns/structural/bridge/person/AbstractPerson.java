package design_patterns.structural.bridge.person;

import design_patterns.structural.bridge.orientation.SexualOrientation;

import java.util.Objects;

public abstract class AbstractPerson implements Person {

    private String name;
    private SexualOrientation orientation;

    public AbstractPerson(String name, SexualOrientation orientation) {
        this.name = name;
        this.orientation = orientation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SexualOrientation getOrientation() {
        return orientation;
    }

    public void setOrientation(SexualOrientation orientation) {
        this.orientation = orientation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPerson that = (AbstractPerson) o;
        return orientation.equals(that.orientation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orientation);
    }

    @Override
    public String toString() {
        return name;
    }
}
