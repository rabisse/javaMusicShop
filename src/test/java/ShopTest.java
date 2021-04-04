import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Vuvuzela vuvuzela;
    private Triangle triangle;
    private Ukulele ukulele;
    private Accessory ukeString;


    @Before
    public void before() {
        this.shop = new Shop();
        this.vuvuzela = new Vuvuzela(100, "Nike", "Maximum Annoyance", 130);
        this.triangle = new Triangle(100, "Zildjian", "Basic Shapes", 8);
        this.ukulele = new Ukulele(1000, "Kala", "Surf's Up", UkuleleSize.TENOR);
        this.ukeString = new Accessory(10, "Ukulele String", "Kala", TypeOfInstrument.UKULELE);
    }

    @Test
    public void shopStockStartsEmpty() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddInstrumentAndAccessoryToStock() {
        shop.addItemToStock(vuvuzela);
        shop.addItemToStock(ukeString);
        assertEquals(2, shop.stockCount());
    }


}
