import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_Get {
	
	@Test
	
	void get() {
	
   Response response = RestAssured.get("https://reqres.in/api/users/2");
   System.out.println(response.asString());
   System.out.println(response.getBody().asString());
   System.out.println(response.getStatusLine());
   System.out.println(response.getStatusCode());
   System.out.println(response.getHeader("Content-type"));
   System.out.println(response.getTime()); 
   
}
}