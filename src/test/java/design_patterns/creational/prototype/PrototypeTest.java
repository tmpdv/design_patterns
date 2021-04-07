package design_patterns.creational.prototype;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static design_patterns.creational.prototype.RandomUtil.randomCloneName;
import static design_patterns.creational.prototype.RandomUtil.randomIntInRange;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PrototypeTest {

    @Test
    public void testCloneYuri() {
        CloneableHuman yuri = new Yuri(60, 500, 320);
        CloneableHuman clone = yuri.cloneHuman();

        assertEquals(Yuri.class, clone.getClass());
        assertEquals(yuri, clone);
        assertEquals("Yuri", yuri.getName());
        assertEquals("Yuri", clone.getName());
    }

    @Test
    public void testRepublicClone() {
        CloneableHuman prototype = new RepublicClone("Boba Fett", 120, 150, 180, 220);
        CloneableHuman clone = prototype.cloneHuman();

        assertEquals(RepublicClone.class, clone.getClass());
        assertEquals(prototype, clone);
        assertNotEquals(prototype.getName(), clone.getName());
    }

    @Test
    public void testMultipleClones() {
        List<CloneableHuman> prototypeList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            prototypeList.add(new RepublicClone(randomCloneName(), randomIntInRange(100, 200),
                    randomIntInRange(120, 220), randomIntInRange(120, 260), randomIntInRange(145, 240)));
        }

        List<CloneableHuman> cloneList = prototypeList.stream()
                .map(CloneableHuman::cloneHuman).collect(Collectors.toList());

        for (int i = 0; i < 100; i++) {
            assertEquals(prototypeList.get(i), cloneList.get(i));
        }
    }
}
