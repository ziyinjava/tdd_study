package com.ziyin.tdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ziyin
 * @create 2019-08-14 20:22
 */
public class Schemas {

	//存储所有schema
	private Map<String,String> schemas;

	public Schemas(String schemaConfig) {
		schemas = new HashMap<>();
		Arrays.asList(schemaConfig.split(",")).stream().forEach(flag -> {
			String[] nameValue = flag.split(":");
			schemas.put(nameValue[0], nameValue[1]);

		});
	}

	public Object getValue(String name, String strValue) {
		String type = schemas.get(name);
		switch (type) {
			case "bool":
				return "true".equalsIgnoreCase(strValue);
			case "int":
				return Integer.parseInt(strValue);
			default:
				return strValue;
		}
	}
}
