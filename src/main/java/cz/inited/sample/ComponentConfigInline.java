package cz.inited.sample;


import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;


@Component

@Designate(
    ocd = ComponentConfigInline.Config.class
)
public class ComponentConfigInline {

    @Activate
    protected final void activate(Config config) {
    	System.out.println("ComponentConfigInline activated: " + config.booleanProperty());
    }

    @Modified
    protected final void modify(Map<String, Object> properties) {
    	System.out.println("ComponentConfigInline modified: " + properties);
    }

    @Deactivate
    protected void deactivate() {
    }
    
    
    @ObjectClassDefinition(name = "Component Config demo - inline")
    public @interface Config {

        @AttributeDefinition(
            name = "Boolean Property",
            description = "Sample boolean value",
            type = AttributeType.BOOLEAN
        )
        boolean booleanProperty() default true;
    }
    
}
