package za.ac.cput.lindo;

import org.junit.Test;

/**
 * Created by LILO on 2016/03/06.
 */
public class testExceptionTimeout {
    @Test(timeout = 11)
    public void testTimeout() throws Exception {
        while (true) {
            System.out.close();
        }
    }
}
