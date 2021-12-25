package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	StringHelper helper;
	@Before
	public void before() {
		helper = new StringHelper();
	}

	@Test
	public void testtruncateAInFirst2Positions() {
		assertEquals(helper.truncateAInFirst2Positions("AACD"),"CD");
		//assertEquals("ABC","ABCD");	
	}
	@Test
	public void test2() {
		assertEquals(helper.truncateAInFirst2Positions("ACD"),"CD");	
	}
	@Test
	public void testareFirstAndLastTwoCharactersTheSame(){
		assertEquals(true,helper.areFirstAndLastTwoCharactersTheSame("CD"));	
	}
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_Negative(){
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));	
	}
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_Postive(){
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));	
	}
	

}
