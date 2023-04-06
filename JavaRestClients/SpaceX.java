package JavaRestClients;

import java.io.IOException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.List;

public class SpaceX {
	 static final String URL="https://api.spacexdata.com/v4/rockets";
	public static void main(String[] args) throws IOException, InterruptedException
	{
		HttpClient client=HttpClient.newHttpClient();
		HttpRequest request=HttpRequest.newBuilder().GET().header("Get", "response/JSON")
				.uri(URI.create(URL)).build();
		HttpResponse <String> response=client.send(request,HttpResponse.BodyHandlers.ofString() );
		ObjectMapper objectmapper=new ObjectMapper();
		List<space> Space=objectmapper.readValue(response.body(),new TypeReference<List<space>>(){});
		System.out.println(response.body());
		Space.forEach(System.out::println);
		
	}

}

 
