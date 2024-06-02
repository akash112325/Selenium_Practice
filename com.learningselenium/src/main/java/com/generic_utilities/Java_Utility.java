package com.generic_utilities;

import java.util.Date;

public class Java_Utility {

	public static String currentDate() {
		String time = new Date().toString();
		String res= time.replace(" ", "_").replace(":", "_");
		 return res;
	}
 
}
