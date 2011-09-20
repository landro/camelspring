package no.bekk.open;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileToFileRoute extends SpringRouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:data/inbox").bean(FileHeaderInfo.class).bean(RoutingSlip.class);
	}

}
