
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Emma on 21/02/2018.
 */
public class TestObjectEquality {

    private ObjectEquality Look;

    @Before
    public void Arrange() throws Exception {
        Look = new ObjectEquality();
    }

    @After
    public void breakDownWard() throws Exception {

    }

    @Test
    public void testObjects(){
        String var = Look.name1();
        String hisName = Look.name2();

        Assert.assertEquals(var,hisName);

    }

}
