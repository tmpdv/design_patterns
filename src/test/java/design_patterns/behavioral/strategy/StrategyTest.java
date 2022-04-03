package design_patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {

    @Test
    public void testFist() {
        AngryMoron angryMoron = new AngryMoron(new FistStrategy());
        Citizen citizen = new Citizen();
        int i = 0;
        while (citizen.isAlive()) {
            angryMoron.beat(citizen);
            i++;
        }
        assertEquals(10, i);
    }

    @Test
    public void testClawHammer() {
        AngryMoron angryMoron = new AngryMoron(new ClawHammerStrategy());
        Citizen citizen = new Citizen();
        int i = 0;
        while (citizen.isAlive()) {
            angryMoron.beat(citizen);
            i++;
        }
        assertEquals(5, i);
    }

    @Test
    public void testCudgel() {
        AngryMoron angryMoron = new AngryMoron(new CudgelStrategy());
        Citizen citizen = new Citizen();
        int i = 0;
        while (citizen.isAlive()) {
            angryMoron.beat(citizen);
            i++;
        }
        assertEquals(2, i);
    }
}
