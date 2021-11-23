package cz.inited.sample;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;


@Component(
    property = {
        "message=Welcome to the inline configured service",
        "iteration:Integer=3"
    }
)

public class ComponentConfigStatic {

	@Activate
	void activate(Map<String, Object> properties) {
		
		System.out.println("StaticConfiguredComponent configuration:");
		for(String key:properties.keySet()) {
			System.out.println(key + ": " + properties.get(key));
		}
		System.out.println();

		String msg = (String) properties.get("message");
		Integer iter = (Integer) properties.get("iteration");

	}
}