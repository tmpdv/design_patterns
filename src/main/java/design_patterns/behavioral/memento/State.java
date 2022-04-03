package design_patterns.behavioral.memento;

import java.util.Objects;

public class State {

    private final int x;
    private final int y;
    private final int z;

    public State(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return x == state.x && y == state.y && z == state.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
