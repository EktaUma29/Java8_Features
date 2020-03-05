package com.log;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class GfG {

	public static void main(String[] args) throws SecurityException, IOException {
		
		final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		DemoLogger obj = new DemoLogger();
		obj.makeSomeLog();
		
		FileHandler fh = new FileHandler("server_log_.log");
		fh.setFormatter(new SimpleFormatter());
		log.addHandler(fh);
		
		log.setLevel(Level.ALL);
		
		
		log.info("Hey its Working............");
		
		

		log.log(Level.ALL, "This is a log message");

	}
}
