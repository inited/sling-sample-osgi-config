package cz.inited.sample;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(service = ServiceProvider.class)
public class ServiceProvider {

	@Activate
    void activate() {
        System.out.println("ServiceProvider activated");
    }
 
    @Deactivate
    void deactivate() {
        System.out.println("ServiceProvider deactivated");
    }
    
    public void simpleOperation(String msg) {
        System.out.println("simpleOperation:" + msg);
    }

}
