/**
 * 
 */
package com.ubs.opsit.interviews;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * This class has methods to validate given time value prior to converting the same
 * 
 * @author manish
 * 
 *
 */
public  final class ValidationUtil {

	private ValidationUtil(){
		
	}

	/**
	 * To handle default case and to validate the given time against standard format using Pattern and Matcher
	 * 
	 * @param timeValueAsSting
	 * @return
	 * 
	 */
	public static boolean isValid(String timeValueAsSting){
		
		boolean isValid=Boolean.FALSE;
		
		if(timeValueAsSting != null && !timeValueAsSting.isEmpty()){ 			
			
			switch(timeValueAsSting){
			case TimeConverter.MAX_HH_MM_SS:
				isValid= Boolean.TRUE;
				break;
			default:
				Pattern pattern = Pattern.compile(TimeConverter.REGEX_PATTERN_24_HOUR_FORMAT);
				Matcher matcher= pattern.matcher(timeValueAsSting);
				isValid= matcher.matches();
				break;
			}
		}
		return isValid;
	}
}
