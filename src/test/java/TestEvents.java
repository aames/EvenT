import net.ajed.event.core.Event;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * EvenT
 * PACKAGE_NAME
 * 2016
 */
public class TestEvents {

    private Event e;

    @Before
    public void setUp(){
        e = new Event("aUniqueEvent", "This event is an event to test events");
    }

    @Test
    public void createBasicEvents(){
        assert(e.getUniqueName().equals("aUniqueEvent"));
    }

    @Test
    public void testCompletion(){
        assertEquals(e.getDateTimeCompleted(), null);
        e.registerCompletion("Completed");
        assertNotEquals(e.getDateTimeCompleted(), null);
    }

}
