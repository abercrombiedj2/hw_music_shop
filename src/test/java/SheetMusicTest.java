import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp(){
        sheetMusic = new SheetMusic("Beethoven Symphony No. 9", 3.90, 9.90);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(6.00, sheetMusic.calculateMarkup(), 0);
    }
}
