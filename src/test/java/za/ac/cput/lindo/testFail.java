package za.ac.cput.lindo;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/06.
 */
public class testFail {
    @Test
    public void testFailing() throws Exception {
        Assert.assertTrue(!true);
        Assert.assertFalse(4>3);

    }
}
