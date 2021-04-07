package design_patterns.creational.factory_method.factory.problem;

import design_patterns.creational.factory_method.domain.problem.Problem;

public interface ProblemFactory {
    Problem createProblem();
}
