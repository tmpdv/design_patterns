package design_patterns.creational.factory_method.factory.problem;

import design_patterns.creational.factory_method.domain.problem.Bug;
import design_patterns.creational.factory_method.domain.problem.Problem;

public class BugFactory implements ProblemFactory {

    @Override
    public Problem createProblem() {
        return new Bug();
    }
}
