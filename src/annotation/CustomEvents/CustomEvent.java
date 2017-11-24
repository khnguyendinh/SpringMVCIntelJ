package annotation.CustomEvents;

import org.springframework.context.ApplicationEvent;

/**
 * Created by KHOAND on 11/24/2017.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    public String toString(){
        return "My Custom Event";
    }
}
