import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;


/**
 * @author ziyin
 * @create 2019-08-08 23:06
 */
public class CalculatorTest {

	@Test
	public void should_add_two_numbers() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		Assert.assertThat(result,is(3));
	}
}
