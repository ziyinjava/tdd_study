package com.ziyin.tdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

/**
 * @author ziyin
 * @create 2019-08-14 21:06
 */
public class Command {

	Map<String,String> values;

	public Command(String commandLine) {
		values = new HashMap<>();
		ListIterator<String> commandIterator = Arrays.asList(commandLine.split("\\s+")).listIterator();
		while(commandIterator.hasNext()) {
			String name = commandIterator.next().substring(1);
			if (commandIterator.hasNext()) {
				String value = commandIterator.next();
				if (isValue(value)) {
					values.put(name,value);
				} else {
					commandIterator.previous();
				}
			}
		}
	}

	private boolean isValue(String value) {
		if (value.charAt(0) != '-'){
			if (value.length() > 2) {
				return true;
			}
			if (value.charAt(1) >= '0' && value.charAt(1) <= '9'){
				return true;
			}
			return false;
		}
		return true;
	}

	public  String getValue(String name) {
		return values.get(name);
	}
}
