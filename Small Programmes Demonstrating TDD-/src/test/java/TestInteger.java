/**
 * Created by Emma on 2/22/2018.
 */
import org.junit.Assert;
import org.junit.Test;

public class TestInteger
{
    Intergers fg = new Intergers();

    @Test(timeout =100)
    public void testAdd() throws Exception {


        int var = fg.addIntegers(5,5);

        Assert.assertEquals(10,var);

    }
}
