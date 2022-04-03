package design_patterns.behavioral.chain_of_responsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainOfResponsibilityTest {

    @Test
    public void test() {
        You you = new You();
        you.setDidTheLessons(false);
        you.setSmokedBehindTheGarages(true);
        you.setWashedTheDishes(false);

        EducationHandler mother = new Mother();
        EducationHandler father = new Father();
        EducationHandler grandmother = new Grandmother();

        mother.setNext(father);
        father.setNext(grandmother);

        mother.handle(you);

        assertEquals(3, you.getTimesScolded());
    }
}
