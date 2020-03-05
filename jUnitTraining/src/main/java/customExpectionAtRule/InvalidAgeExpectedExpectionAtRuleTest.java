package customExpectionAtRule;

import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InvalidAgeExpectedExpectionAtRuleTest {
	@Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testDivisionWithException() throws InvalidAgeException {

    	  TestCustomException1.validate(21);
        thrown.expect(InvalidAgeException.class);
        thrown.expectMessage("not valid");
        
        //TestCustomException1 testCustomException1 = new TestCustomException1();
      
        

    }
}
