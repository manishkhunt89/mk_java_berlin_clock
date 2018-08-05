/**
 * 
 */
package com.ubs.opsit.interviews;


/**
 *This class is used to strategically decide which Time Converter implementation to call at run time
 * 
 * @author manish
 *
 *
 */
public class TimeConverterFactory {

	/**
	 * 
	 */
	
	public TimeConverterFactory() {
		
	}
	
	private static TimeConverter timeConverter;
	
	/**
	 * To get the specific Time Converter implementation class
	 * 
	 * @param timeUnitType
	 * 
	 */
	public static TimeConverter getInstance(BerlinClockTimeUnitType timeUnitType) {
			
			switch(timeUnitType){
			case HOURS:
				timeConverter = new TimeConverterHoursImpl();
				break;
			case MINUTES:
				timeConverter = new TimeConverterMinutesImpl();
				break;
			case SECONDS:
				timeConverter = new TimeConverterSecondsImpl();
				break;
			}
		return timeConverter;
	}

}
