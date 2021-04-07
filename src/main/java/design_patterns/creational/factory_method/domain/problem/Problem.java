package design_patterns.creational.factory_method.domain.problem;

public interface Problem {
    void solve(Object decision);
    boolean isSolved();
}
