package design_patterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void test() {
        Decorator decorator = new NahSender(new CuntSender(new AssSender()));

        NahSender nahSender = new NahSender();
        CuntSender cuntSender = new CuntSender();
        AssSender assSender = new AssSender();

        assertEquals(String.join("\n",
                nahSender.get(), cuntSender.get(), assSender.get()),
                decorator.get());
    }
}
