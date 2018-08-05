/**
 * 
 */
package com.ubs.opsit.interviews;

/**
 * This class is used to convert the hours value to berlin clock string representation(second and third row) 
 * 
 * @author manish
 *
 */
public class TimeConverterHoursImpl implements TimeConverter {


	/* (non-Javadoc)
	 * @see com.ubs.opsit.interviews.TimeConverter#convertTime(java.lang.String)
	 */
	@Override
	public String convertTime(String aTime) {
		StringBuffer hoursString = new StringBuffer();
		
		//to populate top row of hours
		populateRow( Integer.valueOf(aTime)/TimeConverter.FIVE, hoursString,BerlinClockTimeUnitType.HOURS);
		hoursString.append(TimeConverter.LINE_SEPARATOR);
		
		//to populate bottom row of hours
		populateRow(Integer.valueOf(aTime)%TimeConverter.FIVE, hoursString,BerlinClockTimeUnitType.HOURS);
		return hoursString.toString();
	}

	/**
	 * Used to populate values for second, third and fifth row from the top as below
	 *  a) second row having four slots each slot represents five hour
	 *  b) third row having four slots each slot represents one hour
	 *  c) fifth row having four slots each slot represents one minute
	 *  
	 * @param timeUnitValue
	 * @param timeUnitValueString
	 * @param timeUnit
	 * 
	 */
	public void populateRow(int timeUnitValue,StringBuffer timeUnitValueString, BerlinClockTimeUnitType timeUnitType){
		 
		for(int i=TimeConverter.ONE;i<=TimeConverter.FOUR;i++){
			if(timeUnitValue >= i){
				if(BerlinClockTimeUnitType.HOURS.getValue().equals(timeUnitType.getValue())){
					timeUnitValueString.append(BerlinClockColor.RED.getValue());
				}
				else{
					timeUnitValueString.append(BerlinClockColor.YELLOW.getValue());
				}
			}
			else{
				timeUnitValueString.append(BerlinClockColor.DEFAULT.getValue());
			}
		}
	}
	
}
