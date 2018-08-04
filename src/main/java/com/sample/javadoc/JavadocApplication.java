package com.sample.javadoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavadocApplication {

	/*
	 * https://www.mkyong.com/maven/generate-javadoc-jar-for-maven-based-project/
	 * 
	 * Do a mvn install to generate java doc for the project. Build should be
	 * success. go to target > apidocs or check if a jar file associated with the
	 * javadoc got generated.
	 * 
	 * <maven.test.skip>true</maven.test.skip>
	 */

	public static void main(String[] args) {
		SpringApplication.run(JavadocApplication.class, args);
	}
}
