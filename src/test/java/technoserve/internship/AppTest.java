package technoserve.internship;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppMessage() {
        assertEquals("Hello, Maven!", App.getMessage());
    }

    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
    }

}
