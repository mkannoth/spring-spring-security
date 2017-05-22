package com.ecommerce.application.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

//The SecurityWebApplicationInitializer will do the following things:
//Automatically register the springSecurityFilterChain Filter for every URL in your application
//Add a ContextLoaderListener that loads the WebSecurityConfig.

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
	
	public SecurityWebApplicationInitializer() {
		super(WebSecurityConfig.class);
	}

}
