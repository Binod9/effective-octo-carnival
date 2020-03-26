import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test04_DELET {
	

	 @Test
		
	 void Test_Delet() {
		 
		 
		 JSONObject request=new JSONObject();
			
			request.put("first_name","Janet1");
			request.put("email","anet.weaver@reqres1.in");
			
			System.out.println(request);
			System.out.println(request.toJSONString());
			given().
			
			header("contenttype"," application/Json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
			

			when().
			delete("https://reqres.in/api/users/2").
			then().
			statusCode(201).
			log().all();
			
	 }

}
