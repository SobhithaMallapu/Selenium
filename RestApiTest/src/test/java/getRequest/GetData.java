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
	
	@Test
	public void testGetRequest()
	{
		
		String api1 = "https://flobizhiring-57e6.restdb.io/rest/issues";
		int code = get(api1).getStatusCode();
		System.out.println("Status Code: " + code);
		Assert.assertEquals(code, 200);
		
		RestAssured.baseURI = "https://flobizhiring-57e6.restdb.io/rest";
		RequestSpecification httpRequest = RestAssured.given();
		//setting header
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("x-apikey","5da6fb5d3cbe87164d4bb35d");
		Response response= httpRequest.request(Method.GET,"/issues");
		
		String responseBody = response.getBody().asString();
		System.out.println("response body: "+responseBody);
	}
	
	@Test
	public void testGetRequest2()
	{
		RestAssured.baseURI = "https://flobizhiring-57e6.restdb.io/rest/issues?id=588893fbf54b5f59000003ce";
		RequestSpecification httpRequest = RestAssured.given();	
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("x-apikey","5da6fb5d3cbe87164d4bb35d");
Response response= httpRequest.request(Method.GET,"/issues?id=588893fbf54b5f59000003ce");
		
		String responseBody = response.getBody().asString();
		System.out.println("response body: "+responseBody);
	}
	
	@Test
	public void testPostRequest()
	{
		RestAssured.baseURI = "https://flobizhiring-57e6.restdb.io/rest";
		RequestSpecification httpRequest = RestAssured.given();	
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("x-apikey","5da6fb5d3cbe87164d4bb35d");
		httpRequest.header("content-type","application/json; charset=utf-8");
		httpRequest.header("etag","W/\"a1-+4LB6vyLbTYsD7IEyiqUpctyLms\"");
		Response response= httpRequest.request(Method.POST,"/issues");
		
		String responseBody = response.getBody().asString();
		System.out.println("response body: "+responseBody);
		
	}
	
	
	

}





























