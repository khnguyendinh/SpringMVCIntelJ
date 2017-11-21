package annotation.Autowired.WithOption;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by KHOAND on 11/21/2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:web/WEB-INF/AutowireWithOption.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("name : "+student.getName());
        System.out.println("Age : "+student.getAge());
    }
}
