package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calc calc1 = (Calc) context.getBean("calcAdd"); //부모 = 자식
		calc1.calculate(25,36);
		Calc calc2 = context.getBean("calcMul", Calc.class); //부모 = 자식
		calc2.calculate(25,36);

	}

}
