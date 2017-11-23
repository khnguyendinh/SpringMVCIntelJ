package annotation.JavaBasedConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by KHOAND on 11/21/2017.
 */
public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("Your message "+message);
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
