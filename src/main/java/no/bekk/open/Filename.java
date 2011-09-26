package no.bekk.open;

import org.apache.camel.Handler;
import org.apache.camel.Header;
import org.springframework.stereotype.Component;

@Component("filename")
public class Filename {
	
	@Handler
	public String filename(@Header("camelfilename") String filename) {
		return "filenameprefix" + filename;
	}

}
