package annotation.CustomEvents;

import org.springframework.context.ApplicationListener;

/**
 * Created by KHOAND on 11/24/2017.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString()+"1111");
    }
}
