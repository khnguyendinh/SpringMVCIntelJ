package annotation.AOP.vn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by KHOAND on 11/24/2017.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(    new String[] { "file:web/WEB-INF/Spring-Customer.xml" });

        Service cust = (Service) appContext.getBean("customerServiceProxy");
        cust.execute();
    }
}
