package com.ziyin.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author ziyin
 * @create 2019-08-14 19:22
 */
public class ArgsTest {


	@Test
	public void test(){
		Args args = new Args("l:bool,d:str,p:int","-l true -d /usr/local -p 8080");
		assertEquals(args.getValue("l"),Boolean.TRUE);
		assertEquals(args.getValue("d"),"/usr/local");
		assertEquals(args.getValue("p"),new Integer(8080));
	}

	public void test_with_number(){
		Args args = new Args("l:bool,d:str,p:int","-l -p -9");

	}

}
