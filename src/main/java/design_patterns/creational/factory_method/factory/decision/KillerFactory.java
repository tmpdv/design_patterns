package design_patterns.creational.factory_method.factory.decision;

import design_patterns.creational.factory_method.domain.person.Killer;

public class KillerFactory implements DecisionFactory {

    @Override
    public Object createDecision() {
        return new Killer();
    }
}
