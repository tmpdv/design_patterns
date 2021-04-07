package design_patterns.creational.factory_method.factory.problem;

import design_patterns.creational.factory_method.domain.problem.NoMoney;
import design_patterns.creational.factory_method.domain.problem.Problem;

public class NoMoneyFactory implements ProblemFactory {

    @Override
    public Problem createProblem() {
        return new NoMoney();
    }
}
