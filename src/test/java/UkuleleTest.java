import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UkuleleTest {

    private Ukulele ukulele;

    @Before
    public void before() {
        this.ukulele = new Ukulele(1000, "Kala", "Surf's Up", UkuleleSize.TENOR);
    }

    @Test
    public void canGetProperties() {
        assertEquals(1000, ukulele.getWholesaleCost() , 0.0);
        assertEquals(0.30, ukulele.getMarkup(), 0.0);
        assertEquals(1300, ukulele.getRetailPrice(),0.0);
        assertEquals("Kala", ukulele.getBrand());
        assertEquals("Surf's Up", ukulele.getModel());
        assertEquals(UkuleleSize.TENOR, ukulele.getUkuleleSize());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum strum", ukulele.play());
    }
}
