package design_patterns.creational.factory_method.domain.problem;

public class NoMoney implements Problem {

    private boolean reallyNoMoney = true;

    @Override
    public void solve(Object decision) {
        if (decision.equals("Work")) {
            reallyNoMoney = false;
        }
    }

    @Override
    public boolean isSolved() {
        return !reallyNoMoney;
    }
}
