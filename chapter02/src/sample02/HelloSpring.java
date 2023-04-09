package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calc1 = (Calc) context.getBean("calcAdd");
		calc1.calculate();
		calc1.calculate(6);
		calc1.calculate(6,9);
		Calc calc2 = (Calc) context.getBean("calcMul");
		calc2.calculate();
		calc2.calculate(6);
		calc2.calculate(6,9);
	}

}
