package com.Tcarters.HelloSpringJenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class HelloSpringJenkinsApplicationTests {

	
	public static Logger logger =LoggerFactory.getLogger(HelloSpringJenkinsApplicationTests.class );

	@Test
	void contextLoads() {
		logger.info("Test case executing....")
		// see if true
		assertEquals(true, true);
	}

}
