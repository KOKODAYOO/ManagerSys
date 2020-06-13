package cn.tiangong.tool;

import org.apache.log4j.Logger;
import org.junit.Test;

public class Log {
	private static Logger logger = Logger.getLogger(Logger.class.getClass());
	
	@Test
	public void testLog(){
		logger.info("info");
	}
	
}
