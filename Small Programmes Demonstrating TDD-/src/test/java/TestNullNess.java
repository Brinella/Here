
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Emma on 21/02/2018.
 */
public class TestNullNess {

        NullNess Ethan;

        @Before
        public void setUp() throws Exception {
            Ethan = new NullNess();
        }

        @After
        public void tearDown() throws Exception {

        }

        @Test
        public void testName() throws Exception {

            String Stanley = Ethan.Names();

            Assert.assertNull("Ethan",Stanley);

        }
}
