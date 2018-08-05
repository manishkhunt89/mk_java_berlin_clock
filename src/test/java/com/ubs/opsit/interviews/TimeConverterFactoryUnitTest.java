package com.ubs.opsit.interviews;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TimeConverterFactoryUnitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void whenBerlinkClockTimeUnitTypeIsHHThenReturnTimeConverterHoursImpl(){
		/**
		 * EXPECTED RESULT
		 * ---------------
		 *
		 * new TimeConverterHoursImpl()
		 * 
		 */
		new TimeConverterFactory().getInstance(BerlinClockTimeUnitType.HOURS);
	}

	@Test
	public void testConvertTime() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * RROO
		 * RROO
		 * 
		 */
		StringBuffer expectedOutput= new StringBuffer("RROO");
		expectedOutput.append(TimeConverter.LINE_SEPARATOR);
		expectedOutput.append("RROO");
        
		TimeConverterFactory converterFactory = new TimeConverterFactory();
		assertThat(converterFactory.getInstance(BerlinClockTimeUnitType.HOURS).convertTime("12"), is(expectedOutput.toString()));
	}
}
