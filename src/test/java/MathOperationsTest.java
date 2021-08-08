import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class MathOperationsTest {
    private MathOperations mathOperations;

    @Before
    public void before() throws Exception {
        mathOperations = new MathOperations();
    }

    @Test
    public void add() {
        assertEquals(4, mathOperations.add(2,2));
    }
}