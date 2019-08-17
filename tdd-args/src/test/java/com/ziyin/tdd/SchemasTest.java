package com.ziyin.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ziyin
 * @create 2019-08-14 20:19
 */
public class SchemasTest {

	@Test
	public void test_boolean(){
		Schemas schema = new Schemas("l:bool");
		assertEquals(schema.getValue("l","true"),Boolean.TRUE);
		assertEquals(schema.getValue("l","false"),Boolean.FALSE);
		assertEquals(schema.getValue("l",null),Boolean.FALSE);
	}

	@Test
	public void test_int(){
		Schemas schemas = new Schemas("p:int");
		assertEquals(schemas.getValue("p","1"),new Integer(1));
	}


	@Test
	public void test_str(){
		Schemas schemas = new Schemas("d:str");
		assertEquals(schemas.getValue("d","hello"),"hello");
	}
}
