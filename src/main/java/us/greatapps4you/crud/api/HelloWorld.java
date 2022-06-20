package us.greatapps4you.crud.api;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("hello")
@RequestScoped
public class HelloWorld {

	@GET
	public String hello() {
		return "Heloo jakarta EE";
	}

}
