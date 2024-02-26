package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	@PostConstruct
	public void intt(){
		logger.info("Application Started.....");
	}

	public static void main(String[] args) {
		logger.info("Application running.....");
		ConfigurableApplicationContext = SpringApplication.run(DemoApplication.class, args);
		Alien a = context.getBean(Alien.class);
		a.show();
	}

}
