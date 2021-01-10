package pl.kprwdm.SimpleBlog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SimpleBlogApplication extends SpringBootServletInitializer {

	private static final Logger logger = LogManager.getLogger(SimpleBlogApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SimpleBlogApplication.class, args);
	}

}
