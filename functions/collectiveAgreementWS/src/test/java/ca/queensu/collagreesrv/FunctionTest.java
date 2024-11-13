package ca.queensu.collagreesrv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for Function class.
 */
public class FunctionTest {
    /**
     * Unit test for HttpTriggerJava method.
     */
    @Test
    public void testHttpTriggerJava() throws Exception {

        final boolean ret = new CheckSROR().run();
        // Verify
        assertEquals(true, ret);
    }
}
