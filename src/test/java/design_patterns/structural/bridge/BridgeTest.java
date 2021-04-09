package design_patterns.structural.bridge;

import design_patterns.structural.bridge.SexExecutor;
import design_patterns.structural.bridge.exception.SexualAttractionException;
import design_patterns.structural.bridge.orientation.Bi;
import design_patterns.structural.bridge.orientation.Hetero;
import design_patterns.structural.bridge.orientation.Homo;
import design_patterns.structural.bridge.person.Man;
import design_patterns.structural.bridge.person.Woman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BridgeTest {

    @Test
    public void testTwoFaggots() {
        Homo homo = new Homo();
        Man faggot1 = new Man("Тигран", homo);
        Man faggot2 = new Man("Эдик", homo);

        SexExecutor sexExecutor = new SexExecutor();
        sexExecutor.fuck(faggot1, faggot2);
    }

    @Test
    public void testFaggotAndHeteroMan() {
        Homo homo = new Homo();
        Hetero hetero = new Hetero();
        Man faggot = new Man("Тигран", homo);
        Man heteroMan = new Man("Василий", hetero);

        SexExecutor sexExecutor = new SexExecutor();

        assertThrows(SexualAttractionException.class, () -> sexExecutor.fuck(faggot, heteroMan));
    }

    @Test
    public void testFaggotAndWoman() {
        Homo homo = new Homo();
        Hetero hetero = new Hetero();
        Man faggot = new Man("Тигран", homo);
        Woman woman = new Woman("Аня", hetero);

        SexExecutor sexExecutor = new SexExecutor();

        assertThrows(SexualAttractionException.class, () -> sexExecutor.fuck(faggot, woman));
    }

    @Test
    public void testTwoHeteroWomen() {
        Hetero hetero = new Hetero();
        Woman woman1 = new Woman("Аня", hetero);
        Woman woman2 = new Woman("Таня", hetero);

        SexExecutor sexExecutor = new SexExecutor();

        assertThrows(SexualAttractionException.class, () -> sexExecutor.fuck(woman1, woman2));
    }

    @Test
    public void testTwoLesbian() {
        Homo homo = new Homo();
        Woman woman1 = new Woman("Василиса", homo);
        Woman woman2 = new Woman("Белатриса", homo);

        SexExecutor sexExecutor = new SexExecutor();

        sexExecutor.fuck(woman1, woman2);
    }

    @Test
    public void testBiManAndBiWoman() {
        Bi bi = new Bi();
        Man biMan = new Man("Билан", bi);
        Woman biWoman = new Woman("Билана", bi);

        SexExecutor sexExecutor = new SexExecutor();

        sexExecutor.fuck(biMan, biWoman);
    }

    @Test
    public void testTwoBiMen() {
        Bi bi = new Bi();
        Man biMan1 = new Man("Билан", bi);
        Man biMan2 = new Man("Панфилий", bi);

        SexExecutor sexExecutor = new SexExecutor();

        sexExecutor.fuck(biMan1, biMan2);
    }

    @Test
    public void testTwoBiWomen() {
        Bi bi = new Bi();
        Woman biWoman1 = new Woman("Билана", bi);
        Woman biWoman2 = new Woman("Панфилина", bi);

        SexExecutor sexExecutor = new SexExecutor();

        sexExecutor.fuck(biWoman1, biWoman2);
    }

    @Test
    public void testBiWomanAndHeteroMan() {
        Hetero hetero = new Hetero();
        Bi bi = new Bi();
        Woman biWoman = new Woman("Панфилина", bi);
        Man heteroMan = new Man("Василий", hetero);

        SexExecutor sexExecutor = new SexExecutor();

        sexExecutor.fuck(biWoman, heteroMan);
    }
}