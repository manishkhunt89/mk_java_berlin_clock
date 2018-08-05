/**
 * 
 */
package com.ubs.opsit.interviews.exception;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ubs.opsit.interviews.TimeConverter;

/**
 * @author manish
 *
 */
public class TimeFormatValueExceptionUnitTest {

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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void whenTimeFormatValueExceptionThenReturnValidationMessgeAsString() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * Please provide a valid value of time
		 * 
		 */
		assertThat(new TimeFormatValueException(TimeConverter.INVALID_TIME_MSG).getMessage(), is(TimeConverter.INVALID_TIME_MSG));
	}

}
