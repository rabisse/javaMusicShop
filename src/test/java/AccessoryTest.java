import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    private Accessory ukeString;

    @Before
    public void before() {
        this.ukeString = new Accessory(10, "Ukulele String", "Kala", TypeOfInstrument.UKULELE);
    }

    @Test
    public void canGetProperties() {
        assertEquals(10, ukeString.getWholesaleCost(), 0.0);
        assertEquals(0.50, ukeString.getMarkup(), 0.0);
        assertEquals(15, ukeString.getRetailPrice(),0.0);
        assertEquals("Ukulele String", ukeString.getName());
        assertEquals("Kala", ukeString.getBrand());
        assertEquals(TypeOfInstrument.UKULELE, ukeString.getInstrument());
    }

    @Test
    public void canSetWholesaleCost() {
        ukeString.setWholesaleCost(20);
        assertEquals(30, ukeString.getRetailPrice(), 0.0);
    }

    @Test
    public void canSetMarkup() {
        ukeString.setMarkup(0.25);
        assertEquals(12.50, ukeString.getRetailPrice(), 0.0);
    }

    @Test
    public void canSetRetailPrice() {
        ukeString.setRetailPrice(18);
        assertEquals(0.80, ukeString.getMarkup(), 0.0);
    }
}
