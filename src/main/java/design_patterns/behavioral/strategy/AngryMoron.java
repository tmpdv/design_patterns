package design_patterns.behavioral.strategy;

public class AngryMoron {

    private final BeatStrategy beatStrategy;

    public AngryMoron(BeatStrategy beatStrategy) {
        this.beatStrategy = beatStrategy;
    }

    public void beat(Citizen citizen) {
        beatStrategy.beat(citizen);
    }
}
