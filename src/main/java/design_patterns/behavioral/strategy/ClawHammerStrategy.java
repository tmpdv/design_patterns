package design_patterns.behavioral.strategy;

public class ClawHammerStrategy implements BeatStrategy {

    @Override
    public void beat(Citizen citizen) {
        citizen.reduceHp(20);
    }
}
