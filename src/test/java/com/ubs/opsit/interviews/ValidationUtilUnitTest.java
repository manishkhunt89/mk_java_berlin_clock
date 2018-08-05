package com.ubs.opsit.interviews;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ValidationUtilUnitTest {

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
	public void whenMinTimeValueIsSpecifiedInCorrectFormatThenRetunValidationSuccessAsTrue() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * true
		 * 
		 */
		String timeValueAsSting = "00:00:00";
        assertThat(ValidationUtil.isValid(timeValueAsSting), is(true));
	}

	
	@Test
	public void whenMaxTimeValueIsSpecifiedInCorrectFormatThenRetunValidationSuccessAsTrue() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * true
		 * 
		 */
		String timeValueAsSting = "24:00:00";
        assertThat(ValidationUtil.isValid(timeValueAsSting), is(true));
	}

	@Test
	public void whenWrongTimeValueIsSpecifiedInCorrectFormatThenRetunValidationSuccessAsFalse() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * false
		 * 
		 */

		String timeValueAsSting = "24:01:00";
        assertThat(ValidationUtil.isValid(timeValueAsSting), is(false));
	}
	
	@Test
	public void whenTimeValueIsSpecifiedWithInCorrectFormatThenRetunValidationSuccessAsFalse() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * false
		 * 
		 */

		String timeValueAsSting = "23:01:5a";
        assertThat(ValidationUtil.isValid(timeValueAsSting), is(false));
	}
	
	@Test
	public void whenTimeValueIsSpecifiedAsNullThenRetunValidationSuccessAsFalse() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * false
		 * 
		 */

		String timeValueAsSting = null;
        assertThat(ValidationUtil.isValid(timeValueAsSting), is(false));
	}


}
