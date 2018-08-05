/**
 * 
 */
package com.ubs.opsit.interviews;

/**
 * 
 * This class is used to convert the seconds value to berlin clock string representation(top/first row)
 * 
 * 
 * @author manish
 *
 */
public class TimeConverterSecondsImpl implements TimeConverter {

	/** used to populate top row having one slot which gets blink every two second
	 * 
	 * @see com.ubs.opsit.interviews.TimeConverter#convertTime(java.lang.String)
	 *  
	 */
	@Override
	public String convertTime(String aTime) {
		StringBuffer secondsString = new StringBuffer();

		// to populate the top row/seconds
		secondsString.append((Integer.valueOf(aTime) % TimeConverter.TWO == TimeConverter.ZERO)
				? BerlinClockColor.YELLOW.getValue() : BerlinClockColor.DEFAULT.getValue());

		return secondsString.toString();

	}

}
