package com.sample.javadoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample controller for java doc generation
 * 
 * @author adhithyan
 *
 */
@RestController
public class TestController {

	
	/**
	 * @author adhithyan
	 *  
	 * @return <b>String</b>
	 */
	@GetMapping("/test")
	public String get() {
		
		return "test";
	}
}
