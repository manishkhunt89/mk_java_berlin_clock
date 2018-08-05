/**
 * 
 */
package com.ubs.opsit.interviews;

/**
 * This is used to represent a time slot color in the Berlin clock
 * 
 * @author manish
 *
 */
public enum BerlinClockColor {
	
	 RED("RED","R"),
	 YELLOW("YELLOW","Y"),
	 DEFAULT("DEFAULT","O");
	
	private final String colorValue;
	private final String colorToDisplay;
	
	BerlinClockColor(String colorValue, String colorToDisplay ){
		this.colorValue=colorValue;
		this.colorToDisplay=colorToDisplay;
	}
	 
	public String getValue(){
		return colorToDisplay;
	}
	


}
