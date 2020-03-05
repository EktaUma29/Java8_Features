package TimeoutTest;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutTest {
	//global timeout rule
    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

	//This test will be failed, because it will take more than 1 second to finish!
    @Test
    public void testSlowMethod1() throws InterruptedException {
        //...
        TimeUnit.SECONDS.sleep(5);
    }

	//passed
    @Test
    public void testSlowMethod2() {
        //...
    }
}
