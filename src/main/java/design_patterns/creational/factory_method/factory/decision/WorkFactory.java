package design_patterns.creational.factory_method.factory.decision;

public class WorkFactory implements DecisionFactory {

    @Override
    public Object createDecision() {
        return "Work";
    }
}
