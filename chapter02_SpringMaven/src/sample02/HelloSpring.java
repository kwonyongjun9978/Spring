package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calc1 = (Calc) context.getBean("calcAdd");
		calc1.calculate();
		Calc calc2 = (Calc) context.getBean("calcMul");
		calc2.calculate();
	}

}
