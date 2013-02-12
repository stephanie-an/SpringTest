package helloworld;

/**
 * Created by IntelliJ IDEA.
 * User: owner
 * Date: 2/11/13
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
	}
}
