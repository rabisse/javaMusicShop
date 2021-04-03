import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void before() {
        this.triangle = new Triangle(100, "Zildjian", "Basic Shapes", 8);
    }

    @Test
    public void canGetProperties() {
        assertEquals(100, triangle.getWholesaleCost() , 0.0);
        assertEquals(0.30, triangle.getMarkup(), 0.0);
        assertEquals(130, triangle.getRetailPrice(),0.0);
        assertEquals("Zildjian", triangle.getBrand());
        assertEquals("Basic Shapes", triangle.getModel());
        assertEquals(8, triangle.getGauge());
    }

    @Test
    public void canPlay() {
        assertEquals("Ding", triangle.play());
    }
}
