package design_patterns.creational.factory_method.domain.problem;

public class Bug implements Problem {

    private boolean isFixed = false;

    @Override
    public void solve(Object decision) {
        if (decision.equals("Fix")) {
            isFixed = true;
        }
    }

    @Override
    public boolean isSolved() {
        return isFixed;
    }
}
