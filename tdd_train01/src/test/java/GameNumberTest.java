import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * @author ziyin
 * @create 2019-08-08 23:20
 */
public class GameNumberTest {

	@Test
	public void should_say_1_when_value_is_1(){
		assertGameNumber(1, "1");
	}
	@Test
	public void should_say_fizz_when_value_is_dividable_by_3(){
		assertGameNumber(3, "fizz");
	}
	@Test
	public void should_say_buzz_when_value_is_dividable_by_5(){
		assertGameNumber(5, "buzz");
	}
	@Test
	public void should_say_fizzbuzz_when_value_is_dividable_by_15(){
		assertGameNumber(15, "fizzbuzz");
	}
	@Test
	public void should_show_fizz_or_buzz_if_raw_number_contains_3_or_5(){
		assertGameNumber(13, "fizz");
		assertGameNumber(52, "buzz");
		assertGameNumber(51, "fizzbuzz");
		assertGameNumber(53, "fizzbuzz");
	}


	private void assertGameNumber(int actualValue, String expectedValue) {
		GameNumber gameNumber = new GameNumber(actualValue);
		Assert.assertThat(gameNumber.say(),is(expectedValue));
	}
}
