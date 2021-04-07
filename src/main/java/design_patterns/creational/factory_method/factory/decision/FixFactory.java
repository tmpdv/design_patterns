package design_patterns.creational.factory_method.factory.decision;

public class FixFactory implements DecisionFactory {

    @Override
    public Object createDecision() {
        return "Fix";
    }
}
