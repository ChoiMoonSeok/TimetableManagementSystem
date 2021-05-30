package log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;
	
	public EventLogger(String filename) {
		try {
			logmanager = LogManager.getLogManager();
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler = new FileHandler(filename);
			filehandler.setFormatter((new SimpleFormatter()));
			logger.addHandler(filehandler);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public void log(String LogMessage) {
		logger.info(LogMessage);
	}
}