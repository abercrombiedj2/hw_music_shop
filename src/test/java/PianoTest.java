import instruments.Piano;
import instruments.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Beech", "Black", Type.KEYBOARDS, 1995.00, 3495.00);
    }

    @Test
    public void canPlay(){
        assertEquals("Tinkle tinkle", piano.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(1500.00, piano.calculateMarkup(), 0);
    }
}
