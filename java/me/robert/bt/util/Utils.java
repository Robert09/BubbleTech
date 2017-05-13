package me.robert.bt.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils {

	private static Logger logger;
	private static Lang lang;

	public static Logger getLogger() {
		if (logger == null)
			logger = LogManager.getFormatterLogger(Reference.MOD_ID);
		return logger;
	}

	public static Lang getLang() {
		if (lang == null)
			lang = new Lang(Reference.MOD_ID);
		return lang;
	}
}
