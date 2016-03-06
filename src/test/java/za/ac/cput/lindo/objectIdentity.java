package za.ac.cput.lindo;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/06.
 */
public class objectIdentity {
    private lecturer lect;
    private student science;
    private student design;

    @Before
    public void setUp() throws Exception {
        lect = new  lecturer("Mike", "Engineering");
        science = new student("Cindy", "Science");
        design = new student("Ben","Design");
    }

    @Test
    public void testObjectIdentity() throws Exception {
        Assert.assertSame(science, science);
        Assert.assertNotSame(design,lect);
    }
}
