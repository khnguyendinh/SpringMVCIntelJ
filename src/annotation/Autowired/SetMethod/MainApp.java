package annotation.Autowired.SetMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:web/WEB-INF/AutowireSet.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	}

}
