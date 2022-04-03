package design_patterns.behavioral.strategy;

public class FistStrategy implements BeatStrategy {

    @Override
    public void beat(Citizen citizen) {
        citizen.reduceHp(10);
    }
}
