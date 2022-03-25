import accessories.DrumSticks;
import accessories.SheetMusic;
import instruments.DrumKit;
import instruments.Piano;
import instruments.Type;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;


import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    DrumKit drumKit;
    SheetMusic sheetMusic;
    DrumSticks drumSticks;

    @Before
    public void setUp(){
        piano = new Piano("Beech", "Black", Type.KEYBOARDS, 1995.00, 3495.00);
        sheetMusic = new SheetMusic("Beethoven Symphony No. 9", 3.90, 9.90);
        drumKit = new DrumKit("Maple", "Brown", Type.PERCUSSION, 999.00, 2999.00);
        drumSticks = new DrumSticks("Vic Firth Wood Tip", 1.99, 24.99);
        shop = new Shop();
    }

    @Test
    public void canAddInstrumentToStock(){
        shop.addToStock(piano);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canAddAccessoryToStock(){
        shop.addToStock(sheetMusic);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addToStock(drumKit);
        shop.addToStock(drumSticks);
        shop.removeFromStock(drumKit);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addToStock(piano);
        shop.addToStock(sheetMusic);
        shop.addToStock(drumKit);
        shop.addToStock(drumSticks);
        assertEquals(3529.00, shop.calculateTotalPotentialProfit(), 0);
    }
}
