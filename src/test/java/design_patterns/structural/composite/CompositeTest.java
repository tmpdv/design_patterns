package design_patterns.structural.composite;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CompositeTest {

    private static final Worker ivan = new OrdinaryWorker("Ivan");
    private static final Worker vasily = new OrdinaryWorker("Vasily");
    private static final Worker vladimir = new OrdinaryWorker("Vladimir");
    private static final Worker mike = new OrdinaryWorker("Mike");
    private static final Worker antony = new OrdinaryWorker("Antony");
    private static final Worker roman = new OrdinaryWorker("Roman");
    private static final Head head1 = new Head("Head-1");
    private static final Head head2 = new Head("Head-2");
    private static final Head head3 = new Head("Head-3");
    private static final Head boss = new Head("Big Boss");

    @Test
    @Order(1)
    public void testAddWorkers() {
        head1.add(ivan);
        head1.add(vasily);
        head1.add(vladimir);

        head2.add(mike);
        head2.add(antony);

        head3.add(roman);

        boss.add(head1);
        boss.add(head2);
        boss.add(head3);

        List<Worker> head1Subordinates = head1.getSubordinates();
        List<Worker> head2Subordinates = head2.getSubordinates();
        List<Worker> head3Subordinates = head3.getSubordinates();
        List<Worker> bossSubordinates = boss.getSubordinates();

        assertEquals(3, head1Subordinates.size());
        assertTrue(head1Subordinates.contains(ivan));
        assertTrue(head1Subordinates.contains(vasily));
        assertTrue(head1Subordinates.contains(vladimir));

        assertEquals(2, head2.getSubordinates().size());
        assertTrue(head2Subordinates.contains(mike));
        assertTrue(head2Subordinates.contains(antony));

        assertEquals(1, head3.getSubordinates().size());
        assertTrue(head3Subordinates.contains(roman));

        assertEquals(3, bossSubordinates.size());
        assertTrue(bossSubordinates.contains(head1));
        assertTrue(bossSubordinates.contains(head2));
        assertTrue(bossSubordinates.contains(head3));

        assertHappy(ivan, vasily, vladimir, mike, antony, roman, head1, head2, head3, boss);
    }

    @Test
    @Order(2)
    public void testRemoveWorker() {
        head3.remove(roman);
        assertTrue(head3.getSubordinates().isEmpty());
    }

    @Test
    @Order(3)
    public void testCussOutChain() {
        boss.cussOut();
        assertHappy(head1, head2, boss, roman);
        assertNotHappy(ivan, vasily, vladimir, mike, antony);
    }

    private void assertHappy(Worker... workers) {
        for (Worker worker : workers) {
            assertTrue(worker.isHappy());
        }
    }

    private void assertNotHappy(Worker... workers) {
        for (Worker worker : workers) {
            assertFalse(worker.isHappy());
        }
    }
}
