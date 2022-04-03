package design_patterns.behavioral.strategy;

public class Citizen {

    private int health = 100;

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void reduceHp(int hp) {
        health -= hp;
    }
}
