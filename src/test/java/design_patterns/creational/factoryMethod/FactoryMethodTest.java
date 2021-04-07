package design_patterns.creational.factoryMethod;

import design_patterns.creational.factory_method.domain.person.Killer;
import design_patterns.creational.factory_method.domain.problem.CheatingWife;
import design_patterns.creational.factory_method.domain.problem.Problem;
import design_patterns.creational.factory_method.factory.decision.FixFactory;
import design_patterns.creational.factory_method.factory.decision.KillerFactory;
import design_patterns.creational.factory_method.factory.decision.PrayerFactory;
import design_patterns.creational.factory_method.factory.decision.WorkFactory;
import design_patterns.creational.factory_method.factory.problem.BugFactory;
import design_patterns.creational.factory_method.factory.problem.CheatingWifeFactory;
import design_patterns.creational.factory_method.factory.problem.NoMoneyFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactoryMethodTest {

    @Test
    public void testBugPositive() {
        Problem problem = new BugFactory().createProblem();
        Object decision = new FixFactory().createDecision();

        problem.solve(decision);

        assertTrue(problem.isSolved());
    }

    @Test
    public void testBugNegative() {
        Problem problem = new BugFactory().createProblem();
        Object decision = new PrayerFactory().createDecision();

        problem.solve(decision);

        assertFalse(problem.isSolved());
    }

    @Test
    public void testNoMoneyPositive() {
        Problem problem = new NoMoneyFactory().createProblem();
        Object decision = new WorkFactory().createDecision();

        problem.solve(decision);

        assertTrue(problem.isSolved());
    }

    @Test
    public void testNoMoneyNegative() {
        Problem problem = new NoMoneyFactory().createProblem();
        Object decision = new PrayerFactory().createDecision();

        problem.solve(decision);

        assertFalse(problem.isSolved());
    }

    @Test
    public void testCheatingWifeException() {
        Problem problem = new CheatingWifeFactory().createProblem();
        Object decision = new KillerFactory().createDecision();

        assertEquals(CheatingWife.class, problem.getClass());
        assertEquals(Killer.class, decision.getClass());

        Exception exception = assertThrows(RuntimeException.class, () -> problem.solve(decision));

        String expectedMessage = "No simple decision found!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testCheatingWifeKillNeighbour() {
        Problem problem = new CheatingWifeFactory().createProblem();
        Object decision = new KillerFactory().createDecision();

        assertEquals(CheatingWife.class, problem.getClass());
        assertEquals(Killer.class, decision.getClass());

        CheatingWife cheatingWife = (CheatingWife) problem;
        Killer killer = (Killer) decision;

        killer.kill(cheatingWife.getNeighbour());

        assertTrue(problem.isSolved());
    }

    @Test
    public void testCheatingWifeKillWife() {
        Problem problem = new CheatingWifeFactory().createProblem();
        Object decision = new KillerFactory().createDecision();

        assertEquals(CheatingWife.class, problem.getClass());
        assertEquals(Killer.class, decision.getClass());

        CheatingWife cheatingWife = (CheatingWife) problem;
        Killer killer = (Killer) decision;

        killer.kill(cheatingWife.getWife());

        assertTrue(problem.isSolved());
    }
}
