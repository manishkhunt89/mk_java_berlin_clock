/**
 * 
 */
package com.ubs.opsit.interviews;

/**
 * This class is used to convert the minutes value to the Berlin clock string representation(fourth and fifth row)
 * 
 * @author manish
 *
 */
public class TimeConverterMinutesImpl extends TimeConverterHoursImpl implements TimeConverter  {

	/* (non-Javadoc)
	 * @see com.ubs.opsit.interviews.TimeConverter#convertTime(java.lang.String)
	 */
	@Override
	public String convertTime(String aTime) {
		StringBuffer minutesString = new StringBuffer();
		
		//to populate top row of minutes
		populateMinutesRow(Integer.valueOf(aTime)/TimeConverter.FIVE, minutesString);
		minutesString.append(TimeConverter.LINE_SEPARATOR);
		
		//to populate bottom row of minutes
		populateRow(Integer.valueOf(aTime)%TimeConverter.FIVE, minutesString,BerlinClockTimeUnitType.MINUTES);
		return minutesString.toString();
	}

	
	/**
	 * used to populate the fourth row having eleven slots and each slot represents five minute
	 * 
	 * @param firstMinutesRow
	 * @param minutesString
	 *  
	 */
	private void populateMinutesRow(int firstMinutesRow,StringBuffer minutesString){
		 
		for(int i=TimeConverter.ONE;i<=TimeConverter.ELEVEN;i++){
			if(firstMinutesRow >= i){
				if(i % TimeConverter.THREE == TimeConverter.ZERO ){
					minutesString.append(BerlinClockColor.RED.getValue());
				}else{
					minutesString.append(BerlinClockColor.YELLOW.getValue());
				}
			}
			else{
				minutesString.append(BerlinClockColor.DEFAULT.getValue());
			}
		}
	}
}
