package annotation.JSR250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by KHOAND on 11/21/2017.
 */
public class HelloWorld {
    private String message;

    public String getMessage() {
        System.out.println("Your message "+message);
        return message;
    }
    @PostConstruct
    public void init() {
        System.out.println("Bean is going through init");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Bean will destroy now");
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
