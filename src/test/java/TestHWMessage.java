/**
 * Created by TouchSmart on 4/21/14.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class TestHWMessage {
    HWMessage testHW = new HWMessage();
    @Test
    public void testString()
    {
        assertEquals("Hello! SWE437",testHW.hwMessage());
    }
}