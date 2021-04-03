import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VuvuzelaTest {

    private Vuvuzela vuvuzela;

    @Before
    public void before() {
        this.vuvuzela = new Vuvuzela(100, "Nike", "Maximum Annoyance", 130);
    }

    @Test
    public void canGetProperties() {
        assertEquals(100, vuvuzela.getWholesaleCost() , 0.0);
        assertEquals(0.30, vuvuzela.getMarkup(), 0.0);
        assertEquals(130, vuvuzela.getRetailPrice(),0.0);
        assertEquals("Nike", vuvuzela.getBrand());
        assertEquals("Maximum Annoyance", vuvuzela.getModel());
        assertEquals(130, vuvuzela.getMaxDecibels());
    }

    @Test
    public void canPlay() {
        assertEquals("Vvvvvv", vuvuzela.play());
    }
}
