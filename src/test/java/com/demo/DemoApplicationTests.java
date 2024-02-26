package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(DemoApplication,class);
	@Test
	void contextLoads() {
		logger.infi("test case executing");
		assertEquals(true,true);
	}

}
