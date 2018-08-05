/**
 * 
 */
package com.ubs.opsit.interviews;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author manish
 *
 */
public class TimeConverterSecondsImplUnitTest {

	private TimeConverter timeConverter;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		timeConverter = new TimeConverterSecondsImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void whenTimeValueIsSpecifiedForSSThenRetunTheConvertedBerlinClockSecondsRowEven() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 *
		 * Y
		 * 
		 */
		String secondsTime = "12";
		StringBuffer expectedOutput= new StringBuffer("Y");
		
        assertThat(timeConverter.convertTime(secondsTime), is(expectedOutput.toString()));
	}
	
	@Test
	public void whenTimeValueIsSpecifiedForSSThenRetunTheConvertedBerlinClockSecondsRowOdd() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * O
		 * 
		 */
		String secondsTime = "11";
		StringBuffer expectedOutput= new StringBuffer("O");
		
        assertThat(timeConverter.convertTime(secondsTime), is(expectedOutput.toString()));
	}
}
