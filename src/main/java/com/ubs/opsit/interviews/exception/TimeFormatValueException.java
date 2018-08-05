/**
 * 
 */
package com.ubs.opsit.interviews.exception;

/**
 * A custom Exception class used return user understandable message in case of any exception/validation failure
 * 
 * @author manish
 *
 */
public class TimeFormatValueException extends Exception {


	/**
	 * Used to send proper message to user in case of invalid time value
	 *  
	 * @param arg0
	 *
	 */
	public TimeFormatValueException(String arg0) {
		super(arg0);
	}

}
