package com.abma.peter;
//import org.slf4j.*;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello worldbbbb!
 *
 */
public class Traak 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello xxcccxxhgggggggxxxooooooooPeters World!" );
        BasicConfigurator.configure();
		Logger logger = LoggerFactory.getLogger(Traak.class);
		logger.info("Ongelofelijk dit allemaal !!!!!!");
		 System.out.println( "Hello nog steeds verbaasd" );
		 logger.error("Ongelofelijk dit allemaal 222222");
		 
    }
}
