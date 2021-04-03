import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    private Accessory ukeString;

    @Before
    public void before() {
        this.ukeString = new Accessory(10, "Ukulele String", "Hawaii Origins", TypeOfInstrument.UKULELE);
    }

    @Test
    public void canGetWholesaleMarkupRetail() {
        assertEquals(10, ukeString.getWholesaleCost() , 0.0);
    }



}
