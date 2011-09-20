package no.bekk.open;

import java.util.Map;
import java.util.Set;

import org.apache.camel.Handler;
import org.apache.camel.Headers;
import org.springframework.stereotype.Component;

@Component
public class FileHeaderInfo {

	@Handler
	public void printHeaderInfo(@Headers Map<String,Object> headers) {
		
		Set<String> headerNames = headers.keySet();
		
		for (String headerName : headerNames) {
			System.out.println(headerName);
			System.out.println(headers.get(headerName));
		}
		
	}
	
}
