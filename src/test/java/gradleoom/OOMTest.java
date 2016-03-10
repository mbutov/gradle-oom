package gradleoom;

import org.junit.Test;

/**
 * @author Maxim Butov
 */
public class OOMTest {

    @Test
    public void testOutOfMemory() throws Throwable {

        System.out.println("Generating many lines of output");

        // "gradle test" will throw "java.lang.OutOfMemoryError: GC overhead limit exceeded"
        //
        // Idea 15 (143.2287) with memory option -Xmx4096m runs this test for 1-2 minutes
        // then it consumes all CPU time.
        //
        // Tested on Ubuntu 14.04, zulu8.13.0.5-jdk8.0.72-linux_x64.
        //
        // Before running this test, start "sleep 180 && pkill -9 -f idea" in terminal.

        for (;;) {

            System.out.println();

        }

    }

}
