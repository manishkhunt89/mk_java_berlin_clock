/**
 * 
 */
package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.exception.TimeFormatValueException;

/**
 * Main class which converts the time value(24 hr format) to berlin clock  string representation
 * 
 * @author manish
 *
 */
public class TimeConverterImpl implements TimeConverter {

	/**
	 * 
	 * Extracts the hours,minutes,seconds and converts them to strings respectively and consolidate to final string representation
	 * 
	 * @see com.ubs.opsit.interviews.TimeConverter#convertTime(java.lang.String)
	 * validates the given time String and converts if valid
	 */
	@Override
	public String convertTime(String aTime) {
		try{
			if(ValidationUtil.isValid(aTime)){
				StringBuffer convertedBerlinClockString= new StringBuffer();
				
				String[] timeUnits =  aTime.split(TimeConverter.TIME_DELIMITER);
				//to Convert the seconds
				convertByTimeUnitType(BerlinClockTimeUnitType.SECONDS, timeUnits[TimeConverter.TWO],convertedBerlinClockString, Boolean.TRUE);
				//to Convert the hours
				convertByTimeUnitType(BerlinClockTimeUnitType.HOURS, timeUnits[TimeConverter.ZERO], convertedBerlinClockString,Boolean.TRUE);
				//to Convert the minutes
				convertByTimeUnitType(BerlinClockTimeUnitType.MINUTES, timeUnits[TimeConverter.ONE],convertedBerlinClockString, Boolean.FALSE);
				
				return convertedBerlinClockString.toString();
			}else{
				throw new TimeFormatValueException(TimeConverter.INVALID_TIME_MSG);
			}
		}catch (TimeFormatValueException e) {
			return e.getMessage();
		}
	}
	
	/**
	 * To convert each Time Unit value based on strategic Implementation class.
	 * 
	 * @param timeUnitType
	 * @param timeUnit
	 * @param convertedBerlinClockString
	 * @param isAppendLine
	 */
	private void convertByTimeUnitType(BerlinClockTimeUnitType timeUnitType,String timeUnit,StringBuffer convertedBerlinClockString,boolean isAppendLine){
		
		convertedBerlinClockString.append(TimeConverterFactory.getInstance(timeUnitType).convertTime(timeUnit));
		if(isAppendLine)
			convertedBerlinClockString.append(TimeConverter.LINE_SEPARATOR);
	}
}
