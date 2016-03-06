package za.ac.cput.lindo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by LILO on 2016/03/06.
 */
public class testArrays {
    @Test
    public void testArrayMethod() throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        for(int counter = 0; counter < list.size(); counter++) {
            Assert.assertNull(list.indexOf(counter));
        }

    }
}
