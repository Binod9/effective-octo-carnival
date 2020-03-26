import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.util.HashMap;

public class Test03_POST {
	
	
	 @Test
		
	 void Test_POST() {
		 
	/*HashMap<String,Object>map=new HashMap<String,Object>();
	
	map.put("first_name","Janet1");
	map.put("email","anet.weaver@reqres1.in");
	System.out.println(map);*/
	
	
	//without using map Create JSONObject using 
		 
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
	post("https://reqres.in/api/users/2").
	then().
	statusCode(201).
	log().all();
	
	
	
	
	
	
    	 

}
}
