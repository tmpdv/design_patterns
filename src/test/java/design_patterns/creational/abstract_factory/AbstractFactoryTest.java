package design_patterns.creational.abstract_factory;

import design_patterns.creational.abstract_factory.domain.insolent.Asshole;
import design_patterns.creational.abstract_factory.domain.insolent.Goat;
import design_patterns.creational.abstract_factory.domain.insolent.Nettle;
import design_patterns.creational.abstract_factory.domain.kaif.Cat;
import design_patterns.creational.abstract_factory.domain.kaif.Ganja;
import design_patterns.creational.abstract_factory.domain.kaif.Hippie;
import design_patterns.creational.abstract_factory.domain.stupid.Idiot;
import design_patterns.creational.abstract_factory.domain.stupid.Oak;
import design_patterns.creational.abstract_factory.domain.stupid.Sheep;
import design_patterns.creational.abstract_factory.factory.impl.InsolentLifeFactory;
import design_patterns.creational.abstract_factory.factory.impl.KaifLifeFactory;
import design_patterns.creational.abstract_factory.factory.impl.StupidLifeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractFactoryTest {

    @Test
    public void testStupid() {
        StupidLifeFactory factory = new StupidLifeFactory();
        assertEquals(Sheep.class, factory.createAnimal().getClass());
        assertEquals(Idiot.class, factory.createHuman().getClass());
        assertEquals(Oak.class, factory.createPlant().getClass());
    }

    @Test
    public void testInsolent() {
        InsolentLifeFactory factory = new InsolentLifeFactory();
        assertEquals(Goat.class, factory.createAnimal().getClass());
        assertEquals(Asshole.class, factory.createHuman().getClass());
        assertEquals(Nettle.class, factory.createPlant().getClass());
    }

    @Test
    public void testKaif() {
        KaifLifeFactory factory = new KaifLifeFactory();
        assertEquals(Cat.class, factory.createAnimal().getClass());
        assertEquals(Hippie.class, factory.createHuman().getClass());
        assertEquals(Ganja.class, factory.createPlant().getClass());
    }
}
