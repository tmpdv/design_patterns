package design_patterns.creational.factory_method.factory.problem;

import design_patterns.creational.factory_method.domain.problem.CheatingWife;
import design_patterns.creational.factory_method.domain.problem.Problem;

public class CheatingWifeFactory implements ProblemFactory {

    @Override
    public Problem createProblem() {
        return new CheatingWife();
    }
}
