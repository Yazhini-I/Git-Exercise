package JavaRestClients;

import io.restassured.response.Response;

import org.json.simple.JSONObject;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class SpaceXrest {
	public static void main(String args[]) throws JsonMappingException, JsonProcessingException {
		 String url = "https://api.spacexdata.com/v4/rockets";
		String data = given()
		.header("accept", "data/json")
		.log().everything()
		.get(url)
		.body()
		.asString();
		System.out.println(data);
		ObjectMapper mapper=new ObjectMapper();
		List<space> SpaceXrest=mapper.readValue(data,new TypeReference<List<space>>(){});
		SpaceXrest.forEach(System.out::println);
		}
}