package com.example.venkatfeign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

	@Autowired
	GreetingClient greetingClient;

	@GetMapping("/getgreeting")
	public String greeting(@RequestParam(value = "message", required = true) String message) {
		/*  model.addAttribute("greeting", greetingClient.greeting());
	        return "greeting-view";*/
		LOGGER.info("message={}", "Before Calling getgreeting");



		/*String greeting = this.restTemplate.getForObject("https://venkatfirst/greeting?message="+message, String.class);
		LOGGER.info("message={}", "After Calling get-greeting" +greeting );
		return 	greeting;	*/
		return greetingClient.greeting(message);
		//return "Good "+message;
	}


	@RequestMapping("/name")
	public String name(@RequestParam(value = "message", required = true) String message) {

		System.out.println("testing::"+message);
		return 	"Checking:: "+message;	

	}
	
	
}
