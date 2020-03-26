import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test05_Put {

	@Test
	
	 void Test_Put() {
		 JSONObject request=new JSONObject();
			
			request.put("first_name","Monaj");
			request.put("email","Binodsahu@gmail.com");
			
			System.out.println(request);
			System.out.println(request.toJSONString());
			given().
			
			header("contenttype"," application/Json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
			

			when().
			put("https://reqres.in/api/users/2").
			then().
			statusCode(201).
			log().all();
			
	}
		 
	
	
}
