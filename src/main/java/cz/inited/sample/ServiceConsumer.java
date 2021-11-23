package cz.inited.sample;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component
public class ServiceConsumer {
	
	@Reference
	ServiceProvider serviceProvider;
	
    @Activate
    void activate() {
        System.out.println("ServiceConsumer activated");
        serviceProvider.simpleOperation("From ServiceConsumer activate");
    }
 
    @Deactivate
    void deactivate() {
        System.out.println("ServiceConsumer deactivated");
    }
    
    public void simpleOperation(String msg) {
        System.out.println("simpleOperation:" + msg);
    }
    
  
}
