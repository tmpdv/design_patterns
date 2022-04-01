package design_patterns.structural.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ProxyTest {

    @Test
    public void testNotCrushed() {
        Proxy proxy = new Proxy();
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                proxy.crush(null)
        );
        assertEquals("Unable to crush nothing", exception.getMessage());
        assertEquals(proxy.getMessages(), List.of());
        assertNull(proxy.getHeavyObject());
    }

    @Test
    public void testCrushed() {
        Proxy proxy = new Proxy();
        proxy.crush("Worm");
        assertNotNull(proxy.getHeavyObject());
        assertEquals(1, proxy.getMessages().size());
        assertEquals("Worm was crushed", proxy.getMessages().get(0));
    }
}
