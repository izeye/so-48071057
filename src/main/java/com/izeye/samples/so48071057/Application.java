package com.izeye.samples.so48071057;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Sample application for https://stackoverflow.com/questions/48071057/cant-read-yamls-complex-object-using-configurationproperties-integer-cannot.
 *
 * @author Johnny Lim
 */
@SpringBootApplication
@EnableConfigurationProperties(WebConfigProperty.class)
public class Application implements CommandLineRunner {

	@Autowired
	private WebConfigProperty webConfigProperty;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.webConfigProperty);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
