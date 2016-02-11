package gradleoom;

import java.util.Arrays;

import org.junit.*;
import org.slf4j.*;


/**
 * @author Maxim Butov
 */
public class OOMTest {

    private Logger logger = LoggerFactory.getLogger(OOMTest.class);

    @Test
    public void testOutOfMemory() {

        logger.info("Preparing large string");

        String largeString;
        {
            char[] chars = new char[10 * 1024 * 1024]; // ten mega-chars
            Arrays.fill(chars, 'x');
            largeString = new String(chars);
        }

        logger.info("Large string ready");

        for (int k = 0; k < 1024 * 1024; k++) {
            logger.info("Iteration {}: large string is {}", k, largeString);
        }

    }

}
