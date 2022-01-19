package com.log4j;
//6. Demonstrate use of Log4j
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Hello Log4j.....! \n");
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is a warn message");
		logger.fatal("This is a fatal message");
		System.out.println("\n Completed");	
	}
}
