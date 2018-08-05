package com.ubs.opsit.interviews;

public interface TimeConverter {

	public static final  String TIME_DELIMITER= ":";
	public static final  String LINE_SEPARATOR= "\n";
	public static final  String MAX_HH_MM_SS= "24:00:00";
	public static final  String REGEX_PATTERN_24_HOUR_FORMAT = "([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
	public static final  String PROPERTY_FILE_NAME= "Resources.properties";
	
	public static final String INVALID_TIME_MSG = "Please provide a valid value of time";
	
	public static final  int ZERO= 0;
	public static final  int ONE= 1;
	public static final  int TWO= 2;
	public static final  int THREE= 3;
	public static final  int FOUR= 4;
	public static final  int FIVE= 5;
	public static final  int ELEVEN= 11;
	
    String convertTime(String aTime);

}
