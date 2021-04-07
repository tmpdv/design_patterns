package design_patterns.creational.factory_method.factory.decision;

public class PrayerFactory implements DecisionFactory {

    @Override
    public Object createDecision() {
        return "Please, God help me!";
    }
}
