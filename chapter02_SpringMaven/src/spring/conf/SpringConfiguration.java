package spring.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;

//bean을 생성해주는 환경설정 java파일(=applicationContext.xml)

@Configuration
public class SpringConfiguration {

	//sample01
	@Bean 
	public MessageBeanImpl messageBeanImpl(){
		return new MessageBeanImpl("사과");
	}
	
	//sample02
	@Bean 
	public CalcAdd calcAdd(){
		return new CalcAdd(22,55);
	}
	
//	@Bean 
//	public CalcMul calcMul(){
//		return new CalcMul();
//	}
	
	@Bean(name="calcMul")
	public CalcMul getCalcMul() {
		return new CalcMul();
	}
}

/*
@Bean
- 메소드에서 return되는 값을 Bean으로 생성해준다.
- 메소드의 이름은 반드시 Bean의 id명으로 만들어야 한다.
*/