import static java.lang.String.valueOf;

/**
 * @author ziyin
 * @create 2019-08-08 23:22
 */
public class GameNumber {
	private int value;

	public GameNumber(int i) {
		value = i;
	}

	public String say(){
		if (isRelatedTo(5) && isRelatedTo(3)){
			return "fizzbuzz";
		}
		if (isRelatedTo(5)) {
			return "buzz";
		}
		if (isRelatedTo(3)) {
			return "fizz";
		}

		return valueOf(value);
	}

	private boolean isRelatedTo(int base) {
		return value % base == 0 || valueOf(value).contains(valueOf(base));
	}
}
