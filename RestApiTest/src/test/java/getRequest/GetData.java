package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class GetData {
	
	String api = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22" ;
	
	@Test
	public void testResponseCode()
	{
	int code = get(api).getStatusCode();
	System.out.println("code: "+ code );
	Assert.assertEquals(code,200);
		
	}
	
	@Test
	public void testBody()
	{
		Long time = get(api).getTime();
		System.out.println("ResposeTime "+ time);
	}
	
	@Test
	public void GetWeatherDetails()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response= httpRequest.request(Method.GET,"/Hyderabad");
		
		String responseBody = response.getBody().asString();
		System.out.println("response body: "+responseBody);
		
	}

}
