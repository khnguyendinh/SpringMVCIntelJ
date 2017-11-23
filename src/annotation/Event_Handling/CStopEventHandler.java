package annotation.Event_Handling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * Created by KHOAND on 11/23/2017.
 */
public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {

    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent Received");
    }
}
