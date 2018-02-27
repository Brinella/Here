import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Emma on 2/22/2018.
 */
public class TestFalse {

    False notTruth;
    @Before
    public void setUp() throws Exception {
        notTruth  = new False();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testName() throws Exception {

        boolean irregularity = notTruth.name();

        Assert.assertFalse("Is it false", irregularity);
    }

}
