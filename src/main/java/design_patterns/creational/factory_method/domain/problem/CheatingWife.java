package design_patterns.creational.factory_method.domain.problem;

import design_patterns.creational.factory_method.domain.person.Neighbour;
import design_patterns.creational.factory_method.domain.person.Wife;

public class CheatingWife implements Problem {

    private final Neighbour neighbour = new Neighbour();
    private final Wife wife = new Wife();

    @Override
    public void solve(Object decision) {
        throw new RuntimeException("No simple decision found!");
    }

    @Override
    public boolean isSolved() {
        return neighbour.isDead() || wife.isDead();
    }

    public Neighbour getNeighbour() {
        return neighbour;
    }

    public Wife getWife() {
        return wife;
    }
}
