import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;


public class Test02_Get {

     @Test
	
	 void Test_get() {
    	 
    	 given().
    	 get("https://reqres.in/api/users/2").
    	 
    	 then().
    	  statusCode(200).
    	  body("data.id[0]",equalTo(2)).
    	  body("data.firstname",hasItems("janet")).
    	  log().all();
    	 
    	 
    	 
     }
}
