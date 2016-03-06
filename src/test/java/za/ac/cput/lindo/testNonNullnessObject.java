package za.ac.cput.lindo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/06.
 */
public class testNonNullnessObject {
    private lecturer lect;

    @Before
    public void setUp() throws Exception {
        lect = new lecturer("Mike","Engineering");

    }

    @Test
    public void testNonNullnessObject() throws Exception {
        Assert.assertNotNull(lect);
    }
}
