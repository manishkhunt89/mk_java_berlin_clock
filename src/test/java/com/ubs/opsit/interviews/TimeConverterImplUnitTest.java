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
public class TimeConverterImplUnitTest {

	private TimeConverter timeConverter;
	
	private String ipTimeAsString = "";
	private StringBuffer expectedOutput= new StringBuffer();

	private StringBuffer expectedFailOutput= new StringBuffer();
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
		
		timeConverter = new TimeConverterImpl();
	
		ipTimeAsString = "23:59:59";
		expectedOutput.append("O");
		expectedOutput.append(TimeConverter.LINE_SEPARATOR);
		expectedOutput.append("RRRR");
		expectedOutput.append(TimeConverter.LINE_SEPARATOR);
		expectedOutput.append("RRRO");
		expectedOutput.append(TimeConverter.LINE_SEPARATOR);
		expectedOutput.append("YYRYYRYYRYY");
		expectedOutput.append(TimeConverter.LINE_SEPARATOR);
		expectedOutput.append("YYYY");

		expectedFailOutput.append("Y");
		expectedFailOutput.append(TimeConverter.LINE_SEPARATOR);
		expectedFailOutput.append("RRRR");
		expectedFailOutput.append(TimeConverter.LINE_SEPARATOR);
		expectedFailOutput.append("RRRO");
		expectedFailOutput.append(TimeConverter.LINE_SEPARATOR);
		expectedFailOutput.append("YYRYYRYYRYY");
		expectedFailOutput.append(TimeConverter.LINE_SEPARATOR);
		expectedFailOutput.append("YYYY");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void whenTimeValueIsSpecifiedInHHMMSSFormatThenRetunTheConvertedBerlinClockRows() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * O
		 * RRRR
		 * RRRO
		 * YYRYYRYYRYY
		 * YYYY
		 * 
		 */
		assertThat(timeConverter.convertTime(ipTimeAsString), is(expectedOutput.toString()));
	}

	@Test
	public void whenTimeValueIsSpecifiedWithInvalidDelimiterFormatThenRetunTheValidatoinMessage(){
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * Please provide a valid value of time
		 * 
		 */
		assertThat(timeConverter.convertTime("12-12-12:"), is(TimeConverter.INVALID_TIME_MSG));

	}
	
	@Test
	public void whenTimeValueIsSpecifiedAsNullThenRetunTheValidatoinMessage(){
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * Please provide a valid value of time
		 * 
		 */
		assertThat(timeConverter.convertTime(null), is(TimeConverter.INVALID_TIME_MSG));

	}

	
	@Test
	public void whenTimeValueIsSpecifiedAsBlankThenRetunTheValidatoinMessage(){
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * 
		 * Please provide a valid value of time
		 * 
		 */
		assertThat(timeConverter.convertTime(""), is(TimeConverter.INVALID_TIME_MSG));

	}

	
	@Test
	public void whenTimeValueIsSpecifiedInHHMMSSFormatThenCompateTheConvertedBerlinClockRowsToFalse() {
		/**
		 * EXPECTED RESULT
		 * ---------------
		 * O
		 * RRRR
		 * RRRO
		 * YYRYYRYYRYY
		 * YYYY
		 * 
		 */
		assertThat(timeConverter.convertTime(ipTimeAsString).equals(expectedFailOutput.toString()), is(false));
	}

}
