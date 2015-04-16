package vn.rivercrane.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import vn.rivercrane.entity.User;
import vn.rivercrane.service.UserSerivce;

@Controller
@Path("/user")
public class UserAPI {
	
	@Autowired
	private UserSerivce userSerivce;

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserList(){
		List<User> userList = userSerivce.getAllUser();
		if(userList != null && userList.size() > 0){
			return Response.ok(userList.toArray(new User[userList.size()])).build();
		}
		return Response.ok("error").build();
	}
}
