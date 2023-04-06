package JavaRestClients;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Pastrymain {
	public static void main(String[]args) throws StreamReadException, DatabindException, IOException
	{
		ObjectMapper objectmapper=new ObjectMapper();
		List<Pastry> pastry=objectmapper.readValue(new File("src/main/resources/pastry.json"),  
				new TypeReference<List<Pastry>>() {});
		
		pastry.forEach(System.out::println);
		
		}

}
