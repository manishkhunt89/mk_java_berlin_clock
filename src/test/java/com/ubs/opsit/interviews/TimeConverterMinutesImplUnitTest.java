/**
 * 
 */
package com.ubs.opsit.interviews;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author manish
 *
 */
public class TimeConverterMinutesImplUnitTest {

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
		timeConverter = new TimeConverterMinutesImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void whenTimeValueIsSpecifiedForMMThenRetunTheConvertedBerlinClockMinutesRows() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * YYRYYRYYRYY
		 * YYYY
		 * 
		 */
		String minutesTime = "59";
		StringBuffer expectedOutput= new StringBuffer("YYRYYRYYRYY");
		expectedOutput.append(TimeConverter.LINE_SEPARATOR);
		expectedOutput.append("YYYY");
		
        assertThat(timeConverter.convertTime(minutesTime), is(expectedOutput.toString()));
	}

	@Test
	public void whenTimeValueIsSpecifiedForMMThenRetunTheConvertedBerlinClockMinutesTopRow() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * YYRYYRYYROO
		 * 
		 */
		int minutesTime = 9;
		StringBuffer expectedOutput= new StringBuffer("YYRYYRYYROO");
		StringBuffer inprocessString= new StringBuffer();
		try{
				Method method = timeConverter.getClass().getDeclaredMethod("populateMinutesRow",new Class[]{int.class,StringBuffer.class});
				method.setAccessible(true);
				method.invoke(timeConverter,minutesTime, inprocessString);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
        assertThat(inprocessString.toString(), is(expectedOutput.toString()));
	}
}
