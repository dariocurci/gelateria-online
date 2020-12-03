package it.unipd.tos.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {

	@Test
	public void test() {
		Time ora1=new Time(20);
		Time ora2=new Time(30);
		Time ora3=new Time(-10);
		
		assertEquals(20,ora1.getOra());
		assertEquals(0,ora2.getOra());
		assertEquals(0,ora3.getOra());
	}

}
