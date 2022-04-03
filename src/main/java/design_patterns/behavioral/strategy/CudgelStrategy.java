package design_patterns.behavioral.strategy;

public class CudgelStrategy implements BeatStrategy {

    @Override
    public void beat(Citizen citizen) {
        citizen.reduceHp(50);
    }
}
