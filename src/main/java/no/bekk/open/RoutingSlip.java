package no.bekk.open;

import org.apache.camel.Header;
import org.springframework.stereotype.Component;

@Component
public class RoutingSlip {

	@org.apache.camel.RoutingSlip
	public String slip(@Header("camelfilename") String filename) {
		
		String newFilename = "prefix" + filename;
		return "file:data/outbox?fileName=" + newFilename;
		
	}
	
}
