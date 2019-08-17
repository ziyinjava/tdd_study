package com.ziyin.tdd.bo;

/**
 * @author ziyin
 * @create 2019-08-09 21:12
 */
public class FizzBUzz {
	public static String of(int input) {
		String result = "";
		if (input % 3 == 0) {
			 result += "Fizz";
		}
		if (input % 5 == 0) {
			 result += "Buzz";
		}
		if (result.isEmpty()){
			result += input;
		}
		return result;

	}
}