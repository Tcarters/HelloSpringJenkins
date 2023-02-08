package com.Tcarters.HelloSpringJenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import static org.junit.Assert.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@RunWith(SpringRunner.class)
@SpringBootTest
class HelloSpringJenkinsApplicationTests {

	
	public static Logger logger =LoggerFactory.getLogger(HelloSpringJenkinsApplicationTests.class );

	@Test
	 void contextLoads() {  // To test fail build just remove  `void`
		logger.info("Test case executing....");
		// see if true
		//logger.info("Test case executing. Second build for false positive failed ...");

		logger.info("Test Pipeline execution  ...");
assertEquals(true, true);
	}

}
