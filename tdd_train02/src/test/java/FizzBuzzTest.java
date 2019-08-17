import com.ziyin.tdd.bo.FizzBUzz;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author ziyin
 * @create 2019-08-09 21:02
 */
public class FizzBuzzTest {


	@ParameterizedTest(name="should return {0} given {1}")
	@CsvSource({
			"1,'1'",
			"3,'Fizz'",
			"5,'Buzz'",
			"15,'FizzBuzz'"
	})
	void test(int input, String words){
		assertThat(FizzBUzz.of(input)).isEqualTo(words);

	}
}
