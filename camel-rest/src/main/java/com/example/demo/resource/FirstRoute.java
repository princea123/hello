package com.example.demo.resource;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FirstRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		 from("direct:hello")
		 	.log("Received request for /api/hello")
	        .setBody(constant("Hello, World!"));
		
	}

}
