package design_patterns.structural.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AdapterTest {

    private static final int ID_1 = 123;
    private static final int ID_2 = 456;
    private static final String NAME_1 = "Test value number One";
    private static final String NAME_2 = "Test value number Two";

    private static String json1;
    private static String json2;

    private static ValueProvider valueProvider;

    @BeforeEach
    public void init() throws URISyntaxException, IOException {
        URL resource = this.getClass().getClassLoader().getResource("value_1.json");
        byte[] bytes = Files.readAllBytes(Paths.get(Objects.requireNonNull(resource).toURI()));
        json1 = new String(bytes);

        resource = this.getClass().getClassLoader().getResource("value_2.json");
        bytes = Files.readAllBytes(Paths.get(Objects.requireNonNull(resource).toURI()));
        json2 = new String(bytes);

        valueProvider = new ValueProviderImpl(Map.of(ID_1, NAME_1, ID_2, NAME_2));
    }

    @Test
    public void testPrototype() throws JsonProcessingException {
        JsonValueAdapter adapter = new JsonValueAdapter(valueProvider);

        ObjectMapper mapper = new ObjectMapper();

        assertEquals(mapper.readTree(json1), mapper.readTree(adapter.getJson(ID_1)));
        assertEquals(mapper.readTree(json2), mapper.readTree(adapter.getJson(ID_2)));
    }
}
