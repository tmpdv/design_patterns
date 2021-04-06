package design_patterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {

    @Test
    public void testBlackBoar() {
        String name = "Луиджи";
        int age = 10;
        String color = "Black";
        String breed = "Любимое домашнее животное";

        Cat expected = new Cat(name, age, false, color, breed, true);

        assertEquals(expected, new CatManualBuilder()
                .name(name).age(age).isFat(false)
                .color(color).breed(breed).hasTesticles(true)
                .build());
    }

    @Test
    public void testBars() {
        String name = "Барсик";
        int age = 2;
        String color = "Grey";
        String breed = "Любимое домашнее животное";

        Cat expected = new Cat(name, age, true, color, breed, false);

        assertEquals(expected, new CatManualBuilder()
                .name(name).age(age).isFat(true)
                .color(color).breed(breed).hasTesticles(false)
                .build());
    }
}
