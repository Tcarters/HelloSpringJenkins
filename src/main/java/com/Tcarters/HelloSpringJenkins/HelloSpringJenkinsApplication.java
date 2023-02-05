package com.Tcarters.HelloSpringJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;

@SpringBootApplication
public class HelloSpringJenkinsApplication {

	public static Logger logger =LoggerFactory.getLogger(HelloSpringJenkinsApplication.class );

	//Init method
	@PostConstruct
	public void initiated( ) {
		logger.info("Application started ....");
	}

	public static void main(String[] args) {
		logger.info("Application executed ...");
		SpringApplication.run(HelloSpringJenkinsApplication.class, args);
	}

}
