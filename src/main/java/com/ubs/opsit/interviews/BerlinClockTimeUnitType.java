/**
 * 
 */
package com.ubs.opsit.interviews;

/**
 * This is used to represent Hours, Minutes, Seconds
 * 
 * @author manish
 *
 */
public enum BerlinClockTimeUnitType {
	
	 HOURS("HOURS","HH"),
	 MINUTES("MINUTES","MM"),
	 SECONDS("SECONDS","SS");
	
	private final String timeUnit;
	private final String timeUnitValue;
	
	BerlinClockTimeUnitType(String timeUnit, String timeUnitValue ){
		this.timeUnit=timeUnit;
		this.timeUnitValue=timeUnitValue;
	}
	 
	public String getValue(){
		return timeUnitValue;
	}
	


}
