package com.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demologing {
	
	static 
	Logger Logger = LogManager.getLogger(Demologing.class);

	public static void main(String[] args) {
		System.out.println("Started");
		
		Logger.trace("This is trace Message");
		Logger.info("This is Info Message");
		Logger.error("This is error Message");
		Logger.warn("This is warning Message");
		Logger.fatal("This is fatal Message");
		
		System.out.println("Completed");

	}

}
