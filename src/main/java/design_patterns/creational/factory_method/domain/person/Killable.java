package design_patterns.creational.factory_method.domain.person;

public abstract class Killable {

    private boolean isAlive = true;

    public void setDead() {
        isAlive = false;
    }

    public boolean isDead() {
        return !isAlive;
    }
}
