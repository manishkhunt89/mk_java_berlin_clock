/**
 * 
 */
package com.ubs.opsit.interviews;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author manish
 *
 */
public class TimeConverterHoursImplUnitTest {

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
	@Before
	public void setUp() throws Exception {
		timeConverter = new TimeConverterHoursImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void whenTimeValueIsSpecifiedForHHThenRetunTheConvertedBerlinClockHourRows() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * RROO
		 * RROO
		 * 
		 */
		String hoursTime = "12";
		StringBuffer expectedOutput= new StringBuffer("RROO");
		expectedOutput.append(TimeConverter.LINE_SEPARATOR);
		expectedOutput.append("RROO");
		
        assertThat(timeConverter.convertTime(hoursTime), is(expectedOutput.toString()));
	}
	
	@Test
	public void whenTimeValueIsSpecifiedForHHThenRetunTheConvertedBerlinClockHourTopRow() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * RROO
		 * 
		 */
		String hoursTime = "12";
		StringBuffer expectedOutput= new StringBuffer("RROO");
		StringBuffer inprocessString= new StringBuffer();
		new TimeConverterHoursImpl().populateRow(Integer.valueOf(hoursTime)/TimeConverter.FIVE, inprocessString, BerlinClockTimeUnitType.HOURS);
        assertThat(inprocessString.toString(), is(expectedOutput.toString()));
	}

}
