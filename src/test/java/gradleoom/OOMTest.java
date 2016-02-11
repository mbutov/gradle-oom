package gradleoom;

import org.junit.Test;

/**
 * @author Maxim Butov
 */
public class OOMTest {

    @Test
    public void testOutOfMemory() throws Throwable {

        System.out.println("Generating many lines of output");

        // 1M iterations is enough for Gradle (-Xmx128m), 1G - for Idea (-Xmx4096m)
        for (int totalEols = 0; totalEols < 1000 * 1000; totalEols++) {

            System.out.println();

        }

    }

}
