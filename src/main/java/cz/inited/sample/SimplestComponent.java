package cz.inited.sample;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component
public class SimplestComponent {
    @Activate
    void activate() {
        System.out.println("SimplestComponent activated");
    }
 
    @Deactivate
    void deactivate() {
        System.out.println("SimplestComponent deactivated");
    }
 
}
