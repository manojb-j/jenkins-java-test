package com.SpringTest.demo3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo3ApplicationTests {

	public static final Logger logger = LoggerFactory.getLogger(Demo3ApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("CI/CD test class comment");
		assertEquals(true, true);
	}

}
