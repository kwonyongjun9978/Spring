package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MessageBean bean1 = (MessageBean) context.getBean("messageBean");
		bean1.sayHello("Spring");
		
		MessageBean bean2 = (MessageBean) context.getBean("messageBean");
		bean2.sayHello("Spring");
		
		MessageBean bean3 = (MessageBean) context.getBean("messageBean");
		bean3.sayHello("Spring");
	}

}
