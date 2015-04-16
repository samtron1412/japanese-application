package vn.rivercrane.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import vn.rivercrane.dto.TestJaxB;

/**
 * Test API
 * @author Ha.Thanh
 *
 */

@Path("/test")
public class HelloAPI {
	
	@GET	
	@Path("/jaxB")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJaxB() {
		TestJaxB test = new TestJaxB();
		test.setId("this is Id");
		test.setMessage("This is message");
		test.setGood(true);
		
		return Response.status(200).entity(test).build();
 
	}	
}
