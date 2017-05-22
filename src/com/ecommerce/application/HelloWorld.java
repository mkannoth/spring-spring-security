package com.ecommerce.application;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/success")
public class HelloWorld {
	
	@POST
	public Response getMsg() {

		String output = "Authentication Success";

		return Response.status(200).entity(output).build();

	}

}
