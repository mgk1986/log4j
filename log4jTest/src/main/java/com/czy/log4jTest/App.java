package com.czy.log4jTest;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Logger logger = Logger.getLogger(App.class);
    	logger.error("Error Logs");
        //System.out.println( "Hello World!" );
    }
}
